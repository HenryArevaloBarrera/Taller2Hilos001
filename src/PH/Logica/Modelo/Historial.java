package PH.Logica.Modelo;

public class Historial {
    private String nombreUsuario;
    private int valorObtenido;

    public int getValorInicial() {
        return valorInicial;
    }

    public void setValorInicial(int valorInicial) {
        this.valorInicial = valorInicial;
    }

    private int valorInicial;

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
