package com.desamex.app.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="tbl_empresas")
public class Empresa implements Serializable{

	/**
	 * Alan Rivero 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "EmpresaSec")
	@SequenceGenerator(
		    name="EmpresaSec",
		    sequenceName = "SEC_EMPRESAS",
		    initialValue = 8, 
		    allocationSize = 1
		)	
	private long idEmpresa; 
	private String nombreEmp;
	private String direccionEmp;
	private String municipioEmp;
	private String estadoEmp;
	private byte[] logoEmp;
	
	public long getIdEmpresa() {
		return idEmpresa;
	}
	public void setIdEmpresa(long idEmpresa) {
		this.idEmpresa = idEmpresa;
	}
	public String getNombreEmp() {
		return nombreEmp;
	}
	public void setNombreEmp(String nombreEmp) {
		this.nombreEmp = nombreEmp;
	}
	public String getDireccionEmp() {
		return direccionEmp;
	}
	public void setDireccionEmp(String direccionEmp) {
		this.direccionEmp = direccionEmp;
	}
	public String getMunicipioEmp() {
		return municipioEmp;
	}
	public void setMunicipioEmp(String municipioEmp) {
		this.municipioEmp = municipioEmp;
	}
	public String getEstadoEmp() {
		return estadoEmp;
	}
	public void setEstadoEmp(String estadoEmp) {
		this.estadoEmp = estadoEmp;
	}
	public byte[] getLogoEmp() {
		return logoEmp;
	}
	public void setLogoEmp(byte[] logoEmp) {
		this.logoEmp = logoEmp;
	}
	
	public Empresa(String nombreEmp, String direccionEmp, String municipioEmp, String estadoEmp, byte[] logoEmp) {
		super();
		this.nombreEmp = nombreEmp;
		this.direccionEmp = direccionEmp;
		this.municipioEmp = municipioEmp;
		this.estadoEmp = estadoEmp;
		this.logoEmp = logoEmp;
	}
	
	public Empresa() {
		
	}
	
}
