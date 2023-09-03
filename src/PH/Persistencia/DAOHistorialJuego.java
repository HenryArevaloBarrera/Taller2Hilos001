package PH.Persistencia;

import PH.Logica.Modelo.Historial;
import PH.Persistencia.Utilidades.Archivo;

import java.util.ArrayList;

public class DAOHistorialJuego {
    public final static String RUTA="historialJuego.csv";
    public void crearRegistro(ArrayList<Historial> datosH){
        for (int i = 0; i <datosH.size() ; i++) {
            String dato = "";
            dato =
                    datosH.get(i).getNombreUsuario()+","+
                            datosH.get(i).getValorObtenido();
            new Archivo().AgregarContenidoArchivo(RUTA,dato);
        }
    }
    public ArrayList<Historial> obtenerHistorial(){
        ArrayList<String> Datos=new Archivo().GetInfoContenido(RUTA);
        ArrayList<Historial> listaHistorial=new ArrayList<>();
        Historial h;
        for (int i = 0; i <Datos.size() ; i++) {
            h=new Historial();
            String[] fila=Datos.get(i).split(",");
            h.setNombreUsuario(fila[0]);
            h.setValorObtenido(Integer.parseInt(fila[1]));
           listaHistorial.add(h);
        }
        return listaHistorial;
    }


}
