
package arbolBinarioBusqueda;

/**
 *
 * @author Sergio
 */

//Class nodo del arbolb busqueda 
public interface Comparador{
    boolean igualQue(Object q);
    boolean menorQue(Object q);
    boolean menorIgualQue(Object q);
    boolean mayorQue(Object q);
    boolean mayorIgualQue(Object q);
    
    
}
