package com.misiontic.entidades;

import java.time.LocalDate;
import java.time.LocalTime;

import org.hibernate.type.LocaleType;

public class agendaCitas {

	private long idAgencdaCita;
	private agendaCitas idMedico;
	private LocalDate fechaCita;
	private LocalTime horaCita;
	private long consultorioCita;
	private long estadoCita;

	public agendaCitas() {
	}

	public long getIdAgencdaCita() {
		return idAgencdaCita;
	}

	public void setIdAgencdaCita(long idAgencdaCita) {
		this.idAgencdaCita = idAgencdaCita;
	}

	public agendaCitas getIdMedico() {
		return idMedico;
	}

	public void setIdMedico(agendaCitas idMedico) {
		this.idMedico = idMedico;
	}

	public LocalDate getFechaCita() {
		return fechaCita;
	}

	public void setFechaCita(LocalDate fechaCita) {
		this.fechaCita = fechaCita;
	}

	public LocalTime getHoraCita() {
		return horaCita;
	}

	public void setHoraCita(LocalTime horaCita) {
		this.horaCita = horaCita;
	}

	public long getConsultorioCita() {
		return consultorioCita;
	}

	public void setConsultorioCita(long consultorioCita) {
		this.consultorioCita = consultorioCita;
	}

	public long getEstadoCita() {
		return estadoCita;
	}

	public void setEstadoCita(long estadoCita) {
		this.estadoCita = estadoCita;
	}

}
