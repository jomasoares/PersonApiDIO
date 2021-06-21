package one.digitalinnovation.JoaoPersonApi.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class NotFoundException extends Exception {
    public NotFoundException(String entityName, Long id){
        super(String.format("%s not found with id %d", entityName, id));
    }
}
