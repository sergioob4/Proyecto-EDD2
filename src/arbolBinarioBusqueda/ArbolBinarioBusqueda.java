
package arbolBinarioBusqueda;
import ArbolBeta.*;

/**
 *
 * 
 * @author Sergio
 */
public class ArbolBinarioBusqueda extends ArbolBinario {
    
    public ArbolBinarioBusqueda(){
        super();
    }
    
    
    //Meotdo buscar un dato 
    public Nodo buscar(Object buscado){
        Comparador dato;
        dato = (Comparador) buscado;
        if (raiz == null)
        {
        return null;
        }else{
            return localizar(raizArbol(), dato);
        }
        
    }
    
     //Meotodo busca mediante la referencia del raiz del subarbol
    protected Nodo localizar(Nodo raizSub, Comparador buscado){
        if (raizSub == null){
            return null;
        }else if (buscado.igualQue(raizSub.getDato())){
            return raiz;
        }else if (buscado.menorQue(raizSub.getDato())){
            return localizar(raizSub.subarbolIzdo(), buscado);
        }else{
            return localizar (raizSub.subarbolDcho(), buscado);
        }
        
    } 
    
    public void insertar (Object valor )throws Exception{
        Comparador dato;
        dato = (Comparador) valor;
        raiz = insertar(raiz, dato);
    }
//método interno para realizar la operación
    protected Nodo
    insertar(Nodo raizSub, Comparador dato) throws Exception{
    if (raizSub == null){
        raizSub = new Nodo(dato);
    }else if (dato.menorQue(raizSub.getDato())){
            Nodo iz;
            iz = insertar(raizSub.subarbolIzdo(), dato);
            raizSub.ramaIzdo(iz);
    }else if (dato.mayorQue(raizSub.getDato())){
            Nodo dr;
            dr = insertar(raizSub.subarbolDcho(), dato);
            raizSub.ramaDcho(dr);
    }else{
        throw new Exception("Nodo duplicado");
        }
    return raizSub;
    }
    
}
