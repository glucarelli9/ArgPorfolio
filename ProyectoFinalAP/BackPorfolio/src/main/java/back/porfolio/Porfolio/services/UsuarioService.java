
package back.porfolio.Porfolio.services;
import back.porfolio.Porfolio.exception.UserNotFoundException;
import back.porfolio.Porfolio.models.Usuario;
import back.porfolio.Porfolio.repository.UsuarioRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UsuarioService {
    private final UsuarioRepo usuarioRepo;

    @Autowired
      public UsuarioService(UsuarioRepo usuarioRepo) {
      this.usuarioRepo = usuarioRepo;
      }
      
      
       public Usuario agrearuser(Usuario usuario){
           return usuarioRepo.save(usuario);
       }
       public List<Usuario> buscaruser(){
           return usuarioRepo.findAll();
       }
       public Usuario editaruser(Usuario usuario){
           return usuarioRepo.save(usuario);
       }
       public void borraruser(Long id){
           usuarioRepo.deleteById(id);
       }
       public Usuario buscarUsuarioPorId(Long id){
           return usuarioRepo.findById(id).orElseThrow(()-> new UserNotFoundException("usuario no encontrado"));
       }
    
}
