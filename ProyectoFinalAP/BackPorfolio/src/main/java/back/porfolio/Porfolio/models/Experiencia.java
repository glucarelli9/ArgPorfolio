/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package back.porfolio.Porfolio.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idexp;
    private String tituloexp;
    private int fechaexp;
    private String descriexp;
    private String imagenexp;

    public Experiencia() {
    }

    public Experiencia(Long idexp, String tituloexp, int fechaexp, String descriexp, String imagenexp) {
        this.idexp = idexp;
        this.tituloexp = tituloexp;
        this.fechaexp = fechaexp;
        this.descriexp = descriexp;
        this.imagenexp = imagenexp;
    }

    public Long getIdexp() {
        return idexp;
    }

    public void setIdexp(Long idexp) {
        this.idexp = idexp;
    }

    public String getTituloexp() {
        return tituloexp;
    }

    public void setTituloexp(String tituloexp) {
        this.tituloexp = tituloexp;
    }

    public int getFechaexp() {
        return fechaexp;
    }

    public void setFechaexp(int fechaexp) {
        this.fechaexp = fechaexp;
    }

    public String getDescriexp() {
        return descriexp;
    }

    public void setDescriexp(String descriexp) {
        this.descriexp = descriexp;
    }

    public String getImagenexp() {
        return imagenexp;
    }

    public void setImagenexp(String imagenexp) {
        this.imagenexp = imagenexp;
    }

   
    
    
           
}
