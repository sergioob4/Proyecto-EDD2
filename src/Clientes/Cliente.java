
package Clientes;
	
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.Objects;
import java.util.Scanner;



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
    String num_hab;

    public Cliente(String ci,String primer_nombre,String segundo_nombre,String email,String genero,String tipo_hab,String celular,String llegada,String salida,String num_hab) {
        this.ci=ci;
        this.primer_nombre=primer_nombre;
        this.segundo_nombre=segundo_nombre;
        this.email=email;
        this.genero=genero;
        this.tipo_hab=tipo_hab;
        this.celular=celular;
        this.llegada=llegada;
        this.salida=salida;
        this.num_hab= num_hab;
    }

    @Override
    public String toString() {
        return "Cliente{" + "ci=" + ci + ", primer_nombre=" + primer_nombre + ", segundo_nombre=" + segundo_nombre + ", email=" + email + ", genero=" + genero + ", tipo_hab=" + tipo_hab + ", celular=" + celular + ", llegada=" + llegada + ", salida=" + salida + ", num_habitacion=" + num_hab + '}';
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
    
    
    
    /**
     *
     * @return
     */
    @Override
    public int hashCode() {
       //TODO: check for nulls
       //return surname.hashCode() ^ name.hashCode() ^ secondName.hashCode() ^ (birthday.hashCode());
       return (ci  + primer_nombre + segundo_nombre + email + genero + tipo_hab + celular + llegada + salida ).hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        if (!Objects.equals(this.ci, other.ci)) {
            return false;
        }
        if (!Objects.equals(this.primer_nombre, other.primer_nombre)) {
            return false;
        }
        if (!Objects.equals(this.segundo_nombre, other.segundo_nombre)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.genero, other.genero)) {
            return false;
        }
        if (!Objects.equals(this.tipo_hab, other.tipo_hab)) {
            return false;
        }
        if (!Objects.equals(this.celular, other.celular)) {
            return false;
        }
        if (!Objects.equals(this.llegada, other.llegada)) {
            return false;
        }
        return Objects.equals(this.salida, other.salida);
    }
}
