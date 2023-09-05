package PH.Logica.Control;

import PH.Logica.Modelo.Historial;
import PH.Logica.Modelo.Maquina;
import PH.Persistencia.DAOHistorialJuego;
import PH.Persistencia.DAOMaquina;

import java.util.ArrayList;

public class ControlMaquina {
    private int numero;

    public ControlMaquina() {
        this.numero=3;
    }

    public void registro(String nombre, String valorFinal){
    ArrayList<Historial> listaHistorial = new ArrayList<>();
    Historial his;
   his= new Historial();
    his.setNombreUsuario(nombre);
    his.setValorObtenido(Integer.parseInt(valorFinal));
    listaHistorial.add(his);
   new DAOHistorialJuego().crearRegistro(listaHistorial);
}
public void dineroMaquina(String valorFinal){
    DAOMaquina dm=new DAOMaquina();
    Maquina m;
    if(dm.obtenerMonto()==null){
        m=new Maquina();
        m.setId("M1");
        m.setDineroMaquina(100000);
        new DAOMaquina().IngresarMonto(m);
    }else{
        m=new Maquina();
        m.setId("M1");
        m.setDineroMaquina(Integer.parseInt(valorFinal)+ dm.obtenerMonto().getDineroMaquina());
       dm.IngresarMonto(m);
    }
}
public int gananciaTriple(int valor){
    return valor*2;
}
public int gananciaDoble(int valor){
    int valor2= (int) (valor*1.2);
    return valor2;
}
public int perdida(int valor){
    return valor/2;
}
public boolean finalJuego(int valor){
    boolean estado= valor/2 <=100 ? true:false;
    return estado;
}
public int conteo(int num){
    System.out.println("pasado"+num);
    num --;
    setNumero(num);
    System.out.println("Generado"+getNumero());
    return num;
}

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}

