
package back.porfolio.Porfolio.services;

import back.porfolio.Porfolio.exception.UserNotFoundException;
import back.porfolio.Porfolio.models.Educacion;
import back.porfolio.Porfolio.repository.EducacionRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class EducacionService {
       private final EducacionRepo educacionRepo;
       
       
       @Autowired
       public EducacionService(EducacionRepo educacionRepo){
           this.educacionRepo = educacionRepo;
       }
       public Educacion agrearEducacion(Educacion educacion){
           return educacionRepo.save(educacion);
       }
       public List<Educacion> buscarEdu(){
           return educacionRepo.findAll();
       }
       public Educacion editarEducacion(Educacion educacion){
           return educacionRepo.save(educacion);
       }
       public void borrarEducacion(Long id){
           educacionRepo.deleteById(id);
       }
      
}
