/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clientes;

/**
 *
 * @author Carl
 * @param <T>
 */
public class LinkedList <T> {
    Nodo pfirst;
    Nodo plast;
    int size;
    
    public LinkedList(){
    
        this.pfirst = null;
        this.plast = null;
        this.size = 0;
    }
    
    public void AddFirst(Object data){
        Nodo newnodo = new Nodo(data);
        if(pfirst == null){
            pfirst = plast = newnodo;
        }else{
            newnodo.setnext(pfirst);
            pfirst = newnodo;
    }
        size++;
    }
    
    public void AddLast(Object data){
    
        Nodo newnodo = new Nodo(data);
        if (pfirst == null) {
            pfirst = plast = newnodo;
            
        }else{
            plast.setnext(newnodo);
            plast = newnodo;
        }
        size++;
    }
    public boolean IsEmpty(){
        return pfirst == null;
    }
    
    public void Empty(){
    
        this.pfirst = null;
        this.plast = null;
        this.size = 0;
    }
    
    public void DeleteAtStart(){
    
        if (!this.IsEmpty()) {
            if (size == 1) {
                this.Empty();
                
            }else{
                pfirst = pfirst.getnext();
                size--;
            }
            
        }
    }
    
    public void Print(){
    
        Nodo temp = pfirst;
        if (!this.IsEmpty()) {
            System.out.println("La lista esta vacia...");
            
        }
        while(temp!=null){
            System.out.println(temp);
            temp = temp.getnext();
        }
    }

    public Nodo getPfirst() {
        return pfirst;
    }

    public void setPfirst(Nodo pfirst) {
        this.pfirst = pfirst;
    }

    public Nodo getPlast() {
        return plast;
    }

    public void setPlast(Nodo plast) {
        this.plast = plast;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
