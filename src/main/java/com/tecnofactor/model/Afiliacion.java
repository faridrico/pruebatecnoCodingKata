package com.tecnofactor.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="PT_AFILIACION")
public class Afiliacion {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int cdAfiliado;
	
	@ManyToOne
	@JoinColumn(name="CD_VEHICULO")
	Vehiculo vehiculo;
	
	
	@ManyToOne
	@JoinColumn(name="CD_POLIZA")
	Poliza poliza;
	
	@ManyToOne
	@JoinColumn(name="CD_ASEGURADO")
	Asegurado asegurado;

	public Afiliacion() {
	
	}

	public Afiliacion(Vehiculo vehiculo, Poliza poliza, Asegurado asegurado) {
		super();
		this.vehiculo = vehiculo;
		this.poliza = poliza;
		this.asegurado = asegurado;
	}

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	public Poliza getPoliza() {
		return poliza;
	}

	public void setPoliza(Poliza poliza) {
		this.poliza = poliza;
	}

	public Asegurado getAsegurado() {
		return asegurado;
	}

	public void setAsegurado(Asegurado asegurado) {
		this.asegurado = asegurado;
	}
	
	
	
}
