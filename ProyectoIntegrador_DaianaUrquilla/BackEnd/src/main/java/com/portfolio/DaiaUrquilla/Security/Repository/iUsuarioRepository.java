package com.portfolio.DaiaUrquilla.Security.Repository;

import com.portfolio.DaiaUrquilla.Security.Entity.Usuario;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Daia
 */
@Repository
public interface iUsuarioRepository extends JpaRepository<Usuario, Integer>{
    
    Optional<Usuario> finByNombreUsuario(String nombreUsuario);
    
    boolean existsByNombreUsuario(String nombreUsuario);
    
    boolean existsByEmail(String email);
}
