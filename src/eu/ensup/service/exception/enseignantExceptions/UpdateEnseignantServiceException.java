package eu.ensup.service.exception.enseignantExceptions;

import eu.ensup.service.BaseService;

import eu.ensup.service.exception.ServiceException;

/**
 * The type Update enseignant service exception.
 */
public class UpdateEnseignantServiceException extends ServiceException {
    /**
     * Instantiates a new Update enseignant service exception.
     */
    public UpdateEnseignantServiceException() {
        super(BaseService.messageExceptionEnseignantUpdate);
        BaseService.logger.info(BaseService.messageExceptionEnseignantUpdate);
    }
}
