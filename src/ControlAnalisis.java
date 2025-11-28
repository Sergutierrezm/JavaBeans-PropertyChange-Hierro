import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.Serializable;

public class ControlAnalisis implements PropertyChangeListener, Serializable {
   
    
    //metodo que se ejecuta automaticamente
    
    @Override
    public void propertyChange(PropertyChangeEvent evt){
        
        //comprobamos que propiedad ha cambiado
        
        if(evt.getPropertyName().equals("hierro")){
            
            //obtenemos el nuevo valor de hierro
            double nuevoHierro = (double) evt.getNewValue();
            
            //logica: Si el hierro supera 10, se lanza el aviso
            
            if(nuevoHierro > 10){
                System.out.println("AVISO: El hierro supera 10. Se requiere un nuevo analisis");
            }else{
                System.out.println("El analisis es correcto");
            }
        }
        
        
    }
    
    
    
    
    
    
    
}
