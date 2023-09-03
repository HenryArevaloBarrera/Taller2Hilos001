package PH.Logica.Modelo;

public class Historial {
    private String nombreUsuario;
    private int valorObtenido;

    public Historial() {}

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public int getValorObtenido() {
        return valorObtenido;
    }

    public void setValorObtenido(int valorObtenido) {
        this.valorObtenido = valorObtenido;
    }
}
