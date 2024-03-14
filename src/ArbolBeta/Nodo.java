
package ArbolBeta;

/**
 *
 * @author Sergio
 */
public class Nodo{
    protected Object dato; //Raiz del arbol 
    protected Nodo izdo; //Rama izquierda
    protected Nodo dcho; //Rama derecha 
    
    
    public Nodo(Object valor){ //Constructor del la clase nodo 
	 
    dato = valor;
    izdo = dcho = null;
    }
    
    public Nodo(Nodo ramaIzdo, Object valor, Nodo ramaDcho){
    this.dato=valor;
    izdo = ramaIzdo;
    dcho = ramaDcho;
    }
// operaciones de acceso
    public Object valorNodo(Object valor){ return valor; }
    
    public Nodo subarbolIzdo(){ return izdo; }
    
    public Nodo subarbolDcho(){ return dcho; }
    
    public void nuevoValor(Object d){ dato = d; }
    
    public void ramaIzdo(Nodo n){ izdo = n; }
    
    public void ramaDcho(Nodo n){ dcho = n; }

    void visitar(){
        System.out.println(dato + " ");
    }

    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public Nodo getIzdo() {
        return izdo;
    }

    public void setIzdo(Nodo izdo) {
        this.izdo = izdo;
    }

    public Nodo getDcho() {
        return dcho;
    }

    public void setDcho(Nodo dcho) {
        this.dcho = dcho;
    }
    
    
}