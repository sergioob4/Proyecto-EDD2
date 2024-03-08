/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clientes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
Aqui donde se deberian cargar los clientes del excell

*/
public class Load {
    public static void CargarDatos() throws FileNotFoundException{
    
        LinkedList <Cliente> Listaclientes = new LinkedList<>();
        Cliente a;
        String data[];
        try (Scanner scFile = new Scanner(new File("C:\\Users\\Carl\\Desktop\\Proyecto-2 EDD\\Proyecto-EDD2\\reservas.csv"))){
            while(scFile.hasNextLine()){
                data = scFile.nextLine().split(",");
                a = new Cliente(data[0],data[1],data[2],data[3],data[4],data[5],data[6],data[7],data[8]);
                Listaclientes.AddFirst(a);
                
                //for (int i = 0; i < Listaclientes.size; i++) {
                    //JOptionPane.showMessageDialog(null, a);
        //}
            }
            JOptionPane.showMessageDialog(null, "Se han añadido las reservas");
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
