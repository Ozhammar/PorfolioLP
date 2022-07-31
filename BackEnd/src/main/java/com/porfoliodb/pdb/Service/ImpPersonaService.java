
package com.porfoliodb.pdb.Service;

import com.porfoliodb.pdb.Entity.Persona;
import com.porfoliodb.pdb.Interface.IPersonaService;
import com.porfoliodb.pdb.Repository.IPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpPersonaService implements IPersonaService{
    @Autowired IPersonaRepository ipersonaRepository;
    
    @Override
    public List<Persona> getPersona() {
       List<Persona> persona = ipersonaRepository.findAll();
       return persona;
    }

    @Override
    public void savePersona(Persona persona) {
        ipersonaRepository.save(persona);
    }

    @Override
    public void deletePersona(Long id) {
        ipersonaRepository.deleteById(id);
    }

    @Override
    public Persona findPersona(Long Id) {
        Persona persona = ipersonaRepository.findById(Id).orElse(null);
        return persona;
        
    }
    
}
