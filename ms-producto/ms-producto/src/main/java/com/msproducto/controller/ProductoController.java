package com.msproducto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.msproducto.service.ProductoService;
import com.mspersistence.entity.Productos;
import com.mspersistence.request.ProductoRequest;

@RestController
@RequestMapping("producto/")
public class ProductoController {
	
	@Autowired
	ProductoService srv;
	
	@GetMapping("mostrar-todos")
	public ResponseEntity<List<Productos>> listar(){
		List<Productos> list = srv.mostrar();
		return new ResponseEntity<List<Productos>>(list, HttpStatus.OK);
	}
	
	@GetMapping("buscar-por-id/{id}")
	public ResponseEntity<Productos> buscarPorId(@PathVariable int id){
		Productos p = srv.buscarPorId(id);
		return new ResponseEntity<Productos>(p,HttpStatus.OK);
	}
	
	@GetMapping("buscar-por-nombre/{presentacion}")
	public ResponseEntity<Productos> buscarPorPresentacion(@PathVariable String presentacion){
		Productos p = srv.buscarPorPresentacion(presentacion);
		return new ResponseEntity<Productos>(p, HttpStatus.OK);
	}
	
	@PostMapping("guardar")
	public ResponseEntity<Productos> guardar(@RequestBody ProductoRequest req){
		Productos p = srv.guardar(req);
		return new ResponseEntity<Productos>(p, HttpStatus.OK);
	}
	
	@PutMapping("actualizar")
	public ResponseEntity<Productos> actualizar(@RequestBody ProductoRequest req){
		Productos c = srv.actualizar(req);
		return new ResponseEntity<Productos>(c,HttpStatus.OK);
	}
	
	@DeleteMapping("eliminar/{id}")
	public ResponseEntity<String> eliminar(@PathVariable int id){
		String mensaje = srv.eliminar(id);
		return new ResponseEntity<String>(mensaje, HttpStatus.OK);
	}
	
}