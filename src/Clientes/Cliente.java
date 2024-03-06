
package Clientes;
	
import java.util.Date;



/**
 *
 * @author Sergio
 */
public class Cliente {
    String ci;
    String primer_nombre;
    String segundo_nombre;
    String email;
    String genero;
    String tipo_hab;
    String celular;
    String llegada;
    String salida;

    public Cliente(String ci,String primer_nombre,String segundo_nombre,String email,String genero,String tipo_hab,String celular,String llegada,String salida) {
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

    @Override
    public String toString() {
        return "Cliente{" + "ci=" + ci + ", primer_nombre=" + primer_nombre + ", segundo_nombre=" + segundo_nombre + ", email=" + email + ", genero=" + genero + ", tipo_hab=" + tipo_hab + ", celular=" + celular + ", llegada=" + llegada + ", salida=" + salida + '}';
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

    public String getLlegada() {
        return llegada;
    }

    public String getSalida() {
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

    public void setLlegada(String llegada) {
        this.llegada = llegada;
    }

    public void setSalida(String salida) {
        this.salida = salida;
    }
    
    

    
    
    
}
