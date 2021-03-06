
package com.bibliotheque.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour listBook complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="listBook">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mot-cle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="kind" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="available" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="page" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="size" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listBook", propOrder = {
    "motCle",
    "kind",
    "available",
    "page",
    "size"
})
public class ListBook {

    @XmlElement(name = "mot-cle")
    protected String motCle;
    protected String kind;
    protected boolean available;
    protected int page;
    protected int size;

    /**
     * Obtient la valeur de la propri�t� motCle.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotCle() {
        return motCle;
    }

    /**
     * D�finit la valeur de la propri�t� motCle.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotCle(String value) {
        this.motCle = value;
    }

    /**
     * Obtient la valeur de la propri�t� kind.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKind() {
        return kind;
    }

    /**
     * D�finit la valeur de la propri�t� kind.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKind(String value) {
        this.kind = value;
    }

    /**
     * Obtient la valeur de la propri�t� available.
     * 
     */
    public boolean isAvailable() {
        return available;
    }

    /**
     * D�finit la valeur de la propri�t� available.
     * 
     */
    public void setAvailable(boolean value) {
        this.available = value;
    }

    /**
     * Obtient la valeur de la propri�t� page.
     * 
     */
    public int getPage() {
        return page;
    }

    /**
     * D�finit la valeur de la propri�t� page.
     * 
     */
    public void setPage(int value) {
        this.page = value;
    }

    /**
     * Obtient la valeur de la propri�t� size.
     * 
     */
    public int getSize() {
        return size;
    }

    /**
     * D�finit la valeur de la propri�t� size.
     * 
     */
    public void setSize(int value) {
        this.size = value;
    }

}
