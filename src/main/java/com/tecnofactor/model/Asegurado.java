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
@Table(name="PT_ASEGURADO")
public class Asegurado {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="CD_ASEGURADO")
	private int cdAsegurado;
	
	@Column(name="NM_DOCUMENTO")
	@NotNull
	@NotEmpty
	private String nmDocumento;
	
	@Column(name="NM_SALARIO")
	@NotNull
	@NotEmpty
	private int nmSalario;
	
	@Column(name="NM_CREDITOS")
	@NotNull
	@NotEmpty
	private int nmCreditos;
	
	@Column(name="NM_GASTOS_FIJOS")
	@NotNull
	@NotEmpty
	private int nmGastosFijos;
	
	@ManyToOne
	@JoinColumn(name="CD_POLIZA")
	@NotNull
	private Poliza poliza;


	public Asegurado() {
	
	}

	public Asegurado(@NotNull int cdAsegurado, @NotNull @NotEmpty String nmDocumento, @NotNull @NotEmpty int nmSalario,
			@NotNull @NotEmpty int nmCreditos, @NotNull @NotEmpty int nmGastosFijos, @NotNull Poliza poliza) {
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

	@Override
	public String toString() {
		return "Asegurado [cdAsegurado=" + cdAsegurado + ", nmDocumento=" + nmDocumento + ", nmSalario=" + nmSalario
				+ ", nmCreditos=" + nmCreditos + ", nmGastosFijos=" + nmGastosFijos + ", poliza=" + poliza + "]";
	}
	
}
