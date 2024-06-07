package dtos;

import java.time.LocalDate;

public class VehiculoDto {
	
	//Atributos
	
	long idVehiculo;
	
	String matriculaVehiculo="aaaaa";
	LocalDate fechaMatriculacion=LocalDate.now();
	boolean esHistorico=false;
	
	//GETTERS Y SETTERS
	
	public long getIdVehiculo() {
		return idVehiculo;
	}
	public void setIdVehiculo(long idVehiculo) {
		this.idVehiculo = idVehiculo;
	}
	public String getMatriculaVehiculo() {
		return matriculaVehiculo;
	}
	public void setMatriculaVehiculo(String matriculaVehiculo) {
		this.matriculaVehiculo = matriculaVehiculo;
	}
	public LocalDate getFechaMatriculacion() {
		return fechaMatriculacion;
	}
	public void setFechaMatriculacion(LocalDate fechaMatriculacion) {
		this.fechaMatriculacion = fechaMatriculacion;
	}
	public boolean isEsHistorico() {
		return esHistorico;
	}
	public void setEsHistorico(boolean esHistorico) {
		this.esHistorico = esHistorico;
	}
	
	@Override
	public String toString() {
		return "VehiculoDto [matriculaVehiculo=" + matriculaVehiculo + ", fechaMatriculacion=" + fechaMatriculacion
				+ "]";
	}

}
