/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package back.porfolio.Porfolio.services;

import back.porfolio.Porfolio.exception.UserNotFoundException;
import back.porfolio.Porfolio.models.Skills;
import back.porfolio.Porfolio.repository.SkillsRepo;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SkillsService {
    private final SkillsRepo skillsrepo;

    public SkillsService(SkillsRepo skillsrepo) {
        this.skillsrepo = skillsrepo;
    }
     public Skills agrearskill(Skills skills){
           return skillsrepo.save(skills);
       }
       public List<Skills> buscarskill(){
           return skillsrepo.findAll();
       }
       public Skills editarskill(Skills skills){
           return skillsrepo.save(skills);
       }
       public void borrarskill(Long id){
           skillsrepo.deleteById(id);
       }
      
}
