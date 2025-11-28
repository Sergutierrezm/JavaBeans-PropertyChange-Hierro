
import java.util.HashSet;




public class Hospital {


    public static void main(String[] args) {
       
        Persona persona = new Persona();
        persona.setNombre("Sergio");
        persona.setHierro(5);
        
        ControlAnalisis control = new ControlAnalisis();
        
        persona.addPropertyChangeListener(control);
        
        System.out.println("Actualizado nivel de hierro");
        persona.setHierro(8);
        
        
        
        
        
        
        
        
        
    }
    
}
