
import java.util.ArrayList;


public class Equipo {
  String nombre;
  Double presupuesto;
  int copas;
  String estadio;
  ArrayList<Jugador> lista=new ArrayList();

    public Equipo() {
    }

    public Equipo(String nombre, Double presupuesto, int copas, String estadio) {
        this.nombre = nombre;
        this.presupuesto = presupuesto;
        this.copas = copas;
        this.estadio = estadio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(Double presupuesto) {
        this.presupuesto = presupuesto;
    }

    public int getCopas() {
        return copas;
    }

    public void setCopas(int copas) {
        this.copas = copas;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    public ArrayList<Jugador> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Jugador> lista) {
        this.lista = lista;
    }

    @Override
    public String toString() {
        return  nombre +" Copas: "+copas;
    }
        
}
