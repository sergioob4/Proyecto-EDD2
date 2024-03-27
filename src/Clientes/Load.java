
package Clientes;

import Interfaz.*;
import Clientes.Cliente;
import java.awt.Component;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import ArbolBeta.*;

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
        TablaHash reservas;
        String data1[];
        TablaHash historial;
        String data2[];
        ArbolBinario j = new ArbolBinario();
        ArbolBinario Reserva = new ArbolBinario();
        
    public TablaHash getEstado() {
        return estado;
    }
    
    public TablaHash getReservas() {
        return reservas;
    }
    
    public Load() {
        this.estado = new TablaHash();
        this.historial = new TablaHash();
        this.reservas = new TablaHash();
        
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
                estado.put(key, data);
                for (int i = 0; i < estado.getTablahash().length; i++) {
                
                System.out.println(a);
                break;
            }
                
            }
            JOptionPane.showMessageDialog(null, "Se han añadido los estados");
            
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "No se cargaron los estados");
            
            
         
    }
    }   
    /**
     *
     * @param setVisible
     * @throws FileNotFoundException
     */
    public void cargardatosreservas() throws FileNotFoundException{
    
 
        try (Scanner scFile = new Scanner(new File("C:\\Users\\Familia Reyes\\OneDrive\\Desktop\\Proyecto 2\\Proyecto-EDD2\\reservas.csv"))){
            
            if (scFile.nextLine().contains("ci")) {
                scFile.nextLine();
            }
    
            while(scFile.hasNextLine()){
                data1 = scFile.nextLine().split(",");
                a = new Cliente(data1[0],data1[1],data1[2],data1[3],data1[4],data1[5],data1[6],data1[7],data1[8],"");
                String key = this.a.getPrimer_nombre() + this.a.getSegundo_nombre();
                int hashkey = a.hashCode();
                reservas.put(key, data1);
                for (int i = 0; i < reservas.getTablahash().length; i++) {
                
                System.out.println(a);
                break;
            }
                
            }
            JOptionPane.showMessageDialog(null, "Se han añadido las reservas");
            
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "No se cargaron las reservas");
            
            
         
    }
    }
    
    
    public void cargardatoshistorial() throws FileNotFoundException{
    
        try (Scanner scFile = new Scanner(new File("C:\\Users\\Familia Reyes\\OneDrive\\Desktop\\Proyecto 2\\Proyecto-EDD2\\historico.csv"))){
            
            if (scFile.nextLine().contains("num_hab")) {
                scFile.nextLine();
            }
    
            while(scFile.hasNextLine()){
                data2 = scFile.nextLine().split(",");
                a = new Cliente(data2[0],data2[1].toLowerCase(),data2[2].toLowerCase(),data2[3].toLowerCase(),"","","",data2[5],"",data2[6]);
                String key = this.a.getPrimer_nombre() + this.a.getSegundo_nombre();
                int hashkey = key.hashCode();
                historial.put(key, data2);
                for (int i = 0; i < historial.getTablahash().length; i++) {
                System.out.println(a);
                break;
            }
                
            }
            JOptionPane.showMessageDialog(null, "Se ha añadido el historico");
            
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "No se cargo el historico");
            
       
           
       }
    }
    
    public void cargarhistorialsarbol() throws Exception{
        
        for (int i = 0; i < historial.getTablahash().length; i++) {
                j.insertarEnRaiz(historial.getListaentrada());
                System.out.println(j.getRaiz().valorNodo(a));
                break;
                
            }
        

    }
    
    public void cargarReservasArbol(){
           for (int i = 0; i < reservas.getTablahash().length; i++) {
                //Reserva.insertarEnRaiz(reservas.getListaentrada()); da error 
                System.out.println(Reserva.getRaiz().valorNodo(a));
                break;
                
            }
           
    }
           
    public void checkIn(Object i){
        //Ver si el cliente esta en las reservas 
        
        Nodo e = new Nodo(i);
        
        
        
    }
    
    public void checkOut(Object x){
        
        Nodo o = new Nodo(x);
        
        
        

        
        
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


