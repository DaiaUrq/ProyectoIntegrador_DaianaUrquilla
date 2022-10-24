package com.portfolio.DaiaUrquilla.Repository;

import com.portfolio.DaiaUrquilla.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Daia
 */
@Repository
public interface PersonaRepository extends JpaRepository<Persona,Long>{
    
}
