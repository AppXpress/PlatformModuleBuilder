//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.06.23 at 01:15:37 PM EDT 
//

package com.gtnexus.appxpress.platform.module.model.customaction;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

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
 *         &lt;element ref="{}apiVersion"/>
 *         &lt;element ref="{}type"/>
 *         &lt;element ref="{}uid"/>
 *         &lt;element ref="{}createTimestamp"/>
 *         &lt;element ref="{}modifyTimestamp"/>
 *         &lt;element ref="{}status"/>
 *         &lt;element ref="{}userModRev"/>
 *         &lt;element ref="{}creatorId"/>
 *         &lt;element ref="{}fingerprint"/>
 *         &lt;element ref="{}redirectUrl"/>
 *         &lt;element ref="{}self"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "apiVersion", "type", "uid", "createTimestamp", "modifyTimestamp", "status",
	"userModRev", "creatorId", "fingerprint", "redirectUrl", "self" })
@XmlRootElement(name = "__metadata")
public class Metadata {

    @XmlElement(required = true)
    protected BigInteger apiVersion;
    @XmlElement(required = true)
    protected String type;
    @XmlElement(required = true)
    protected BigInteger uid;
    @XmlElement(required = true)
    protected String createTimestamp;
    @XmlElement(required = true)
    protected String modifyTimestamp;
    @XmlElement(required = true)
    protected String status;
    @XmlElement(required = true)
    protected BigInteger userModRev;
    @XmlElement(required = true)
    protected String creatorId;
    @XmlElement(required = true)
    protected String fingerprint;
    @XmlElement(required = true)
    protected String redirectUrl;
    @XmlElement(required = true)
    protected String self;

    /**
     * Gets the value of the apiVersion property.
     * 
     * @return possible object is {@link BigInteger }
     * 
     */
    public BigInteger getApiVersion() {
	return apiVersion;
    }

    /**
     * Sets the value of the apiVersion property.
     * 
     * @param value
     *            allowed object is {@link BigInteger }
     * 
     */
    public void setApiVersion(BigInteger value) {
	this.apiVersion = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getType() {
	return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setType(String value) {
	this.type = value;
    }

    /**
     * Gets the value of the uid property.
     * 
     * @return possible object is {@link BigInteger }
     * 
     */
    public BigInteger getUid() {
	return uid;
    }

    /**
     * Sets the value of the uid property.
     * 
     * @param value
     *            allowed object is {@link BigInteger }
     * 
     */
    public void setUid(BigInteger value) {
	this.uid = value;
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
     * Gets the value of the status property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getStatus() {
	return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setStatus(String value) {
	this.status = value;
    }

    /**
     * Gets the value of the userModRev property.
     * 
     * @return possible object is {@link BigInteger }
     * 
     */
    public BigInteger getUserModRev() {
	return userModRev;
    }

    /**
     * Sets the value of the userModRev property.
     * 
     * @param value
     *            allowed object is {@link BigInteger }
     * 
     */
    public void setUserModRev(BigInteger value) {
	this.userModRev = value;
    }

    /**
     * Gets the value of the creatorId property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getCreatorId() {
	return creatorId;
    }

    /**
     * Sets the value of the creatorId property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setCreatorId(String value) {
	this.creatorId = value;
    }

    /**
     * Gets the value of the fingerprint property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getFingerprint() {
	return fingerprint;
    }

    /**
     * Sets the value of the fingerprint property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setFingerprint(String value) {
	this.fingerprint = value;
    }

    /**
     * Gets the value of the redirectUrl property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getRedirectUrl() {
	return redirectUrl;
    }

    /**
     * Sets the value of the redirectUrl property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setRedirectUrl(String value) {
	this.redirectUrl = value;
    }

    /**
     * Gets the value of the self property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getSelf() {
	return self;
    }

    /**
     * Sets the value of the self property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setSelf(String value) {
	this.self = value;
    }

}
