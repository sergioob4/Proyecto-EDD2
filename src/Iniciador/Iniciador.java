
package Iniciador;

import Interfaz.Inicio;
import Clientes.Load;
import Clientes.TablaHash;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Iniciador {
    
    public static void main(String[] args) throws FileNotFoundException{
        Inicio i = new Inicio();
        Load a = new Load();
        try {
            a.cargardatosestado();
            a.cargardatosreservas();
            a.cargardatoshistorial();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
        i.setVisible(true); //Iniciar el programa
        
    }
}
