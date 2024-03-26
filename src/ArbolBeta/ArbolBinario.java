
package ArbolBeta;

/**
 *
 * @author Sergio
 */
public class ArbolBinario{
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
    
        public void insertarNodo(Object valor){
        raiz = insertarNodoRecursivo(raiz, valor);
    }

    private Nodo insertarNodoRecursivo(Nodo nodo, Object valor){
        if(nodo == null){
            return new Nodo(valor);
        }   

        int comparacion = ((Comparable)valor).compareTo((Comparable)nodo.getDato());

        if(comparacion < 0){
            nodo.setIzdo(insertarNodoRecursivo(nodo.getIzdo(), valor));
        }else if(comparacion > 0){
            nodo.setDcho(insertarNodoRecursivo(nodo.getDcho(), valor));
        }else{
        // El valor ya existe en el árbol, no se inserta
        }

        return nodo;
    }


}