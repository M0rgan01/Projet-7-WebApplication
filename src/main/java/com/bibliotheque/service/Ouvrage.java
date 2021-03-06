
package com.bibliotheque.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ouvrage complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ouvrage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="auteur" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="disponible" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="exemplaireDisponible" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="exemplaireTotaux" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="genre" type="{http://service.bibliotheque.com/}genre" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="titre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ouvrage", propOrder = {
    "auteur",
    "description",
    "disponible",
    "exemplaireDisponible",
    "exemplaireTotaux",
    "genre",
    "id",
    "titre"
})
public class Ouvrage {

    protected String auteur;
    protected String description;
    protected boolean disponible;
    protected int exemplaireDisponible;
    protected int exemplaireTotaux;
    protected Genre genre;
    protected Long id;
    protected String titre;

    /**
     * Obtient la valeur de la propri�t� auteur.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuteur() {
        return auteur;
    }

    /**
     * D�finit la valeur de la propri�t� auteur.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuteur(String value) {
        this.auteur = value;
    }

    /**
     * Obtient la valeur de la propri�t� description.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * D�finit la valeur de la propri�t� description.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Obtient la valeur de la propri�t� disponible.
     * 
     */
    public boolean isDisponible() {
        return disponible;
    }

    /**
     * D�finit la valeur de la propri�t� disponible.
     * 
     */
    public void setDisponible(boolean value) {
        this.disponible = value;
    }

    /**
     * Obtient la valeur de la propri�t� exemplaireDisponible.
     * 
     */
    public int getExemplaireDisponible() {
        return exemplaireDisponible;
    }

    /**
     * D�finit la valeur de la propri�t� exemplaireDisponible.
     * 
     */
    public void setExemplaireDisponible(int value) {
        this.exemplaireDisponible = value;
    }

    /**
     * Obtient la valeur de la propri�t� exemplaireTotaux.
     * 
     */
    public int getExemplaireTotaux() {
        return exemplaireTotaux;
    }

    /**
     * D�finit la valeur de la propri�t� exemplaireTotaux.
     * 
     */
    public void setExemplaireTotaux(int value) {
        this.exemplaireTotaux = value;
    }

    /**
     * Obtient la valeur de la propri�t� genre.
     * 
     * @return
     *     possible object is
     *     {@link Genre }
     *     
     */
    public Genre getGenre() {
        return genre;
    }

    /**
     * D�finit la valeur de la propri�t� genre.
     * 
     * @param value
     *     allowed object is
     *     {@link Genre }
     *     
     */
    public void setGenre(Genre value) {
        this.genre = value;
    }

    /**
     * Obtient la valeur de la propri�t� id.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * D�finit la valeur de la propri�t� id.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Obtient la valeur de la propri�t� titre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitre() {
        return titre;
    }

    /**
     * D�finit la valeur de la propri�t� titre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitre(String value) {
        this.titre = value;
    }

}
