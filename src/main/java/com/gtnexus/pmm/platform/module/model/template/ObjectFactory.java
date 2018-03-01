//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.06.27 at 10:43:26 AM EDT 
//

package com.gtnexus.pmm.platform.module.model.template;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the
 * com.gtnexus.appxpress.platform.module.model.template package.
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

    private final static QName _DataMarkupType_QNAME = new QName("", "dataMarkupType");
    private final static QName _TemplateName_QNAME = new QName("", "templateName");
    private final static QName _RenderMarkupType_QNAME = new QName("", "renderMarkupType");
    private final static QName _Description_QNAME = new QName("", "description");
    private final static QName _Memo_QNAME = new QName("", "memo");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema
     * derived classes for package:
     * com.gtnexus.appxpress.platform.module.model.template
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TemplateMediaV110 }
     * 
     */
    public TemplateMediaV110 createTemplateMediaV110() {
	return new TemplateMediaV110();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "dataMarkupType")
    public JAXBElement<String> createDataMarkupType(String value) {
	return new JAXBElement<String>(_DataMarkupType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "templateName")
    public JAXBElement<String> createTemplateName(String value) {
	return new JAXBElement<String>(_TemplateName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "renderMarkupType")
    public JAXBElement<String> createRenderMarkupType(String value) {
	return new JAXBElement<String>(_RenderMarkupType_QNAME, String.class, null, value);
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
    @XmlElementDecl(namespace = "", name = "memo")
    public JAXBElement<String> createMemo(String value) {
	return new JAXBElement<String>(_Memo_QNAME, String.class, null, value);
    }

}