
package com.bibliotheque.service;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "BibliothequeWS", targetNamespace = "http://service.bibliotheque.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BibliothequeWS {


    /**
     * 
     * @param utilisateur
     */
    @WebMethod
    @RequestWrapper(localName = "saveUtilisateur", targetNamespace = "http://service.bibliotheque.com/", className = "com.bibliotheque.service.SaveUtilisateur")
    @ResponseWrapper(localName = "saveUtilisateurResponse", targetNamespace = "http://service.bibliotheque.com/", className = "com.bibliotheque.service.SaveUtilisateurResponse")
    @Action(input = "http://service.bibliotheque.com/BibliothequeWS/saveUtilisateurRequest", output = "http://service.bibliotheque.com/BibliothequeWS/saveUtilisateurResponse")
    public void saveUtilisateur(
        @WebParam(name = "utilisateur", targetNamespace = "")
        Utilisateur utilisateur);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns com.bibliotheque.service.PageOuvrage
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listOuvrage", targetNamespace = "http://service.bibliotheque.com/", className = "com.bibliotheque.service.ListOuvrage")
    @ResponseWrapper(localName = "listOuvrageResponse", targetNamespace = "http://service.bibliotheque.com/", className = "com.bibliotheque.service.ListOuvrageResponse")
    @Action(input = "http://service.bibliotheque.com/BibliothequeWS/listOuvrageRequest", output = "http://service.bibliotheque.com/BibliothequeWS/listOuvrageResponse")
    public PageOuvrage listOuvrage(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1);

    /**
     * 
     * @param arg0
     * @return
     *     returns com.bibliotheque.service.Ouvrage
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getOuvrage", targetNamespace = "http://service.bibliotheque.com/", className = "com.bibliotheque.service.GetOuvrage")
    @ResponseWrapper(localName = "getOuvrageResponse", targetNamespace = "http://service.bibliotheque.com/", className = "com.bibliotheque.service.GetOuvrageResponse")
    @Action(input = "http://service.bibliotheque.com/BibliothequeWS/getOuvrageRequest", output = "http://service.bibliotheque.com/BibliothequeWS/getOuvrageResponse")
    public Ouvrage getOuvrage(
        @WebParam(name = "arg0", targetNamespace = "")
        Long arg0);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "deleteMail", targetNamespace = "http://service.bibliotheque.com/", className = "com.bibliotheque.service.DeleteMail")
    @ResponseWrapper(localName = "deleteMailResponse", targetNamespace = "http://service.bibliotheque.com/", className = "com.bibliotheque.service.DeleteMailResponse")
    @Action(input = "http://service.bibliotheque.com/BibliothequeWS/deleteMailRequest", output = "http://service.bibliotheque.com/BibliothequeWS/deleteMailResponse")
    public void deleteMail(
        @WebParam(name = "arg0", targetNamespace = "")
        Long arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns com.bibliotheque.service.Reservation
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getRerservation", targetNamespace = "http://service.bibliotheque.com/", className = "com.bibliotheque.service.GetRerservation")
    @ResponseWrapper(localName = "getRerservationResponse", targetNamespace = "http://service.bibliotheque.com/", className = "com.bibliotheque.service.GetRerservationResponse")
    @Action(input = "http://service.bibliotheque.com/BibliothequeWS/getRerservationRequest", output = "http://service.bibliotheque.com/BibliothequeWS/getRerservationResponse")
    public Reservation getRerservation(
        @WebParam(name = "arg0", targetNamespace = "")
        Long arg0);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "deleteOuvrage", targetNamespace = "http://service.bibliotheque.com/", className = "com.bibliotheque.service.DeleteOuvrage")
    @ResponseWrapper(localName = "deleteOuvrageResponse", targetNamespace = "http://service.bibliotheque.com/", className = "com.bibliotheque.service.DeleteOuvrageResponse")
    @Action(input = "http://service.bibliotheque.com/BibliothequeWS/deleteOuvrageRequest", output = "http://service.bibliotheque.com/BibliothequeWS/deleteOuvrageResponse")
    public void deleteOuvrage(
        @WebParam(name = "arg0", targetNamespace = "")
        Long arg0);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "saveGenre", targetNamespace = "http://service.bibliotheque.com/", className = "com.bibliotheque.service.SaveGenre")
    @ResponseWrapper(localName = "saveGenreResponse", targetNamespace = "http://service.bibliotheque.com/", className = "com.bibliotheque.service.SaveGenreResponse")
    @Action(input = "http://service.bibliotheque.com/BibliothequeWS/saveGenreRequest", output = "http://service.bibliotheque.com/BibliothequeWS/saveGenreResponse")
    public void saveGenre(
        @WebParam(name = "arg0", targetNamespace = "")
        Genre arg0);

    /**
     * 
     * @return
     *     returns java.util.List<com.bibliotheque.service.Genre>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getListGenre", targetNamespace = "http://service.bibliotheque.com/", className = "com.bibliotheque.service.GetListGenre")
    @ResponseWrapper(localName = "getListGenreResponse", targetNamespace = "http://service.bibliotheque.com/", className = "com.bibliotheque.service.GetListGenreResponse")
    @Action(input = "http://service.bibliotheque.com/BibliothequeWS/getListGenreRequest", output = "http://service.bibliotheque.com/BibliothequeWS/getListGenreResponse")
    public List<Genre> getListGenre();

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "saveMail", targetNamespace = "http://service.bibliotheque.com/", className = "com.bibliotheque.service.SaveMail")
    @ResponseWrapper(localName = "saveMailResponse", targetNamespace = "http://service.bibliotheque.com/", className = "com.bibliotheque.service.SaveMailResponse")
    @Action(input = "http://service.bibliotheque.com/BibliothequeWS/saveMailRequest", output = "http://service.bibliotheque.com/BibliothequeWS/saveMailResponse")
    public void saveMail(
        @WebParam(name = "arg0", targetNamespace = "")
        Mail arg0);

    /**
     * 
     * @param id
     * @return
     *     returns com.bibliotheque.service.Utilisateur
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getUtilisateur", targetNamespace = "http://service.bibliotheque.com/", className = "com.bibliotheque.service.GetUtilisateur")
    @ResponseWrapper(localName = "getUtilisateurResponse", targetNamespace = "http://service.bibliotheque.com/", className = "com.bibliotheque.service.GetUtilisateurResponse")
    @Action(input = "http://service.bibliotheque.com/BibliothequeWS/getUtilisateurRequest", output = "http://service.bibliotheque.com/BibliothequeWS/getUtilisateurResponse")
    public Utilisateur getUtilisateur(
        @WebParam(name = "id", targetNamespace = "")
        Long id);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "saveReservation", targetNamespace = "http://service.bibliotheque.com/", className = "com.bibliotheque.service.SaveReservation")
    @ResponseWrapper(localName = "saveReservationResponse", targetNamespace = "http://service.bibliotheque.com/", className = "com.bibliotheque.service.SaveReservationResponse")
    @Action(input = "http://service.bibliotheque.com/BibliothequeWS/saveReservationRequest", output = "http://service.bibliotheque.com/BibliothequeWS/saveReservationResponse")
    public void saveReservation(
        @WebParam(name = "arg0", targetNamespace = "")
        Reservation arg0);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "saveOuvrage", targetNamespace = "http://service.bibliotheque.com/", className = "com.bibliotheque.service.SaveOuvrage")
    @ResponseWrapper(localName = "saveOuvrageResponse", targetNamespace = "http://service.bibliotheque.com/", className = "com.bibliotheque.service.SaveOuvrageResponse")
    @Action(input = "http://service.bibliotheque.com/BibliothequeWS/saveOuvrageRequest", output = "http://service.bibliotheque.com/BibliothequeWS/saveOuvrageResponse")
    public void saveOuvrage(
        @WebParam(name = "arg0", targetNamespace = "")
        Ouvrage arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns com.bibliotheque.service.Genre
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getGenre", targetNamespace = "http://service.bibliotheque.com/", className = "com.bibliotheque.service.GetGenre")
    @ResponseWrapper(localName = "getGenreResponse", targetNamespace = "http://service.bibliotheque.com/", className = "com.bibliotheque.service.GetGenreResponse")
    @Action(input = "http://service.bibliotheque.com/BibliothequeWS/getGenreRequest", output = "http://service.bibliotheque.com/BibliothequeWS/getGenreResponse")
    public Genre getGenre(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns com.bibliotheque.service.Mail
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getMail", targetNamespace = "http://service.bibliotheque.com/", className = "com.bibliotheque.service.GetMail")
    @ResponseWrapper(localName = "getMailResponse", targetNamespace = "http://service.bibliotheque.com/", className = "com.bibliotheque.service.GetMailResponse")
    @Action(input = "http://service.bibliotheque.com/BibliothequeWS/getMailRequest", output = "http://service.bibliotheque.com/BibliothequeWS/getMailResponse")
    public Mail getMail(
        @WebParam(name = "arg0", targetNamespace = "")
        Long arg0);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "deleteReservation", targetNamespace = "http://service.bibliotheque.com/", className = "com.bibliotheque.service.DeleteReservation")
    @ResponseWrapper(localName = "deleteReservationResponse", targetNamespace = "http://service.bibliotheque.com/", className = "com.bibliotheque.service.DeleteReservationResponse")
    @Action(input = "http://service.bibliotheque.com/BibliothequeWS/deleteReservationRequest", output = "http://service.bibliotheque.com/BibliothequeWS/deleteReservationResponse")
    public void deleteReservation(
        @WebParam(name = "arg0", targetNamespace = "")
        Long arg0);

    /**
     * 
     * @param id
     */
    @WebMethod
    @RequestWrapper(localName = "deleteUtilisateur", targetNamespace = "http://service.bibliotheque.com/", className = "com.bibliotheque.service.DeleteUtilisateur")
    @ResponseWrapper(localName = "deleteUtilisateurResponse", targetNamespace = "http://service.bibliotheque.com/", className = "com.bibliotheque.service.DeleteUtilisateurResponse")
    @Action(input = "http://service.bibliotheque.com/BibliothequeWS/deleteUtilisateurRequest", output = "http://service.bibliotheque.com/BibliothequeWS/deleteUtilisateurResponse")
    public void deleteUtilisateur(
        @WebParam(name = "id", targetNamespace = "")
        Long id);

}