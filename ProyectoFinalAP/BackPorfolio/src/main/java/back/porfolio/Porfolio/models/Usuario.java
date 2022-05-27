
package back.porfolio.Porfolio.models;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Usuario implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String nombre;
    private String apellido;
    private String titulo;
    @Column(length = 1000)
    private String descipcion;
    private String img;
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy="idedu")
    private List<Educacion> EducacionList;
    @OneToMany(fetch = FetchType.LAZY, mappedBy="idSkill")
    private List<Skills> SkillsList;
    @OneToMany(fetch = FetchType.LAZY, mappedBy="idexp")
    private List<Experiencia> ExperienciaList;

    public Usuario() {
    }

    public Usuario(Long id, String nombre, String apellido, String titulo, String descipcion, String img) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.titulo = titulo;
        this.descipcion = descipcion;
        this.img = img;
    }

  

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescipcion() {
        return descipcion;
    }

    public void setDescipcion(String descipcion) {
        this.descipcion = descipcion;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    
}
