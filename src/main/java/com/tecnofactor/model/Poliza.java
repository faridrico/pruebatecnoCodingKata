package com.tecnofactor.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "PT_POLIZA")
public class Poliza {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CD_POLIZA")
	private int cdPoliza;

	@NotNull
	@NotEmpty
	@Column(name = "DS_NUMERO")
	private String dsNumero;
	
	@NotNull
	@NotEmpty
	@Column(name = "NM_VALOR_POLIZA")
	private String nmValorPoliza;

	
	public Poliza() {

	}



	public Poliza(int cdPoliza, @NotNull @NotEmpty String dsNumero, @NotNull @NotEmpty String nmValorPoliza) {
		super();
		this.cdPoliza = cdPoliza;
		this.dsNumero = dsNumero;
		this.nmValorPoliza = nmValorPoliza;
	}



	public int getCdPoliza() {
		return cdPoliza;
	}

	public void setCdPoliza(int cdPoliza) {
		this.cdPoliza = cdPoliza;
	}

	public String getDsNumero() {
		return dsNumero;
	}

	public void setDsNumero(String dsNumero) {
		this.dsNumero = dsNumero;
	}



	public String getNmValorPoliza() {
		return nmValorPoliza;
	}



	public void setNmValorPoliza(String nmValorPoliza) {
		this.nmValorPoliza = nmValorPoliza;
	}



	@Override
	public String toString() {
		return "Poliza [cdPoliza=" + cdPoliza + ", dsNumero=" + dsNumero + ", nmValorPoliza=" + nmValorPoliza + "]";
	}




}
