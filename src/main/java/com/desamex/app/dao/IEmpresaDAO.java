package com.desamex.app.dao;

import org.springframework.data.repository.CrudRepository;

import com.desamex.app.entity.Empresa;

public interface IEmpresaDAO extends CrudRepository<Empresa, Long>{

}
