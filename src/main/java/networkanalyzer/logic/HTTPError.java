package networkanalyzer.logic;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * klasa sluzaca do zwrocenia bledu w odpowiedzi na request
 */
@Slf4j
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class HTTPError extends RuntimeException {
    public HTTPError(String message) {
        super(message);
        log.error(message);
    }
}