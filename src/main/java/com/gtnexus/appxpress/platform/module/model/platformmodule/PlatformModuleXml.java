//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.06.24 at 04:32:19 PM EDT 
//

package com.gtnexus.appxpress.platform.module.model.platformmodule;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * <p>
 * Java class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}__metadata"/>
 *         &lt;element ref="{}moduleId"/>
 *         &lt;element ref="{}createTimestamp"/>
 *         &lt;element ref="{}modifyTimestamp"/>
 *         &lt;element ref="{}authorId"/>
 *         &lt;element ref="{}authorType"/>
 *         &lt;element ref="{}ownerId"/>
 *         &lt;element ref="{}ownerType"/>
 *         &lt;element ref="{}name"/>
 *         &lt;element ref="{}description"/>
 *         &lt;element ref="{}customUiConfiguration" maxOccurs="unbounded"/>
 *         &lt;element ref="{}notificationTopic" maxOccurs="unbounded"/>
 *         &lt;element ref="{}userVersion"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "metadata", "moduleId", "createTimestamp", "modifyTimestamp", "authorId",
	"authorType", "ownerId", "ownerType", "name", "description", "customUiConfiguration", "notificationTopic",
	"userVersion" })
public class PlatformModuleXml {

    @XmlElement(name = "__metadata", required = true)
    protected Metadata metadata;
    @XmlElement(required = true)
    protected BigInteger moduleId;
    @XmlElement(required = true)
    protected String createTimestamp;
    @XmlElement(required = true)
    protected String modifyTimestamp;
    @XmlElement(required = true)
    protected BigInteger authorId;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String authorType;
    @XmlElement(required = true)
    protected BigInteger ownerId;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String ownerType;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String name;
    @XmlElement(required = true)
    protected String description;
    @XmlElement(required = true)
    protected List<CustomUiConfiguration> customUiConfiguration;
    @XmlElement(required = true)
    protected List<NotificationTopic> notificationTopic;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String userVersion;

    /**
     * Gets the value of the metadata property.
     * 
     * @return possible object is {@link Metadata }
     * 
     */
    public Metadata getMetadata() {
	return metadata;
    }

    /**
     * Sets the value of the metadata property.
     * 
     * @param value
     *            allowed object is {@link Metadata }
     * 
     */
    public void setMetadata(Metadata value) {
	this.metadata = value;
    }

    /**
     * Gets the value of the moduleId property.
     * 
     * @return possible object is {@link BigInteger }
     * 
     */
    public BigInteger getModuleId() {
	return moduleId;
    }

    /**
     * Sets the value of the moduleId property.
     * 
     * @param value
     *            allowed object is {@link BigInteger }
     * 
     */
    public void setModuleId(BigInteger value) {
	this.moduleId = value;
    }

    /**
     * Gets the value of the createTimestamp property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getCreateTimestamp() {
	return createTimestamp;
    }

    /**
     * Sets the value of the createTimestamp property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setCreateTimestamp(String value) {
	this.createTimestamp = value;
    }

    /**
     * Gets the value of the modifyTimestamp property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getModifyTimestamp() {
	return modifyTimestamp;
    }

    /**
     * Sets the value of the modifyTimestamp property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setModifyTimestamp(String value) {
	this.modifyTimestamp = value;
    }

    /**
     * Gets the value of the authorId property.
     * 
     * @return possible object is {@link BigInteger }
     * 
     */
    public BigInteger getAuthorId() {
	return authorId;
    }

    /**
     * Sets the value of the authorId property.
     * 
     * @param value
     *            allowed object is {@link BigInteger }
     * 
     */
    public void setAuthorId(BigInteger value) {
	this.authorId = value;
    }

    /**
     * Gets the value of the authorType property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getAuthorType() {
	return authorType;
    }

    /**
     * Sets the value of the authorType property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setAuthorType(String value) {
	this.authorType = value;
    }

    /**
     * Gets the value of the ownerId property.
     * 
     * @return possible object is {@link BigInteger }
     * 
     */
    public BigInteger getOwnerId() {
	return ownerId;
    }

    /**
     * Sets the value of the ownerId property.
     * 
     * @param value
     *            allowed object is {@link BigInteger }
     * 
     */
    public void setOwnerId(BigInteger value) {
	this.ownerId = value;
    }

    /**
     * Gets the value of the ownerType property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getOwnerType() {
	return ownerType;
    }

    /**
     * Sets the value of the ownerType property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setOwnerType(String value) {
	this.ownerType = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getName() {
	return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setName(String value) {
	this.name = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getDescription() {
	return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setDescription(String value) {
	this.description = value;
    }

    /**
     * Gets the value of the customUiConfiguration property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
     * for the customUiConfiguration property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getCustomUiConfiguration().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomUiConfiguration }
     * 
     * 
     */
    public List<CustomUiConfiguration> getCustomUiConfiguration() {
	if (customUiConfiguration == null) {
	    customUiConfiguration = new ArrayList<CustomUiConfiguration>();
	}
	return this.customUiConfiguration;
    }

    /**
     * Gets the value of the notificationTopic property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
     * for the notificationTopic property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getNotificationTopic().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NotificationTopic }
     * 
     * 
     */
    public List<NotificationTopic> getNotificationTopic() {
	if (notificationTopic == null) {
	    notificationTopic = new ArrayList<NotificationTopic>();
	}
	return this.notificationTopic;
    }

    /**
     * Gets the value of the userVersion property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getUserVersion() {
	return userVersion;
    }

    /**
     * Sets the value of the userVersion property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setUserVersion(String value) {
	this.userVersion = value;
    }

}
