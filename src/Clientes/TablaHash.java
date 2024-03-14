/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clientes;

import javax.swing.JOptionPane;




/**
 *
 * @author Carl
 */
public class TablaHash<T> { // Constructor
    
    static final int tamtabla = 1061;
    private int tableSize;
    //Donde se almacenan los datos
    private Entrada<T>[] tablahash;
    
    //Lista de entradas para la reduccion de la complejidad 
    
    private final  LinkedList<T> Listaentrada;

    public TablaHash() {
        this.tablahash = new Entrada[tamtabla];
        this.Listaentrada = new LinkedList();
        this.tableSize = 0;
    }
    
    public boolean KeyExiste(String key){
        
        int hashedKey = key.toLowerCase().hashCode();
        int hash = Math.abs(hashFuntion(hashedKey));
        
        if (this.tablahash[hash] == null) {
            return false;
            
        }else{
           Entrada<T> nododentro =  this.tablahash[hash];
           while (nododentro != null){
               if ((nododentro.getHashkey() == hashedKey) && (nododentro.getKey().equals(key.toLowerCase()))) { 
                   return true;
                   
               }
               
               nododentro = nododentro.getNext();
           }
           
        }
        return false;
    }
    
    
    private void put(String key, T value){
            
        int hashedkey = key.toLowerCase().hashCode();
        int hash = hashFuntion(hashedkey);
        hash = Math.abs(hash);
        Entrada<T> Nuevaentrada = new Entrada<>(key.toLowerCase(), hashedkey, value);
        
        if (tablahash[hash] == null) {
            tablahash[hash] = Nuevaentrada;
            
        }else{
            Entrada<T> estaentrada = this.tablahash[hash];
            
            while (estaentrada.getNext()!= null){
            
                estaentrada = estaentrada.getNext();
            }
            
            estaentrada.setNext(Nuevaentrada);
        }
        
        this.Listaentrada.AddLast(value);
    }
    
    private int hashFuntion(int  key){
    int hash = key % this.tamtabla;
    return hash;
    }
    
    
    public T get(String key){
        int hashedkey = key.toLowerCase().hashCode();
        int hash = Math.abs(hashFuntion(hashedkey));
        Entrada<T> retorna = this.tablahash[hash];
        while( retorna != null ){
            if ((retorna.getHashkey() == hashedkey)&& retorna.getKey().equals(key.toLowerCase())) {
                return retorna.getValue();
                
            }
            retorna = retorna.getNext();
        }
        return null;
    }
    
    public void delete(String key){
        int hashedkey = key.toLowerCase().hashCode();
        int hash = Math.abs(hashFuntion(hashedkey));
        
        if (this.tablahash[hash]== null) {
            JOptionPane.showMessageDialog(null, "No hay elemento asociado con la key" + key.toLowerCase());
            
        }else{
            
            //Conseguir el siguiente elemento en la lista de colisiones si existe
            Entrada<T> nododentro = this.tablahash[hash].getNext();
            
            //Eliminamos la entrada de la lista de entry
            //HACER UN WHILE DONDE LA COMPARATIVA SEA TRUE Y SI ES TRUE SE BORRA, SI NO CAMBIAS
            this.Listaentrada.DeleteAtStart(((nododentro.getHashkey() == hashedkey)&& nododentro.getKey().equals(key.toLowerCase())));
            
            
        }
        
        private void clear(){
        this.tablahash = new Entrada[this.tamtabla];
        this.Listaentrada.Empty();
        this.tableSize = 0;
       }
        
    }
    
    
    
  
    
            
      

