package PH.Persistencia.Utilidades;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Clase de propiedad para crear y Cargar las propiedades que se encuentran disponibles
 * Nueva documentacion de prueba
 * @version 1.0
 * @author Camilo Bohorquez�
 * 
 */


public class Propiedad {
	
	/**
	 * M�todo para Obtner propiedad de un archivo
	 * @param  NombreArchivo Nombre de archivos donde se almacenara la propiedad 
	 * @param  NombrePropiedad Nombre e la propieda a extraer 
	 * @return Retorna el valor de la porpiedad que se desea
	 */

	public String obtenerPropiedad(String NombreArchivo, String NombrePropiedad ){
		 
		Properties propiedades = new Properties();
		InputStream entrada = null;
		//Revisar existencia de Archivo
		try {
			entrada = new FileInputStream(NombreArchivo);

		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		//

		try {
			propiedades.load(entrada);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return propiedades.getProperty(NombrePropiedad);


	} //Cierre del m�todo

	/**
	 * M�todo para agregar Propiedades
	 * @param  Nombre NOmbre de la propiedad
	 * @param  Valor valor de la propiedad 
	 * 
	 */
	
	
	public void addPropiedad(String Nombre, String Valor){
	 
		Properties p = new Properties();
		p.setProperty(Nombre, Valor);
		try {
			p.store(new FileWriter("Resources/ValorParametro.properties",true), "Nueva Propiedad: "+Nombre );
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}//Cierre del m�todo
	
	



}//Cierre del m�todo
