//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.07.21 at 02:11:26 PM EDT 
//

package com.gtnexus.pmm.platform.module.model.design;

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
 *         &lt;element ref="{}enabled"/>
 *         &lt;element ref="{}draftCompletionState"/>
 *         &lt;element ref="{}activeCompletionState"/>
 *         &lt;element ref="{}transitionForNewDraft"/>
 *         &lt;element ref="{}versionField"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "enabled", "draftCompletionState", "activeCompletionState", "transitionForNewDraft",
	"versionField" })
@XmlRootElement(name = "versioningFeature")
public class VersioningFeature {

    protected boolean enabled;
    @XmlElement(required = true)
    protected String draftCompletionState;
    @XmlElement(required = true)
    protected String activeCompletionState;
    @XmlElement(required = true)
    protected String transitionForNewDraft;
    @XmlElement(required = true)
    protected String versionField;

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
     * Gets the value of the draftCompletionState property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getDraftCompletionState() {
	return draftCompletionState;
    }

    /**
     * Sets the value of the draftCompletionState property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setDraftCompletionState(String value) {
	this.draftCompletionState = value;
    }

    /**
     * Gets the value of the activeCompletionState property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getActiveCompletionState() {
	return activeCompletionState;
    }

    /**
     * Sets the value of the activeCompletionState property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setActiveCompletionState(String value) {
	this.activeCompletionState = value;
    }

    /**
     * Gets the value of the transitionForNewDraft property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getTransitionForNewDraft() {
	return transitionForNewDraft;
    }

    /**
     * Sets the value of the transitionForNewDraft property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setTransitionForNewDraft(String value) {
	this.transitionForNewDraft = value;
    }

    /**
     * Gets the value of the versionField property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getVersionField() {
	return versionField;
    }

    /**
     * Sets the value of the versionField property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setVersionField(String value) {
	this.versionField = value;
    }

}