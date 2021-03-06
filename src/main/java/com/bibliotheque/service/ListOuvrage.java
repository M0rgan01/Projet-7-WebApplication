
package com.bibliotheque.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour listOuvrage complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="listOuvrage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mot-cle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="genre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="disponnible" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
@XmlType(name = "listOuvrage", propOrder = {
    "motCle",
    "genre",
    "disponnible",
    "page",
    "size"
})
public class ListOuvrage {

    @XmlElement(name = "mot-cle")
    protected String motCle;
    protected String genre;
    protected boolean disponnible;
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
     * Obtient la valeur de la propri�t� genre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenre() {
        return genre;
    }

    /**
     * D�finit la valeur de la propri�t� genre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenre(String value) {
        this.genre = value;
    }

    /**
     * Obtient la valeur de la propri�t� disponnible.
     * 
     */
    public boolean isDisponnible() {
        return disponnible;
    }

    /**
     * D�finit la valeur de la propri�t� disponnible.
     * 
     */
    public void setDisponnible(boolean value) {
        this.disponnible = value;
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
