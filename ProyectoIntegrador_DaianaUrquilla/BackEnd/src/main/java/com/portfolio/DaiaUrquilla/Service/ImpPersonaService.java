package com.portfolio.DaiaUrquilla.Service;

import com.portfolio.DaiaUrquilla.Entity.Persona;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.portfolio.DaiaUrquilla.Repository.PersonaRepository;
import com.portfolio.DaiaUrquilla.Interface.IPersonaService;


/**
 *
 * @author Daia
 */
@Service
public class ImpPersonaService implements IPersonaService{

    @Autowired 
    PersonaRepository personaRepository;
    
    @Override
    public List<Persona> getPersona() {
        List<Persona> personas = personaRepository.findAll();        
        return personas;
    }

    @Override
    public void savePersona(Persona persona) {
        personaRepository.save(persona);
    }
    
    @Override
    public void deletePersona(Integer id) {
        personaRepository.deleteById(id);
    }

    @Override
    public Persona findPersona(Integer id) {
        Persona persona = personaRepository.findById(id).orElse(null);
        return persona;
    }      
}
