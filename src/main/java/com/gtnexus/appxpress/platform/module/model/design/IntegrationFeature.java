//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.07.21 at 02:11:26 PM EDT 
//

package com.gtnexus.appxpress.platform.module.model.design;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element ref="{}enabled"/>
 *         &lt;element ref="{}downloadRuntimeEnabled"/>
 *         &lt;element ref="{}uploadRuntimeEnabled"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "enabled", "downloadRuntimeEnabled", "uploadRuntimeEnabled" })
@XmlRootElement(name = "integrationFeature")
public class IntegrationFeature {

    protected boolean enabled;
    protected boolean downloadRuntimeEnabled;
    protected boolean uploadRuntimeEnabled;

    /**
     * Gets the value of the enabled property.
     * 
     */
    public boolean isEnabled() {
	return enabled;
    }

    /**
     * Sets the value of the enabled property.
     * 
     */
    public void setEnabled(boolean value) {
	this.enabled = value;
    }

    /**
     * Gets the value of the downloadRuntimeEnabled property.
     * 
     */
    public boolean isDownloadRuntimeEnabled() {
	return downloadRuntimeEnabled;
    }

    /**
     * Sets the value of the downloadRuntimeEnabled property.
     * 
     */
    public void setDownloadRuntimeEnabled(boolean value) {
	this.downloadRuntimeEnabled = value;
    }

    /**
     * Gets the value of the uploadRuntimeEnabled property.
     * 
     */
    public boolean isUploadRuntimeEnabled() {
	return uploadRuntimeEnabled;
    }

    /**
     * Sets the value of the uploadRuntimeEnabled property.
     * 
     */
    public void setUploadRuntimeEnabled(boolean value) {
	this.uploadRuntimeEnabled = value;
    }

}
