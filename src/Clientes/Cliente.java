
package Clientes;
	
import java.util.Date;



/**
 *
 * @author Sergio
 */
public class Cliente {
    String ci="";
    String primer_nombre ="";
    String segundo_nombre="";
    String email="";
    String genero="";
    String tipo_hab="";
    String celular="";
    Date llegada = new Date();
    Date salida = new Date();

    public Cliente() {
        this.ci=ci;
        this.primer_nombre=primer_nombre;
        this.segundo_nombre=segundo_nombre;
        this.email=email;
        this.genero=genero;
        this.tipo_hab=tipo_hab;
        this.celular=celular;
        this.llegada=llegada;
        this.salida=salida;
    }

    public String getCi() {
        return ci;
    }

    public String getPrimer_nombre() {
        return primer_nombre;
    }

    public String getSegundo_nombre() {
        return segundo_nombre;
    }

    public String getEmail() {
        return email;
    }

    public String getGenero() {
        return genero;
    }

    public String getTipo_hab() {
        return tipo_hab;
    }

    public String getCelular() {
        return celular;
    }

    public Date getLlegada() {
        return llegada;
    }

    public Date getSalida() {
        return salida;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public void setPrimer_nombre(String primer_nombre) {
        this.primer_nombre = primer_nombre;
    }

    public void setSegundo_nombre(String segundo_nombre) {
        this.segundo_nombre = segundo_nombre;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setTipo_hab(String tipo_hab) {
        this.tipo_hab = tipo_hab;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public void setLlegada(Date llegada) {
        this.llegada = llegada;
    }

    public void setSalida(Date salida) {
        this.salida = salida;
    }
    
    

    
    
    
}
