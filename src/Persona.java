
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;

/**
 *
 * @author sergiogutierrez
 */
public class Persona implements Serializable {

    private String nombre;
    private double hierro;
    private double urea;

    //Gestiona los eventos
    //PropertyChangeSupport permite lanzar eventos a los receptores
    private PropertyChangeSupport propertySupport;

//Constructor vacio
//Iniciamos propertySupport
    public Persona() {
        propertySupport = new PropertyChangeSupport(this);
    }

//Constructor vacio
//Iniciamos propertySupport
//getter y setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getHierro() {
        return hierro;
    }

    public void setHierro(double hierro) {

        //valor anterior
        double valorAntiguo = this.hierro;

        //actualizamos el valor
        this.hierro = hierro;

        //Se lanza el evento
        //1. nombre de la propiedad
        //2.valor antiguo
        //3. valor nuevo
        propertySupport.firePropertyChange("hierro", valorAntiguo, hierro);
    }

    public double getUrea() {
        return urea;
    }

    public void setUrea(double area) {
        this.urea = urea;
    }

//metodo para añadir Listener
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.addPropertyChangeListener(listener);
    }

//metodo para quitar Listener
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.removePropertyChangeListener(listener);
    }

}
