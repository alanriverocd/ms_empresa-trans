package com.desamex.app.service;

import java.util.List;

import com.desamex.app.entity.Empresa;

public interface IEmpresaService {

	public Empresa get(long id);
	public List<Empresa> getAll();
	public void post(Empresa empresa);
	public void put(Empresa empresa, long id);
	public void delete(long id);
	
}
