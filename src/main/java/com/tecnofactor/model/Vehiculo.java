package com.tecnofactor.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="PT_VEHICULO")
public class Vehiculo {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="CD_VEHICULO")
	private int cdVehiculo;
	
	@NotNull
	@NotEmpty
	@NotNull
	@Column(name="DS_PLACA")
	private String dsPlaca;
	
	@NotNull
	@NotEmpty
	@Column(name="DS_MODELO")
	private String dsModelo;
	
	@NotNull
	@NotEmpty
	@Column(name="DS_MARCA")
	private String dsMarca;
	
	@NotNull
	@Column(name="NM_CANTIDAD_PASAJEROS")
	private int nmCantidadPasajeros;
	
	@ManyToOne()
	@JoinColumn(name="CD_POLIZA")
	@NotNull
	private Poliza poliza;

	public Vehiculo() {
	
	}

	public Vehiculo(@NotNull int cdVehiculo, @NotNull @NotEmpty String dsPlaca, @NotNull @NotEmpty String dsModelo,
			@NotNull @NotEmpty String dsMarca, @NotNull int nmCantidadPasajeros, @NotNull Poliza poliza) {
		super();
		this.cdVehiculo = cdVehiculo;
		this.dsPlaca = dsPlaca;
		this.dsModelo = dsModelo;
		this.dsMarca = dsMarca;
		this.nmCantidadPasajeros = nmCantidadPasajeros;
		this.poliza = poliza;
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

	public Poliza getPoliza() {
		return poliza;
	}

	public void setPoliza(Poliza poliza) {
		this.poliza = poliza;
	}

	@Override
	public String toString() {
		return "Vehiculo [cdVehiculo=" + cdVehiculo + ", dsPlaca=" + dsPlaca + ", dsModelo=" + dsModelo + ", dsMarca="
				+ dsMarca + ", nmCantidadPasajeros=" + nmCantidadPasajeros + ", poliza=" + poliza + "]";
	}
	
	
	
}
