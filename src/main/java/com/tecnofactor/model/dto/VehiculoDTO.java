package com.tecnofactor.model.dto;

import com.tecnofactor.model.Poliza;

public class VehiculoDTO {
	
	private int cdVehiculo;
	private String dsPlaca;
	private String dsModelo;
	private String dsMarca;
	private int nmCantidadPasajeros;
	private PolizaDTO poliza;
	private String robado;
	private String inspeccionado;

	public VehiculoDTO() {
	}


	
	public VehiculoDTO(int cdVehiculo, String dsPlaca, String dsModelo, String dsMarca, int nmCantidadPasajeros,
			String robado, String inspeccionado) {
		super();
		this.cdVehiculo = cdVehiculo;
		this.dsPlaca = dsPlaca;
		this.dsModelo = dsModelo;
		this.dsMarca = dsMarca;
		this.nmCantidadPasajeros = nmCantidadPasajeros;
		this.robado = robado;
		this.inspeccionado = inspeccionado;
	}



	public int getCdVehiculo() {
		return cdVehiculo;
	}
	public void setCdVehiculo(int cdVehiculo) {
		this.cdVehiculo = cdVehiculo;
	}
	public String getDsPlaca() {
		return dsPlaca;
	}
	public void setDsPlaca(String dsPlaca) {
		this.dsPlaca = dsPlaca;
	}
	public String getDsModelo() {
		return dsModelo;
	}
	public void setDsModelo(String dsModelo) {
		this.dsModelo = dsModelo;
	}
	public String getDsMarca() {
		return dsMarca;
	}
	public void setDsMarca(String dsMarca) {
		this.dsMarca = dsMarca;
	}
	public int getNmCantidadPasajeros() {
		return nmCantidadPasajeros;
	}
	public void setNmCantidadPasajeros(int nmCantidadPasajeros) {
		this.nmCantidadPasajeros = nmCantidadPasajeros;
	}

	public String getRobado() {
		return robado;
	}

	public void setRobado(String robado) {
		this.robado = robado;
	}

	public void setPoliza(PolizaDTO poliza) {
		this.poliza = poliza;
	}



	public String getInspeccionado() {
		return inspeccionado;
	}



	public void setInspeccionado(String inspeccionado) {
		this.inspeccionado = inspeccionado;
	}
	
	
	
	
}
