/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package back.porfolio.Porfolio.controller;

import back.porfolio.Porfolio.models.Experiencia;
import back.porfolio.Porfolio.services.ExperienciaService;
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
@RequestMapping("/Exp")
public class ExperienciaController {
    private final ExperienciaService expservice;

    public ExperienciaController(ExperienciaService expservice) {
        this.expservice = expservice;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Experiencia>> obetenerExp(){
        List<Experiencia> allexp = expservice.buscarexp();
        return new ResponseEntity<>(allexp,HttpStatus.OK);
    }
    
    @PutMapping("/editar")
    public ResponseEntity<Experiencia> editExp(@RequestBody Experiencia exp){
        Experiencia actualizarexp = expservice.editarexp(exp);
        return new ResponseEntity<>(actualizarexp,HttpStatus.OK);
    }
      @PostMapping("/add")
    public ResponseEntity<Experiencia> agregarExp(@RequestBody Experiencia exp){
        Experiencia newExp = expservice.agrearexp(exp);
        return new ResponseEntity<>(newExp,HttpStatus.CREATED);
    }
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> borrarExp(@PathVariable("id") Long id){
        expservice.borrarexp(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
    
}
