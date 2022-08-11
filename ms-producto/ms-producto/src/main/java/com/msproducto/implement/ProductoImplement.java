package com.msproducto.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.msproducto.exception.PresentacionNoEncontrada;
import com.msproducto.exception.ProductoNoEncontrado;
import com.msproducto.service.ProductoService;
import com.mspersistence.entity.Categoria;
import com.mspersistence.entity.Productos;
import com.mspersistence.entity.Proveedor;
import com.mspersistence.repository.ProductoRepository;
import com.mspersistence.request.ProductoRequest;

import java.util.Optional;

@Service
public class ProductoImplement implements ProductoService {

	@Autowired
	ProductoRepository prodRepo;

	RestTemplate plantilla = new RestTemplate();

	String dir1 = "http://localhost:8094/categoria/buscar-por-id/";
	String dir2 = "http://localhost:8090/proveedor/buscar-por-id/";

	// @Autowired
	// CategoriaRepository catRepo;

	// @Autowired
	// ProveedorRepository provRepo;

	// RestTemplate

	@Override
	public Productos guardar(ProductoRequest req) {
		// TODO Auto-generated method stub

		Productos p = new Productos();
		// Categoria c = catRepo.findById(req.getCategoria().getCategoriaId()).get();

		Categoria c = plantilla.getForObject(dir1 + req.getCategoria().getCategoriaId(), Categoria.class);
		// Proveedor pr = provRepo.findById(req.getCategoria().getCategoriaId()).get();

		Proveedor pr = plantilla.getForObject(dir2 + req.getProveedor().getProveedorId(), Proveedor.class);

		p.setCategoria(c);
		p.setCodBarra(req.getCodBarra());
		p.setPrecio(req.getPrecio());
		p.setPresentacion(req.getPresentacion());
		p.setProveedor(pr);

		prodRepo.save(p);

		return p;
	}

	@Override
	public Productos actualizar(ProductoRequest req) {
		// TODO Auto-generated method stub
		
		//Productos p = prodRepo.findById(req.getProductoId()).get();
		//Categoria c = catRepo.findById(req.getCategoria().getCategoriaId()).get();
		//Proveedor pr = provRepo.findById(req.getCategoria().getCategoriaId()).get();
		
		Optional<Productos> p = prodRepo.findById(req.getProductoId());
		
		if(!p.isPresent()) {
			throw new ProductoNoEncontrado("No se encontro el producto");
		}
		 else {
		
			Categoria c = plantilla.getForObject(dir1+req.getCategoria().getCategoriaId(), Categoria.class);
			Proveedor pr = plantilla.getForObject(dir2+req.getCategoria().getCategoriaId(), Proveedor.class);
		
			p.get().setCategoria(c);
			p.get().setCodBarra(req.getCodBarra());
			p.get().setPrecio(req.getPrecio());
			p.get().setPresentacion(req.getPresentacion());
			p.get().setProveedor(pr);
		
			prodRepo.save(p.get());

			return p.get();
		}
		
	}

	@Override
	public Productos buscarPorId(int id) {
		// TODO Auto-generated method stub
		Optional<Productos> p = prodRepo.findById(id);
		if (p.isPresent())
			return p.get();
		else {
			throw new ProductoNoEncontrado("No se encontró el producto con id: " + id);
		}
		

	}

	@Override
	public Productos buscarPorPresentacion(String presentacion) {
		// TODO Auto-generated method stub
		Optional<Productos> p = prodRepo.findByPresentacion(presentacion);
		if (!p.isPresent())
			throw new PresentacionNoEncontrada("No se encontró producto con presentacion: " + presentacion);
		else
			return p.get();

	}

	@Override
	public String eliminar(int id) {
		// TODO Auto-generated method stub
		Optional<Productos> p = prodRepo.findById(id);
		if (!p.isPresent()) 
			throw new ProductoNoEncontrado("No se encontró el producto con id: " + id);
		else {
			prodRepo.deleteById(id);
			return "eliminado OK";
		}
	}

	@Override
	public List<Productos> mostrar() {
		// TODO Auto-generated method stub
		return prodRepo.findAll();
	}

}
