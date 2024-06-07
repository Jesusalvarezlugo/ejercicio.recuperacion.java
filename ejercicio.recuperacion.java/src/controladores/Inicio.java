package controladores;

import java.util.ArrayList;
import java.util.List;

import dtos.PropietarioDto;
import dtos.VehiculoDto;
import servicios.FicheroImplementacion;
import servicios.FicheroInterfaz;

public class Inicio {

	public static List<VehiculoDto> listaVehiculos=new ArrayList<VehiculoDto>();
	public static List<PropietarioDto> listaPropietarios=new ArrayList<PropietarioDto>();
	public static void main(String[] args) {
		
		/*
		 * 1.Norma: comentarios
		 * 2.Norma: 3 servicios: menus,ficheros,operativa
		 * 
		 * ejercicio:
		 * Realiza una carga inicial de datos de vehiculos desde un fichero se creara con el nombre:vehiculosYpropietarios.
		 * 
		 * 1 dto: VehiculoDto
		 * -id
		 * -matricula
		 * -esHistorico
		 * -fechaMatriculacion formato: dd-MM-yyyy
		 * 2 dto: PropietarioDto
		 * -id
		 * -dni
		 * -fechaCompra
		 * -matricula
		 * 
		 * 
		 * estructura fichero: los campos se separan por ; 
		 * 
		 * 1 campo: matricula
		 * 2 campo: fecha matriculacion
		 * 3 campo: dni
		 * 4 campo: fecha de compra:dd-MM-yyyy
		 * 
		 * */
		
		FicheroInterfaz fi = new FicheroImplementacion();
		
		fi.leerFichero("C:\\Users\\Jesús\\workspace-recuperacion-java\\ejercicio.recuperacion.java\\vehiculosYpropietarios.txt");
		
		for(PropietarioDto propietario:listaPropietarios) {
			
			System.out.println(propietario.toString());
		}
		
		for(VehiculoDto vehiculo: listaVehiculos) {
			
			System.out.println(vehiculo.toString());
		}
		

	}

}
