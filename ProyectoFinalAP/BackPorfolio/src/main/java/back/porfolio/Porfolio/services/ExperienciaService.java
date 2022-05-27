/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package back.porfolio.Porfolio.services;

import back.porfolio.Porfolio.exception.UserNotFoundException;
import back.porfolio.Porfolio.models.Experiencia;
import back.porfolio.Porfolio.repository.ExperienciaRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ExperienciaService {
       private final ExperienciaRepo exprepo;
       
       @Autowired
       public ExperienciaService(ExperienciaRepo exprepo){
           this.exprepo = exprepo;
       }
       public Experiencia agrearexp(Experiencia exp){
           return exprepo.save(exp);
       }
       public List<Experiencia> buscarexp(){
           return exprepo.findAll();
       }
       public Experiencia editarexp(Experiencia exp){
           return exprepo.save(exp);
       }
       public void borrarexp(Long id){
           exprepo.deleteById(id);
       }
      
}
