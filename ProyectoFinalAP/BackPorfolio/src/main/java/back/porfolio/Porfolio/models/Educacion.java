
package back.porfolio.Porfolio.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Educacion {
        
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idedu;
    private String tituloedu;
    private int fechaedu;
    private String descriedu;
    private String imagenedu;
    @ManyToOne
    private Usuario usuario;

    public Educacion() {
    }

    public Educacion(Long idedu, String tituloedu, int fechaedu, String descriedu, String imagenedu) {
        this.idedu = idedu;
        this.tituloedu = tituloedu;
        this.fechaedu = fechaedu;
        this.descriedu = descriedu;
        this.imagenedu = imagenedu;
    }

    public Long getIdedu() {
        return idedu;
    }

    public void setIdedu(Long idedu) {
        this.idedu = idedu;
    }

    public String getTituloedu() {
        return tituloedu;
    }

    public void setTituloedu(String tituloedu) {
        this.tituloedu = tituloedu;
    }

    public int getFechaedu() {
        return fechaedu;
    }

    public void setFechaedu(int fechaedu) {
        this.fechaedu = fechaedu;
    }

    public String getDescriedu() {
        return descriedu;
    }

    public void setDescriedu(String descriedu) {
        this.descriedu = descriedu;
    }

    public String getImagenedu() {
        return imagenedu;
    }

    public void setImagenedu(String imagenedu) {
        this.imagenedu = imagenedu;
    }
    
    
}
