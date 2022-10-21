package com.portfolio.DaiaUrquilla.Interface;

import com.portfolio.DaiaUrquilla.Entity.Persona;
import java.util.List;

public interface IPersonaService {

    public List<Persona> getPersona();
   
    public void savePersona(Persona persona);
   
    public void deletePersona(Integer id);

    public Persona findPersona(Integer id);  
}
