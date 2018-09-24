package com.tecnofactor.model.contract;

public class AfiliacionErrorContract {
	
	private String dsMensaje;
	
	
	public AfiliacionErrorContract() {
	
	}

	public AfiliacionErrorContract(String dsMensaje) {
		super();
		this.dsMensaje = dsMensaje;
	}


	public String getDsMensaje() {
		return dsMensaje;
	}

	public void setDsMensaje(String dsMensaje) {
		this.dsMensaje = dsMensaje;
	}
	
	
}
