package com.desamex.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.desamex.app.dao.IEmpresaDAO;
import com.desamex.app.entity.Empresa;

@Service
public class EmpresaServiceImpl implements IEmpresaService{

	@Autowired
	IEmpresaDAO empresaDAO;
	
	@Override
	public Empresa get(long id) {
		
		return empresaDAO.findById(id).get();
	}

	@Override
	public List<Empresa> getAll() {

		return (List<Empresa>) empresaDAO.findAll();
	}

	@Override
	public void post(Empresa empresa) {

		empresaDAO.save(empresa);
	}

	@Override
	public void put(Empresa empresa, long id) {
		
		empresaDAO.findById(id).ifPresent((x)->{
		empresa.setIdEmpresa(id);
		empresaDAO.save(empresa);
			
		});
	}

	@Override
	public void delete(long id) {

		empresaDAO.deleteById(id);
		
	}

}
