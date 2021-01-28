package eu.ensup.service.exception.directeurExceptions;

import eu.ensup.service.BaseService;

import eu.ensup.service.exception.ServiceException;

public class DeleteDirecteurServiceException extends ServiceException {
    public DeleteDirecteurServiceException() {
        super();
        BaseService.logger.info("Une erreur à empêcher la supression du directeur");
    }
}