package com.example.advise;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ApplicationException {
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public Map<String, String>handleInvalidArgument(MethodArgumentNotValidException ex){
		Map<String, String> errorMap = new HashMap<>();
		BindingResult result = ex.getBindingResult();
        List<FieldError> er = result.getFieldErrors();
        for(FieldError e:er) {
        	errorMap.put(e.getField(), e.getDefaultMessage());
        }
		return errorMap;
		
	}
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public Map<String, String>BookNotFoundException(MethodArgumentNotValidException ex){
		Map<String, String> errorMap = new HashMap<>();
		BindingResult result = ex.getBindingResult();
        List<FieldError> er = result.getFieldErrors();
        for(FieldError e:er) {
        	errorMap.put(e.getField(), e.getDefaultMessage());
        }
		return errorMap;
		
	}
}
