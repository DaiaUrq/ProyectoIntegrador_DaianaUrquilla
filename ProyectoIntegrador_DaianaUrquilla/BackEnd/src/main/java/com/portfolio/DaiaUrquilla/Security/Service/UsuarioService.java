package com.portfolio.DaiaUrquilla.Security.Service;

import com.portfolio.DaiaUrquilla.Security.Entity.Usuario;
import com.portfolio.DaiaUrquilla.Security.Repository.iUsuarioRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Daia
 */
@Service
@Transactional
public class UsuarioService {
    @Autowired
    iUsuarioRepository iusuarioRepository;
    
    public Optional<Usuario> getByNombreUsuario(String nombreUsaurio){
        return iusuarioRepository.finByNombreUsuario(nombreUsaurio);
    }
    
    public boolean existsByNombreUsuario(String nombreUsuario){
        return iusuarioRepository.existsByNombreUsuario(nombreUsuario);
    }
    
    public boolean existsByEmail(String email){
        return iusuarioRepository.existsByEmail(email);
    }    
    
    public void save(Usuario usuario){
        iusuarioRepository.save(usuario);
    }
}
