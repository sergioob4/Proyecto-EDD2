/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clientes;

/**
 *
 * @author Carl
 */
public class Nodo {
    
    Object data;
    Nodo next;
    
    public Nodo(Object data){
        
        this.data = data;
        this.next = null;
    }

    public Object getData() {
        return data;
    }

    public Nodo getnext() {
        return next;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public void setnext(Nodo pnext) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Nodo{" + "data=" + data + ", pnext=" + next + '}';
    }
    
}
