package com.portfolio.DaiaUrquilla.Controller;

import com.portfolio.DaiaUrquilla.Entity.Persona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.portfolio.DaiaUrquilla.Interface.IPersonaService;

/**
 *
 * @author Daia
 */
@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class PersonaController {
   
    @Autowired IPersonaService ipersonService;
    
    @GetMapping("personas/traer")
    public List<Persona> getPersona(){
        return ipersonService.getPersona();
    }
    
    @PostMapping("/personas/crear")
    public String createPersona(@RequestBody Persona persona){
        ipersonService.savePersona(persona);        
        return "La persona fue creada correctamente";
    }
    
    @DeleteMapping("/personas/delete/{id}")
    public String deletePersona(@PathVariable Long id){
        ipersonService.deletePersona(id);
        return "La persona fue eliminada correctamente";
    }
    
    @PutMapping("/persona/editar/{id}")
    public Persona editPersona(@PathVariable Long id,@RequestParam("nombre")String nuevoNombre,@RequestParam("apellido")String nuevoApellido, @RequestParam("img")String nuevoImg){
          
        Persona persona = ipersonService.findPersona(id);        
        persona.setNombre(nuevoNombre);
        persona.setApellido(nuevoApellido);        
        persona.setImg(nuevoImg);
        ipersonService.savePersona(persona);        
        return persona;
    }    
    
    @GetMapping("/personas/traer/perfil")
    public Persona findPersona(Long id){
       Persona persona = ipersonService.findPersona((long)1);
       return persona;
    }
}
