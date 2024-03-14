/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clientes;

/**
 *
 * @author Carl
 */
public class Entrada<T> {
    private int hashkey;
    private String key;
    private T value;
    private Entrada<T> next;

    public Entrada( String key,int hashkey, T value) {
        this.hashkey = hashkey;
        this.key = key;
        this.value = value;
        this.next = null;
    }

    public int getHashkey() {
        return hashkey;
    }

    public void setHashkey(int hashkey) {
        this.hashkey = hashkey;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Entrada<T> getNext() {
        return next;
    }

    public void setNext(Entrada<T> next) {
        this.next = next;
    }
    
    
}
