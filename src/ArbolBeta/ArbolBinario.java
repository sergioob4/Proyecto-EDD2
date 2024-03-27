
package ArbolBeta;

/**
 *
 * @author Sergio
 */
public class ArbolBinario{
    
    

    public Nodo getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }
    protected Nodo raiz;
    
    public ArbolBinario(){
        raiz = null;
    }
    public ArbolBinario(Nodo raiz){
        this.raiz = raiz;
	 	 }
    public Nodo raizArbol(){
        return raiz;
	 	 }
// Comprueba el estatus del árbol
    boolean esVacio(){
        return raiz == null;
	}
    
//Crea un nuevo arbol    C
    public static Nodo nuevoArbol(Nodo ramaIzqda, Object dato, Nodo ramaDrcha){
        return new Nodo(ramaIzqda, dato, ramaDrcha);
    }

    // Recorrido de un árbol binario en preorden
    public static void preorden(Nodo r){
        if (r != null)
	 {
            r.visitar();
            preorden (r.subarbolIzdo());
            preorden (r.subarbolDcho());
	 }
    }
// Recorrido de un árbol binario en inorden
    public static void inorden(Nodo r){
        if (r != null)
	 {
            inorden (r.subarbolIzdo());
            r.visitar();
            inorden (r.subarbolDcho());
	 }
    }
// Recorrido de un árbol binario en postorden
    public static void postorden(Nodo r){
    if (r != null)
	{
        postorden (r.subarbolIzdo());
        postorden (r.subarbolDcho());
        r.visitar();
	}
    }
    
    public void insertarEnRaiz(Object objeto) throws Exception {
    // Convertir el objeto a un Nodo
        Nodo nodo = new Nodo(objeto);

    // Si el árbol está vacío, el nodo se convierte en la raíz
        if (raiz == null) {
            raiz = nodo;
        } else {
        // Crear un nuevo nodo que será la nueva raíz
            Nodo nuevaRaiz = new Nodo(raiz.getDato());
            nuevaRaiz.izdo = raiz;

        // Insertar el nodo como hijo izquierdo de la nueva raíz
            nuevaRaiz.dcho = nodo;

        // Reemplazar la raíz por la nueva raíz
            raiz = nuevaRaiz;
    }
}




}