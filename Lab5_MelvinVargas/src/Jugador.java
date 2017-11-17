
public class Jugador {
    String nombre;
    double precio;
    String posicion;
    String disponibilidad;
    int habilidad;
    int tecnica;
    int resistencia;

    public Jugador() {
    }

    public Jugador(String nombre, double precio, String posicion, String disponibilidad, int habilidad, int tecnica, int resistencia) {
        this.nombre = nombre;
        this.precio = precio;
        this.posicion = posicion;
        this.disponibilidad = disponibilidad;
        this.habilidad = habilidad;
        this.tecnica = tecnica;
        this.resistencia = resistencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public int getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(int habilidad) {
        this.habilidad = habilidad;
    }

    public int getTecnica() {
        return tecnica;
    }

    public void setTecnica(int tecnica) {
        this.tecnica = tecnica;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    @Override
    public String toString() {
        return nombre+","+" precio: "+precio+", "+posicion+", "+disponibilidad;
    }
    
}
