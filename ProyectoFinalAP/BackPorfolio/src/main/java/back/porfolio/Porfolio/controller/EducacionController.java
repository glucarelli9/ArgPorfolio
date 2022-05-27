/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package back.porfolio.Porfolio.controller;

import back.porfolio.Porfolio.models.Educacion;
import back.porfolio.Porfolio.services.EducacionService;
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
@RequestMapping("/Educacion")
public class EducacionController {
    private final EducacionService educacionservice;

    public EducacionController(EducacionService educacionservice) {
        this.educacionservice = educacionservice;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Educacion>> obetenerEdu(){
        List<Educacion> educaciones = educacionservice.buscarEdu();
        return new ResponseEntity<>(educaciones,HttpStatus.OK);
    }
    
    @PutMapping("/editar")
    public ResponseEntity<Educacion> editarEdu(@RequestBody Educacion educacion){
        Educacion actualizareducacion = educacionservice.editarEducacion(educacion);
        return new ResponseEntity<>(actualizareducacion,HttpStatus.OK);
    }
    
    @PostMapping("/add")
    public ResponseEntity<Educacion> agregaredu(@RequestBody Educacion educacion){
        Educacion newEducacion = educacionservice.agrearEducacion(educacion);
        return new ResponseEntity<>(newEducacion,HttpStatus.CREATED);
    }
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> borrarEdu(@PathVariable("id") Long id){
        educacionservice.borrarEducacion(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
}
