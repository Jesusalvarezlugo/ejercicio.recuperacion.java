package dtos;

import java.time.LocalDate;

public class PropietarioDto {
	
	//Atributos
	
	long idPropietario;
	
	String dniPropietario="aaaaa";
	LocalDate fechaCompra=LocalDate.now();
	String matricula="aaaaa";
	
	//Getters y setters
	
	public long getIdPropietario() {
		return idPropietario;
	}
	public void setIdPropietario(long idPropietario) {
		this.idPropietario = idPropietario;
	}
	public String getDniPropietario() {
		return dniPropietario;
	}
	public void setDniPropietario(String dniPropietario) {
		this.dniPropietario = dniPropietario;
	}
	public LocalDate getFechaCompra() {
		return fechaCompra;
	}
	public void setFechaCompra(LocalDate fechaCompra) {
		this.fechaCompra = fechaCompra;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	@Override
	public String toString() {
		return "PropietarioDto [dniPropietario=" + dniPropietario + ", fechaCompra=" + fechaCompra + "]";
	}
}
