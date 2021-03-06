package eu.ensup.service.exception.etudiantExceptions;

import eu.ensup.service.BaseService;

import eu.ensup.service.exception.ServiceException;

/**
 * The type Delete etudiant service exception.
 */
public class DeleteEtudiantServiceException extends ServiceException {
    /**
     * Instantiates a new Delete etudiant service exception.
     */
    public DeleteEtudiantServiceException() {
        super(BaseService.messageExceptionEtudiantDelete);
        BaseService.logger.info(BaseService.messageExceptionEtudiantDelete);
    }
}
