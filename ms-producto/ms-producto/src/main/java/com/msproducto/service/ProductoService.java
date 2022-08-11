package com.msproducto.service;

import java.util.List;

import com.mspersistence.entity.Productos;
import com.mspersistence.request.ProductoRequest;
import com.msproducto.exception.PresentacionNoEncontrada;
import com.msproducto.exception.ProductoNoEncontrado;

public interface ProductoService {
	
	Productos guardar(ProductoRequest req);
	Productos actualizar(ProductoRequest req);
	Productos buscarPorId(int id) throws ProductoNoEncontrado;
	Productos buscarPorPresentacion(String presentacion) throws PresentacionNoEncontrada;
	String eliminar(int id) throws ProductoNoEncontrado;
	List<Productos> mostrar();
	
}
