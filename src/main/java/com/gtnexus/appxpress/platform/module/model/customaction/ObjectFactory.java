//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.06.23 at 01:15:37 PM EDT 
//

package com.gtnexus.appxpress.platform.module.model.customaction;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the
 * com.gtnexus.appxpress.platform.module.model.customaction package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the
 * Java representation for XML content. The Java representation of XML content
 * can consist of schema derived interfaces and classes representing the binding
 * of schema type definitions, element declarations and model groups. Factory
 * methods for each of these are provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _RedirectUrl_QNAME = new QName("", "redirectUrl");
    private final static QName _HasActionFn_QNAME = new QName("", "hasActionFn");
    private final static QName _ExecuteFn_QNAME = new QName("", "executeFn");
    private final static QName _DocType_QNAME = new QName("", "docType");
    private final static QName _Roles_QNAME = new QName("", "roles");
    private final static QName _CreatorId_QNAME = new QName("", "creatorId");
    private final static QName _Oql_QNAME = new QName("", "oql");
    private final static QName _Type_QNAME = new QName("", "type");
    private final static QName _CreateTimestamp_QNAME = new QName("", "createTimestamp");
    private final static QName _ModifyTimestamp_QNAME = new QName("", "modifyTimestamp");
    private final static QName _Uid_QNAME = new QName("", "uid");
    private final static QName _CustomActionId_QNAME = new QName("", "customActionId");
    private final static QName _ApiVersion_QNAME = new QName("", "apiVersion");
    private final static QName _PlatformModuleId_QNAME = new QName("", "platformModuleId");
    private final static QName _PlatformModuleType_QNAME = new QName("", "platformModuleType");
    private final static QName _UserModRev_QNAME = new QName("", "userModRev");
    private final static QName _Fingerprint_QNAME = new QName("", "fingerprint");
    private final static QName _Name_QNAME = new QName("", "name");
    private final static QName _Self_QNAME = new QName("", "self");
    private final static QName _Status_QNAME = new QName("", "status");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema
     * derived classes for package: customaction
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CustomActionD1 }
     * 
     */
    public CustomActionD1 createCUSTOMACTIOND1() {
	return new CustomActionD1();
    }

    /**
     * Create an instance of {@link Metadata }
     * 
     */
    public Metadata createMetadata() {
	return new Metadata();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "redirectUrl")
    public JAXBElement<String> createRedirectUrl(String value) {
	return new JAXBElement<String>(_RedirectUrl_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "hasActionFn")
    public JAXBElement<String> createHasActionFn(String value) {
	return new JAXBElement<String>(_HasActionFn_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "executeFn")
    public JAXBElement<String> createExecuteFn(String value) {
	return new JAXBElement<String>(_ExecuteFn_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "docType")
    public JAXBElement<String> createDocType(String value) {
	return new JAXBElement<String>(_DocType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "roles")
    public JAXBElement<String> createRoles(String value) {
	return new JAXBElement<String>(_Roles_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "creatorId")
    public JAXBElement<String> createCreatorId(String value) {
	return new JAXBElement<String>(_CreatorId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "oql")
    public JAXBElement<String> createOql(String value) {
	return new JAXBElement<String>(_Oql_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "type")
    public JAXBElement<String> createType(String value) {
	return new JAXBElement<String>(_Type_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "createTimestamp")
    public JAXBElement<String> createCreateTimestamp(String value) {
	return new JAXBElement<String>(_CreateTimestamp_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "modifyTimestamp")
    public JAXBElement<String> createModifyTimestamp(String value) {
	return new JAXBElement<String>(_ModifyTimestamp_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger
     * }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "uid")
    public JAXBElement<BigInteger> createUid(BigInteger value) {
	return new JAXBElement<BigInteger>(_Uid_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger
     * }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "customActionId")
    public JAXBElement<BigInteger> createCustomActionId(BigInteger value) {
	return new JAXBElement<BigInteger>(_CustomActionId_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger
     * }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "apiVersion")
    public JAXBElement<BigInteger> createApiVersion(BigInteger value) {
	return new JAXBElement<BigInteger>(_ApiVersion_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger
     * }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "platformModuleId")
    public JAXBElement<BigInteger> createPlatformModuleId(BigInteger value) {
	return new JAXBElement<BigInteger>(_PlatformModuleId_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "platformModuleType")
    public JAXBElement<String> createPlatformModuleType(String value) {
	return new JAXBElement<String>(_PlatformModuleType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger
     * }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "userModRev")
    public JAXBElement<BigInteger> createUserModRev(BigInteger value) {
	return new JAXBElement<BigInteger>(_UserModRev_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "fingerprint")
    public JAXBElement<String> createFingerprint(String value) {
	return new JAXBElement<String>(_Fingerprint_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "name")
    public JAXBElement<String> createName(String value) {
	return new JAXBElement<String>(_Name_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "self")
    public JAXBElement<String> createSelf(String value) {
	return new JAXBElement<String>(_Self_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "status")
    public JAXBElement<String> createStatus(String value) {
	return new JAXBElement<String>(_Status_QNAME, String.class, null, value);
    }

}
