package proyectojava;

/**
 *
 * @author manana
 */
public class Usuario {
    private String nombre;
    private CuentaJuego cuentaJuego;
    private int puntos;
    private int monedas;

    public Usuario(String nombre) {
        this.nombre = nombre;
        this.cuentaJuego = new CuentaJuego(nombre);
        this.puntos = 0;
        this.monedas = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public CuentaJuego getCuentaJuego() {
        return cuentaJuego;
    }

    public void setCuentaJuego(CuentaJuego cuentaJuego) {
        this.cuentaJuego = cuentaJuego;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public int getMonedas() {
        return monedas;
    }

    public void setMonedas(int monedas) {
        this.monedas = monedas;
    }
}
