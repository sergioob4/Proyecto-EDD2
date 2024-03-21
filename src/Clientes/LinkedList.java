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
    
    public void addfirst(Object data){
        Nodo newnodo = new Nodo(data);
        if(pfirst == null){
            pfirst = plast = newnodo;
        }else{
            newnodo.setnext(pfirst);
            pfirst = newnodo;
    }
        size++;
    }
    
    public void addlast(Object data){
    
        Nodo newnodo = new Nodo(data);
        if (pfirst == null) {
            pfirst = plast = newnodo;
            
        }else{
            plast.setnext(newnodo);
            plast = newnodo;
        }
        size++;
    }
    public boolean isempty(){
        return pfirst == null;
    }
    
    public void empty(){
    
        this.pfirst = null;
        this.plast = null;
        this.size = 0;
    }
    
    public void deleteatstart(){
    
        if (!this.isempty()) {
            if (size == 1) {
                this.empty();
                
            }else{
                pfirst = pfirst.getnext();
                size--;
            }
            
        }
    }
    
    public void deletevalue(T value){
    
        if (!this.isempty()) {
            if (size == 1) {
                this.empty();
                
            }else{
                Nodo x = pfirst;
                while((!value.equals(x.getnext().getData()))){
                    x = x.getnext();
                }
                x.setnext(x.getnext().getnext());
            }
            size --;
        }
    }
    

     public void deletekey(String key){
    
        if (!this.isempty()) {
            if (size == 1) {
                this.empty();
                
            }else{
                Nodo x = pfirst;
                while((!key.equals(x.getnext().getData()))){
                    x = x.getnext();
                }
                x.setnext(x.getnext().getnext());
            }
            size --;
        }
    }
    
    
    
    public void print(){
    
        Nodo temp = pfirst;
        if (!this.isempty()) {
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
