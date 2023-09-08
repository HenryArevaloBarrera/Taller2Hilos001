package PH.Persistencia;

import PH.Logica.Modelo.Maquina;
import PH.Persistencia.Utilidades.Archivo;

import java.util.ArrayList;

public class DAOMaquina {
    public final static String RUTA="src/PH/Presentacion/Recursos/dineroMaquina.csv";
    public void IngresarMonto(Maquina datosM){
        String dato= datosM.getId()+","+
                datosM.getDineroMaquina();
        new Archivo().SobreEscribirArchivo(RUTA,dato);
    }
    public Maquina obtenerMonto(){
        ArrayList<String> Datos=new Archivo().GetInfoContenido(RUTA);
        Maquina maquina = new Maquina();
        for (int i = 0; i <Datos.size() ; i++) {
            String[] fila=Datos.get(i).split(",");
            maquina.setId(fila[0]);
            maquina.setDineroMaquina(Integer.parseInt(fila[1]));
        }
        return maquina;
    }
}