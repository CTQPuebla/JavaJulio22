package com.msproducto.exception;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.http.HttpStatus;

public class ApiErrors {
	
	private String mensaje;
	private List<String> detalles;
	private HttpStatus status;
	private LocalDateTime timestamp;
	
	public ApiErrors() {}
	
	public ApiErrors(String mensaje, List<String> detalles, HttpStatus status, LocalDateTime timestamp) {
		super();
		this.mensaje = mensaje;
		this.detalles = detalles;
		this.status = status;
		this.timestamp = timestamp;
	}

	public String getMensaje() {
		return mensaje;
	}
	
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
	public List<String> getDetalles() {
		return detalles;
	}
	
	public void setDetalles(List<String> detalles) {
		this.detalles = detalles;
	}
	
	public HttpStatus getStatus() {
		return status;
	}
	
	public void setStatus(HttpStatus status) {
		this.status = status;
	}
	
	public LocalDateTime getTimestamp() {
		return timestamp;
	}
	
	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}

	@Override
	public String toString() {
		return "ApiErrors [mensaje=" + mensaje + ", detalles=" + detalles + ", status=" + status + ", timestamp="
				+ timestamp + "]";
	}

}
