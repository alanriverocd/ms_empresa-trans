package com.desamex.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.desamex.app.entity.Empresa;
import com.desamex.app.service.IEmpresaService;

@RestController
public class EmpresaController {
	
	@Autowired
	IEmpresaService empresaService;
    
	@GetMapping("/empresas")
	public List<Empresa> getAllEmpresas(){
		return empresaService.getAll();
	}
	
	@GetMapping("/empresa/{idEmpresa}")
	public Empresa getOne(@PathVariable(value="idEmpresa")long id){
		
		return empresaService.get(id);
	}
	
	@PostMapping("/empresa")
	public void add(Empresa empresa) {
		empresaService.post(empresa);
	}
	
	@PutMapping("/empresa/{idEmpresa}")
	public void update(Empresa empresa,@PathVariable(value="idEmpresa") long id) {
		
		empresaService.put(empresa, id);
	}
	
	@DeleteMapping("/empresa/{idEmpresa}")
    public void update(@PathVariable(value="idEmpresa") long id) {
		
		empresaService.delete(id);
	}
}
