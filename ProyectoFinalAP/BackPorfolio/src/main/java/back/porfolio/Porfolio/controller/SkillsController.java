/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package back.porfolio.Porfolio.controller;

import back.porfolio.Porfolio.models.Skills;
import back.porfolio.Porfolio.services.SkillsService;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Skills")
public class SkillsController {
    
       private final SkillsService skillservice;

    public SkillsController(SkillsService skillservice) {
        this.skillservice = skillservice;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Skills>> obetenerSkill(){
        List<Skills> skilles = skillservice.buscarskill();
        return new ResponseEntity<>(skilles,HttpStatus.OK);
    }
    
    @PutMapping("/editar")
    public ResponseEntity<Skills> editSkill(@RequestBody Skills skills){
        Skills actualizarSkill = skillservice.editarskill(skills);
        return new ResponseEntity<>(actualizarSkill,HttpStatus.OK);
    }
      @PostMapping("/add")
    public ResponseEntity<Skills> agregarSkill(@RequestBody Skills skills){
        Skills newSkill = skillservice.agrearskill(skills);
        return new ResponseEntity<>(newSkill,HttpStatus.CREATED);
    }
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> borrarSkill(@PathVariable("id") Long id){
        skillservice.borrarskill(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
