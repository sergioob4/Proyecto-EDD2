/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clientes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
Aqui donde se deberian cargar los clientes del excell

*/
public class Load {

    /**
     *
     * @throws FileNotFoundException
     */
        Cliente a;
        TablaHash estado;
        String data[];
        
    public TablaHash getEstado() {
        return estado;
    }
    
    public Load() {
        this.estado = new TablaHash();
    }
    
    public void cargardatosestado() throws FileNotFoundException{
    
        
        try (Scanner scFile = new Scanner(new File("C:\\Users\\Familia Reyes\\OneDrive\\Desktop\\Proyecto 2\\Proyecto-EDD2\\estado.csv"))){
            
            if (scFile.nextLine().contains("num_hab")) {
                scFile.nextLine();
            }
    
            while(scFile.hasNextLine()){
                data = scFile.nextLine().split(",");
                a = new Cliente("",data[1].toLowerCase(),data[2].toLowerCase(),data[3].toLowerCase(),data[4].toLowerCase(),"",data[5],data[6],"",data[0]);
                String key = this.a.getPrimer_nombre() + this.a.getSegundo_nombre();
                int hashkey = a.hashCode();
                System.out.println(hashkey);
                estado.put(key, data);
                for (int i = 0; i < estado.getTablahash().length; i++) {
                
                System.out.println(a);
                break;
            }
                
            }
            JOptionPane.showMessageDialog(null, "Se han añadido los estados");
            
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "No se cargaron las reservas");
            
            
         
    }
        
        
    

//public static ArrayList<Cliente> ListaClientes(Scanner sc){
    
    /*ArrayList<Cliente> al = new ArrayList<Cliente>();
    String ci;
    String primer_nombre;
    String segundo_nombre;
    String email;
    String genero;
    String tipo_hab;
    String celular;
    String llegada;
    String salida;
    Cliente c;
    do{
        System.out.println("CI: ");
        ci = sc.nextLine();
        if (!ci.equalsIgnoreCase("FIN")) {
            System.out.println("Nombre: ");
            primer_nombre = sc.nextLine();
            System.out.println("Apellido: ");
            segundo_nombre = sc.nextLine();
            System.out.println("Email: ");
            email = sc.nextLine();
            System.out.println("Genero: ");
            genero = sc.nextLine();
            System.out.println("Tipo de habitacion: ");
            tipo_hab = sc.nextLine();
            System.out.println("Celular: ");
            celular = sc.nextLine();
            System.out.println("Fecha de llegada: ");
            llegada = sc.nextLine();
            System.out.println("Fecha de salida: ");
            salida = sc.nextLine();
            c = new Cliente(ci, primer_nombre, segundo_nombre, email, genero, tipo_hab, celular, llegada, salida);
            al.add(c);
            
            
            
        }
    }while (!ci.equalsIgnoreCase("FIN"));
    return al;
}*/
    
}
}

