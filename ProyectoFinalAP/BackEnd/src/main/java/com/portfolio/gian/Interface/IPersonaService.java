
package com.portfolio.gian.Interface;

import com.portfolio.gian.Entity.Persona;
import java.util.List;

public interface IPersonaService {
        // persona pull
    public List<Persona> getPersona();
    
    
    // Guardar un Objeto
    
    public void savePersona(Persona persona);
    
    // Eliminar User
    
    public void deletePersona(Long id);
    
    //Buscar Persona por id
    
    public Persona findPersona(Long id);
}
