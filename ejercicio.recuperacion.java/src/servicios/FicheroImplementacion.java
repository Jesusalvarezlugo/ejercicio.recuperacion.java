package servicios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import controladores.Inicio;
import dtos.PropietarioDto;
import dtos.VehiculoDto;

public class FicheroImplementacion implements FicheroInterfaz {

	@Override
	public void leerFichero(String ruta) {
		
		try {
			FileReader fr = new FileReader(ruta);
			BufferedReader bf = new BufferedReader(fr);
			String linea;
			DateTimeFormatter formato =  DateTimeFormatter.ofPattern("dd-MM-yyyy");
			
			while((linea=bf.readLine())!=null) {
				String[] VehiculoYPropietario=linea.split(";");
				VehiculoDto veh=new VehiculoDto();
				PropietarioDto prop = new PropietarioDto();
				veh.setMatriculaVehiculo(VehiculoYPropietario[0]);
				prop.setMatricula(VehiculoYPropietario[0]);
				veh.setFechaMatriculacion(LocalDate.parse(VehiculoYPropietario[1],formato));
				prop.setDniPropietario(VehiculoYPropietario[2]);
				prop.setFechaCompra(LocalDate.parse(VehiculoYPropietario[3],formato));
				
				Inicio.listaPropietarios.add(prop);
				Inicio.listaVehiculos.add(veh);
			}
			
			fr.close();
			bf.close();
			
		}catch(IOException e) {}
		
	}

}
