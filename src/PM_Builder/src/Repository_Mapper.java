import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import net.lingala.zip4j.core.ZipFile;
import net.lingala.zip4j.exception.ZipException;
import net.lingala.zip4j.model.ZipParameters;
import net.lingala.zip4j.util.Zip4jConstants;

/*
 * 	Take pulled Git repository and map to a file structure
 *  that can be imported onto Platform
 *  
 *  Assumed Repository structure is that shown in SourceControlFolderFileMappings excel
 *  sheet
 *  
 *  Program will malfunction/produce unexpected unimportable results if Git folder
 *  structure is different.
 */
public class Repository_Mapper {
	
	public static void map( String src ){
		try{
			System.out.println("IT MAPS HERE");
			File root = new File( src );
			if( ! root.exists() )
				System.out.println("do existo");
			//Renames files/folders to importable names
			prepareImport( src );
			//Bundles up multiple scripts into compressed file
			createBundles( src );	
		}
		catch(Exception e){
			System.err.println("Cannot find file");
		}
	}
	/*
	 * Searches through platform module and renames specific 
	 * folders and files so that they can be properly imported.
	 * 
	 * Mostly, adds $ signs where they belong to files and folders
	 * 
	 * @param	String	src		- Path of Platform Module
	 */
	private static void prepareImport( String src ){
		File platform = new File ( src );
		for( String subFolder : platform.list() ){
			String path = src + "/" + subFolder ; 
			fixTopFolder( path );
		}
	}
	private static void fixTopFolder( String p ){
		if( p.endsWith("CustomLinkD1")){
			renameFile( p , "$CustomLinkD1");
		}
		else if ( p.endsWith("TypeExtensionD1"))
			renameFile( p , "$TypeExtensionD1");
		else if ( p.endsWith("CustomObjectModule"))
			fixCOModule( p );
		else if ( p.endsWith("customUi")){
			File customUi = new File( p );
			for( String bundle : customUi.list() ){
				File design = new File( p + "/" + bundle);
				for( String d : design.list() )
					renameFile( p + "/" + bundle + "/" + d, "$" + d);
			}
		}		
	}
	
	private static void createBundles( String src ){
		File r = new File ( src );
		for( String folderName : r.list()){
			System.out.println("runner " + folderName);
			String path = src + "/" + folderName;
			if( new File(path).isDirectory() )
				searchSubFolder( path );
				
		}
	}
	
