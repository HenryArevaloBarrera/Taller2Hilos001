package PH.Logica.Control;

import PH.Logica.Modelo.Historial;
import PH.Logica.Modelo.Maquina;
import PH.Persistencia.DAOHistorialJuego;
import PH.Persistencia.DAOMaquina;

import java.util.ArrayList;

public class ControlMaquina {
public void registro(String nombre,String valorFinal){
    ArrayList<Historial> listaHistorial = new ArrayList<>();
    Historial his;
   his= new Historial();
    his.setNombreUsuario(nombre);
    his.setValorObtenido(Integer.parseInt(valorFinal));
    listaHistorial.add(his);
   new DAOHistorialJuego().crearRegistro(listaHistorial);
}
public void dineroMaquina(String valorFinal){
    Maquina m;
    if(new DAOMaquina().obtenerMonto()==null){
        m=new Maquina();
        m.setId("M1");
        m.setDineroMaquina(100000);
        new DAOMaquina().IngresarMonto(m);
    }else{
        m=new Maquina();
        m.setId("M1");
        m.setDineroMaquina(Integer.parseInt(valorFinal));
        new DAOMaquina().IngresarMonto(m);
    }
}




}

