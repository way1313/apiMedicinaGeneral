package com.misiontic.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "medicos")
public class Medico implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_medico", nullable = false)

	private long idMedico;

	@Column(name = "nombre_medico", nullable = false)
	private String nombreMedico;

	private String apellidoMedico;

	private long documentoMedico;

	private String emailMedico;

	private long celularMedico;

	private String especialidadMedico;

	public Medico() {
	}

	public long getIdMedico() {
		return idMedico;
	}

	public void setIdMedico(long idMedico) {
		this.idMedico = idMedico;
	}

	public String getNombreMedico() {
		return nombreMedico;
	}

	public void setNombreMedico(String nombreMedico) {
		this.nombreMedico = nombreMedico;
	}

	public String getApellidoMedico() {
		return apellidoMedico;
	}

	public void setApellidoMedico(String apellidoMedico) {
		this.apellidoMedico = apellidoMedico;
	}

	public long getDocumentoMedico() {
		return documentoMedico;
	}

	public void setDocumentoMedico(long documentoMedico) {
		this.documentoMedico = documentoMedico;
	}

	public String getEmailMedico() {
		return emailMedico;
	}

	public void setEmailMedico(String emailMedico) {
		this.emailMedico = emailMedico;
	}

	public long getCelularMedico() {
		return celularMedico;
	}

	public void setCelularMedico(long celularMedico) {
		this.celularMedico = celularMedico;
	}

	public String getEspecialidadMedico() {
		return especialidadMedico;
	}

	public void setEspecialidadMedico(String especialidadMedico) {
		this.especialidadMedico = especialidadMedico;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
