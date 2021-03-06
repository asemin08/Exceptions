package eu.ensup.service.exception.coursExceptions;

import eu.ensup.service.BaseService;

import eu.ensup.service.exception.ServiceException;

/**
 * The type Get cours etudiant service exception.
 */
public class GetCoursEtudiantServiceException extends ServiceException {
    /**
     * Instantiates a new Get cours etudiant service exception.
     */
    public GetCoursEtudiantServiceException() {
        super(BaseService.messageExceptionCoursEtudiant);
        BaseService.logger.info(BaseService.messageExceptionCoursGet);
    }
}
