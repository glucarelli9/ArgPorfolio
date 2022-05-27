
package back.porfolio.Porfolio.controller;

import back.porfolio.Porfolio.models.Usuario;
import back.porfolio.Porfolio.services.UsuarioService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")
@CrossOrigin(origins = "http://localhost:4200")
public class UsuarioController {
    private final UsuarioService usuarioservice;

    public UsuarioController(UsuarioService usuarioservice) {
        this.usuarioservice = usuarioservice;
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<Usuario> obetenerUsuario(@PathVariable("id") Long id){
        Usuario usuario = usuarioservice.buscarUsuarioPorId(id);
        return new ResponseEntity<>(usuario,HttpStatus.OK);
    }
    
    @PutMapping("/editar")
    public ResponseEntity<Usuario> editarUsuario(@RequestBody Usuario usuario){
        Usuario actualizarUsuario = usuarioservice.editaruser(usuario);
        return new ResponseEntity<>(actualizarUsuario,HttpStatus.OK);
    }
    
    
}