	private static void searchSubFolder( String name ){
		File f = new File( name );
		//Special handling for CustomObjectModule/designs/Scripts folder
		String pathHandle = f.getAbsolutePath().toLowerCase();
		String platformIndependent = "customobjectmodule" + File.separator + "designs" 
				+ File.separator + "scripts";
		if( pathHandle.contains(platformIndependent)){
			handleCODesignScripts( name );
			return;
		}
		System.out.println(name);
		//Special handling for customUi fef bundle
		if( name.endsWith("/customUi")){
			handleFef( name );
			//emptyDir( name ); 
			return;
		}
		
		//Count number of .js files - if greater than 1, zip em up		
		int jsCount = 0;
		for(String folderName : f.list() ){
			String path = name + "/" + folderName;
			if( isJavaScriptFile( folderName ) && !(isZipDir(name)))
				jsCount++;
			if( new File( path ).isDirectory() )
				searchSubFolder( path );
		}
		if( jsCount > 1 ){
			System.out.println( "create bundle ");
			//Creates new bundle folder and returns name
			String bundleFolder = createBundleFolder( name );
			File cur = new File(name);
			for(String s : cur.list() )
				if( isJavaScriptFile(s)){	
					//moveFiles( name + "/" + s , name + "/" + bundleFolder);
					moveFiles( s , name , bundleFolder);
				}
			//Zip up bundle folder
			System.out.println( " " + name + "/" + bundleFolder);
			//Zip up new bundle folder
			ZipUtility zu = new ZipUtility( name + "/" + bundleFolder );
			//Get rid of folder no longer needed
			emptyDir(name + "/" + bundleFolder);
		}
	}
	/*
	 * Set up CO/designs/scripts into correct format
	 * @param	File f		CO/designs/scripts folder
	 */
	private static void handleCODesignScripts(String name) {
		File f = new File(name);
		//Look through CO folders 
		for( String foldername : f.list()){
			System.out.println(foldername + " Foldeah");
			File coFolder = new File( name + "/" + foldername);
			if( ! ( coFolder.isDirectory() ) ){
				continue;
			}
			int fileCount = coFolder.list().length;
			//One js file - ensure its named correctly and move up
			if( fileCount == 1 ){
				String rename = "ScriptDesign_$"+coFolder.getName() + ".js";
				File coJs = coFolder.listFiles()[0];
				boolean a = coJs.renameTo( new File(f.getAbsolutePath() + "/"+rename));
				if( ! a )
					System.err.println("Error with script design files");
				emptyDir( coFolder.getAbsolutePath() );
			}
			//Zip up multiple js files into a bundle - bundle named [Custom Object] 
			if ( fileCount > 1 ){
				String zipName = "ScriptDesign_$"+ foldername;
				boolean reNameFolder = coFolder.renameTo( new File( name + "/" +  
										zipName));
				if( ! reNameFolder )
					System.err.println("Error renaming folder");
				//System.err.println( name + "/" + zipName);
				//System.err.println(zipName);
				ZipUtility zu = new ZipUtility( name + "/"+ zipName );
				//Get rid of folder no longer needed
				emptyDir( name + "/" + zipName );
			}	
		}
		
	}
	private static boolean isJavaScriptFile(String s){
		String sub = s.substring( s.length() - 2);
		if( sub.equals( "js"))
			return true;
		return false;
	}
	private static boolean isZipDir(String s){
		String sub = s.substring( s.length() - 3);
		if( sub.equals( "zip"))
			return true;
		return false;
	}
	private static String createBundleFolder( String parentName ){
		File folder = new File( parentName );
		String [] extractName = parentName.split("/");
		String newFolderName = extractName[ extractName.length-1 ];
		newFolderName = newFolderName.concat("Bundle");
		newFolderName = newFolderName.substring(0,1).toUpperCase().concat(newFolderName.substring(1));
		System.out.println(newFolderName);
		File child = new File( folder, newFolderName);
		child.mkdir();
		return child.getName();
	}
	/*
	 * @param 	fileName 	Name of file to be moved
	 * @param	folderPath	Path of current folder of file
	 * @param	subFolder	Path of folder where file is to be moved
	 * Moves a file into the specified target folder
	 * 		Used for moving js files into a bundle folder
	 */
	private static void moveFiles( String fileName, String folderPath , String subFolder)
	{
		File original = new File(folderPath + "/" + fileName);
		File newFile = new File(folderPath + "/" + subFolder + "/" + fileName);
		boolean move = original.renameTo(newFile);
		if( ! move)
			System.err.println("Did not work");
	}
	/*
	 * Renames a file in the same directory
	 * 
	 * @param	String org		Original file path
	 * @param	String name		New name of file designated by org path
	 */
	private static void renameFile(String org, String name){
		File custom = new File( org );
		Path src = custom.toPath();
		try {
			Files.move(src, src.resolveSibling(name) );
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("File move failed");
		}
	}
	/*
	 * Empty out folder and then delete folder recursively
	 */
	private static void emptyDir(String name){
		File folder = new File(name);
		
		if( folder.isDirectory() ){
			for( String s : folder.list() )
			{
				emptyDir( name + "/" + s );
			}
			folder.delete();
		}
		else{
			folder.delete();
		}			
	}
	private static void handleFef(String name){
		File sub = new File( name );
		for( String s : sub.list() ){
			//If its already a zip, ignore 
			if( s.endsWith(".zip"))
				continue;
			System.out.println("s--- " + s);
			//Zip up fef bundle folder
			new ZipUtility( name + "/" + s );
			//Get rid of folder no longer needed
			emptyDir( name + "/" + s);
		}
	}
	
	/*
	 * Adds $ to designs and scripts inside CustomObjectModule folder
	 */
	private static void fixCOModule ( String path ){
		//Go into desisns
		String designPath = path + "/designs" ;
		File designsFolder = new File( designPath );
		//Fixes xml files
		if( designsFolder.exists() ){
			for( String s : designsFolder.list() ){
				String add = s.replace("Design_", "Design_$");
				renameFile( designPath + "/" + s , add );
			}
		}
		
		//Fixes scripts
		String scriptPath = designPath + "/scripts";
		File scriptFolder = new File( scriptPath );
		if( ! scriptFolder.exists() )
			System.err.println("Cannot find CustomObjectModule/designs/scripts folder");
		else{
			for ( String s : scriptFolder.list() ){
				File f = new File( scriptPath + "/" + s);
				if( f.isDirectory() ){
					for( String y : f.list() ){
						if( y.contains("_$"))
							continue;
						String rep = y.replace("ScriptDesign_" , "ScriptDesign_$");						
						renameFile( scriptPath + "/" + s + "/" + y , rep );
					}
				}
			}
		}
		
		
		//Go into xsd
		String xsdPath = path + "/xsd";
		File xsdFolder = new File( xsdPath );
		if ( ! xsdFolder.exists() )
			System.err.println("Cannot find CustomObjectModule/xsd folder");
		else{
			for ( String s : xsdFolder.list() ){
				// Add $ infront of file name -> rename file
				renameFile( xsdPath + "/" + s , "$" + s );
			}
		}
	}
}
