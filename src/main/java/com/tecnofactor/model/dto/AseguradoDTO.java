package com.tecnofactor.model.dto;


import com.tecnofactor.model.Poliza;

public class AseguradoDTO {

	private int cdAsegurado;
	
	private String nmDocumento;
	
	private int nmSalario;
	
	private int nmCreditos;
	
	private int nmGastosFijos;
	
	private Poliza poliza;

	public AseguradoDTO() {
		
	}

	public AseguradoDTO(int cdAsegurado, String nmDocumento, int nmSalario, int nmCreditos, int nmGastosFijos,
			Poliza poliza) {
		super();
		this.cdAsegurado = cdAsegurado;
		this.nmDocumento = nmDocumento;
		this.nmSalario = nmSalario;
		this.nmCreditos = nmCreditos;
		this.nmGastosFijos = nmGastosFijos;
		this.poliza = poliza;
	}

	public int getCdAsegurado() {
		return cdAsegurado;
	}

	public void setCdAsegurado(int cdAsegurado) {
		this.cdAsegurado = cdAsegurado;
	}

	public String getNmDocumento() {
		return nmDocumento;
	}

	public void setNmDocumento(String nmDocumento) {
		this.nmDocumento = nmDocumento;
	}

	public int getNmSalario() {
		return nmSalario;
	}

	public void setNmSalario(int nmSalario) {
		this.nmSalario = nmSalario;
	}

	public int getNmCreditos() {
		return nmCreditos;
	}

	public void setNmCreditos(int nmCreditos) {
		this.nmCreditos = nmCreditos;
	}

	public int getNmGastosFijos() {
		return nmGastosFijos;
	}

	public void setNmGastosFijos(int nmGastosFijos) {
		this.nmGastosFijos = nmGastosFijos;
	}

	public Poliza getPoliza() {
		return poliza;
	}

	public void setPoliza(Poliza poliza) {
		this.poliza = poliza;
	}
	
	
}
