package com.tecnofactor.model.dto;


public class PolizaDTO {

	private int cdPoliza;
	private String dsNumero;
	
	public PolizaDTO() {
	
	}

	public PolizaDTO(int cdPoliza, String dsNumero) {
		super();
		this.cdPoliza = cdPoliza;
		this.dsNumero = dsNumero;
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
	
	
}
