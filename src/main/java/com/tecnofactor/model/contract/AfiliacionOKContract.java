package com.tecnofactor.model.contract;

public class AfiliacionOKContract {
	
	private String nmTransaccion;

	public AfiliacionOKContract() {

	}

	public AfiliacionOKContract(String nmTransaccion) {
		super();
		this.nmTransaccion = nmTransaccion;
	}

	public String getNmTransaccion() {
		return nmTransaccion;
	}

	public void setNmTransaccion(String nmTransaccion) {
		this.nmTransaccion = nmTransaccion;
	}
	
	
}
