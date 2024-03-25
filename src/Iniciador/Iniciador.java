
package Iniciador;

import Interfaz.Inicio;
import Clientes.Load;
import java.io.FileNotFoundException;

public class Iniciador {
    
    public static void main(String[] args) throws FileNotFoundException{
        Inicio i = new Inicio();
        
        i.setVisible(true); //Iniciar el programa
        Load.CargarDatos();
    }
}
