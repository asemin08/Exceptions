package eu.ensup.service;

import eu.ensup.domaine.Responsable;
import eu.ensup.service.exception.CredentialException;
import eu.ensup.service.exception.responsableExceptions.*;

import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
import java.util.Set;

/**
 * The interface Responsable service.
 */
public interface IResponsableService {

    /**
     * Add responsable int.
     *
     * @param r the r
     * @return the int
     * @throws SQLException             the sql exception
     * @throws NoSuchAlgorithmException the no such algorithm exception
     */
    int addResponsable(Responsable r) throws  CredentialException, AddResponsableServiceException;

    /**
     * Update responsable int.
     *
     * @param r the r
     * @return the int
     * @throws SQLException the sql exception
     */
    int updateResponsable(Responsable r) throws  UpdateResponsableServiceException;

    /**
     * Delete responsable int.
     *
     * @param id the id
     * @return the int
     * @throws SQLException the sql exception
     */
    int deleteResponsable(int id) throws  DeleteResponsableServiceException;

    /**
     * Gets responsable.
     *
     * @param id the id
     * @return the responsable
     * @throws SQLException the sql exception
     */
    Responsable getResponsable(int id) throws GetResponsableServiceException;

    /**
     * Gets all responsables.
     *
     * @return the all responsables
     * @throws SQLException the sql exception
     */
    Set<Responsable> getAllResponsables() throws GetAllResponsableServiceException, SQLException;

    /**
     * Valid responsable authentification int.
     *
     * @param r        the r
     * @param password the password
     * @return the int
     * @throws NoSuchAlgorithmException the no such algorithm exception
     */
    int validResponsableAuthentification(Responsable r, String password) throws NoSuchAlgorithmException;

    /**
     * Gets credential by email.
     *
     * @param email the email
     * @return the credential by email
     * @throws SQLException the sql exception
     */
    Responsable getCredentialByEmail(String email) throws SQLException, CredentialException;

    /**
     * Valid directeur authentification int.
     *
     * @param r        the Responsable
     * @param password the password
     * @return the int
     * @throws NoSuchAlgorithmException the no such algorithm exception
     */
    int validAuthentification(Responsable r, String password) throws NoSuchAlgorithmException, CredentialException;

}
