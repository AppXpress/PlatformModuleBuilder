//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.06.22 at 04:47:37 PM EDT 
//

package com.gtnexus.appxpress.platform.module.model.platformmodule;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the
 * com.gtnexus.appxpress.platform.module.model.platformmodule package.
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

    private final static QName _PlatformModule_QNAME = new QName("", "PlatformModule");
    private final static QName _PlatformModule400_QNAME = new QName("", "PlatformModule400");

    private final static QName _OwnerType_QNAME = new QName("", "ownerType");
    private final static QName _Role_QNAME = new QName("", "role");
    private final static QName _Suppressible_QNAME = new QName("", "suppressible");
    private final static QName _AuthorType_QNAME = new QName("", "authorType");
    private final static QName _Description_QNAME = new QName("", "description");
    private final static QName _TargetType_QNAME = new QName("", "targetType");
    private final static QName _Type_QNAME = new QName("", "type");
    private final static QName _OwnerId_QNAME = new QName("", "ownerId");
    private final static QName _AuthorId_QNAME = new QName("", "authorId");
    private final static QName _NotificationDeliveryMethod_QNAME = new QName("", "notificationDeliveryMethod");
    private final static QName _CreateTimestamp_QNAME = new QName("", "createTimestamp");
    private final static QName _ModifyTimestamp_QNAME = new QName("", "modifyTimestamp");
    private final static QName _Uid_QNAME = new QName("", "uid");
    private final static QName _ApiVersion_QNAME = new QName("", "apiVersion");
    private final static QName _Fingerprint_QNAME = new QName("", "fingerprint");
    private final static QName _Name_QNAME = new QName("", "name");
    private final static QName _UiType_QNAME = new QName("", "uiType");
    private final static QName _TopicName_QNAME = new QName("", "topicName");
    private final static QName _GlobalObjectType_QNAME = new QName("", "globalObjectType");
    private final static QName _UserVersion_QNAME = new QName("", "userVersion");
    private final static QName _ModuleId_QNAME = new QName("", "moduleId");
    private final static QName _DirectoryName_QNAME = new QName("", "directoryName");
    private final static QName _Status_QNAME = new QName("", "status");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema
     * derived classes for package: platformmodule
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link NotificationConfiguration }
     * 
     */
    public NotificationConfiguration createNotificationConfiguration() {
	return new NotificationConfiguration();
    }

    /**
     * Create an instance of {@link Metadata }
     * 
     */
    public Metadata createMetadata() {
	return new Metadata();
    }

    /**
     * Create an instance of {@link PlatformModuleXml }
     * 
     */
    // public PlatformModuleXml createPlatformModule() {
    // return new PlatformModuleXml();
    // }

    /**
     * Create an instance of {@link CustomUiConfiguration }
     * 
     */
    public CustomUiConfiguration createCustomUiConfiguration() {
	return new CustomUiConfiguration();
    }

    /**
     * Create an instance of {@link NotificationTopic }
     * 
     */
    public NotificationTopic createNotificationTopic() {
	return new NotificationTopic();
    }

    @XmlElementDecl(namespace = "", name = "PlatformModule")
    public JAXBElement<PlatformModuleXml> createPlatformModule(PlatformModuleXml value) {
	return new JAXBElement<PlatformModuleXml>(_PlatformModule_QNAME, PlatformModuleXml.class, null, value);
    }

    @XmlElementDecl(namespace = "", name = "PlatformModule400")
    public JAXBElement<PlatformModuleXml> createPlatformModule400(PlatformModuleXml value) {
	return new JAXBElement<PlatformModuleXml>(_PlatformModule400_QNAME, PlatformModuleXml.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ownerType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createOwnerType(String value) {
	return new JAXBElement<String>(_OwnerType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "role")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createRole(String value) {
	return new JAXBElement<String>(_Role_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "suppressible")
    public JAXBElement<Boolean> createSuppressible(Boolean value) {
	return new JAXBElement<Boolean>(_Suppressible_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "authorType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createAuthorType(String value) {
	return new JAXBElement<String>(_AuthorType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "description")
    public JAXBElement<String> createDescription(String value) {
	return new JAXBElement<String>(_Description_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "targetType")
    public JAXBElement<String> createTargetType(String value) {
	return new JAXBElement<String>(_TargetType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "type")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createType(String value) {
	return new JAXBElement<String>(_Type_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger
     * }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ownerId")
    public JAXBElement<BigInteger> createOwnerId(BigInteger value) {
	return new JAXBElement<BigInteger>(_OwnerId_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger
     * }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "authorId")
    public JAXBElement<BigInteger> createAuthorId(BigInteger value) {
	return new JAXBElement<BigInteger>(_AuthorId_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "notificationDeliveryMethod")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createNotificationDeliveryMethod(String value) {
	return new JAXBElement<String>(_NotificationDeliveryMethod_QNAME, String.class, null, value);
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
    @XmlElementDecl(namespace = "", name = "apiVersion")
    public JAXBElement<BigInteger> createApiVersion(BigInteger value) {
	return new JAXBElement<BigInteger>(_ApiVersion_QNAME, BigInteger.class, null, value);
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
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createName(String value) {
	return new JAXBElement<String>(_Name_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "uiType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createUiType(String value) {
	return new JAXBElement<String>(_UiType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "topicName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createTopicName(String value) {
	return new JAXBElement<String>(_TopicName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "globalObjectType")
    public JAXBElement<String> createGlobalObjectType(String value) {
	return new JAXBElement<String>(_GlobalObjectType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "userVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createUserVersion(String value) {
	return new JAXBElement<String>(_UserVersion_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger
     * }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "moduleId")
    public JAXBElement<BigInteger> createModuleId(BigInteger value) {
	return new JAXBElement<BigInteger>(_ModuleId_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "directoryName")
    public JAXBElement<String> createDirectoryName(String value) {
	return new JAXBElement<String>(_DirectoryName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "status")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createStatus(String value) {
	return new JAXBElement<String>(_Status_QNAME, String.class, null, value);
    }

}
