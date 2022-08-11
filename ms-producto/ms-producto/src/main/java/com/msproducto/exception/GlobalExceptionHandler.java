package com.msproducto.exception;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.TypeMismatchException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MissingPathVariableException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler{

	@Override
	protected ResponseEntity<Object> handleHttpRequestMethodNotSupported(HttpRequestMethodNotSupportedException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		
		String msg = ex.getMessage();
		List<String> detalles = new ArrayList<>();
		detalles.add("Metodo request no soportado");
		ApiErrors error = new ApiErrors(msg,detalles,status,LocalDateTime.now());
		
		return ResponseEntity.status(status).body(error);
		//return super.handleHttpRequestMethodNotSupported(ex, headers, status, request);
	}

	@Override
	protected ResponseEntity<Object> handleHttpMediaTypeNotSupported(HttpMediaTypeNotSupportedException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		// TODO Auto-generated method stub
		
		String msg = ex.getMessage();
		List<String> detalles = new ArrayList<>();
		detalles.add("Media no soportado");
		ApiErrors error = new ApiErrors(msg,detalles,status,LocalDateTime.now());
		
		return ResponseEntity.status(status).body(error);
		
		//return super.handleHttpMediaTypeNotSupported(ex, headers, status, request);
	}

	@Override
	protected ResponseEntity<Object> handleMissingPathVariable(MissingPathVariableException ex, HttpHeaders headers,
			HttpStatus status, WebRequest request) {
		// TODO Auto-generated method stub
		
		String msg = ex.getMessage();
		List<String> detalles = new ArrayList<>();
		detalles.add("Path Varrianle no valida");
		ApiErrors error = new ApiErrors(msg,detalles,status,LocalDateTime.now());
		
		return ResponseEntity.status(status).body(error);
		
		//return super.handleMissingPathVariable(ex, headers, status, request);
	}

	@Override
	protected ResponseEntity<Object> handleMissingServletRequestParameter(MissingServletRequestParameterException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		// TODO Auto-generated method stub
		
		String msg = ex.getMessage();
		List<String> detalles = new ArrayList<>();
		detalles.add("Request param no existe");
		ApiErrors error = new ApiErrors(msg,detalles,status,LocalDateTime.now());
		
		return ResponseEntity.status(status).body(error);
		
		//return super.handleMissingServletRequestParameter(ex, headers, status, request);
	}

	@Override
	protected ResponseEntity<Object> handleTypeMismatch(TypeMismatchException ex, HttpHeaders headers,
			HttpStatus status, WebRequest request) {
		// TODO Auto-generated method stub
		
		String msg = ex.getMessage();
		List<String> detalles = new ArrayList<>();
		detalles.add("Type mismatch error");
		ApiErrors error = new ApiErrors(msg,detalles,status,LocalDateTime.now());
		
		return ResponseEntity.status(status).body(error);
		
		//return super.handleTypeMismatch(ex, headers, status, request);
	}

	@Override
	protected ResponseEntity<Object> handleHttpMessageNotReadable(HttpMessageNotReadableException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		// TODO Auto-generated method stub
		
		String msg = ex.getMessage();
		List<String> detalles = new ArrayList<>();
		detalles.add("Cuerpo del request no se puede leer");
		ApiErrors error = new ApiErrors(msg,detalles,status,LocalDateTime.now());
		
		return ResponseEntity.status(status).body(error);
		
		//return super.handleHttpMessageNotReadable(ex, headers, status, request);
	}
	
	@ExceptionHandler(ProductoNoEncontrado.class)
	public ResponseEntity<Object> handleProductoNoEncontrado(ProductoNoEncontrado ex){
		String msg = ex.getMessage();
		List<String> detalles = new ArrayList<>();
		detalles.add("Producto no encontrado");
		ApiErrors error = new ApiErrors(msg,detalles,HttpStatus.NOT_FOUND,LocalDateTime.now());
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<Object> handleOtros(Exception ex){
		String msg = ex.getMessage();
		List<String> detalles = new ArrayList<>();
		detalles.add("otra exception: ");
		detalles.add(ex.getMessage());
		ApiErrors error = new ApiErrors(msg,detalles,HttpStatus.BAD_REQUEST,LocalDateTime.now());
		
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(error);
	}
	
}
