package com.porfoliodb.pdb.Service;

import com.porfoliodb.pdb.Entity.Persona;
import com.porfoliodb.pdb.Interface.IPersona;
import com.porfoliodb.pdb.Repository.RPersona;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SPersona implements IPersona {

    @Autowired
    RPersona rPersona;

    public List<Persona> list() {
        return rPersona.findAll();
    }

    public Optional<Persona> getOne(int id) {
        return rPersona.findById(id);
    }

    public Optional<Persona> getByNombre(String nombre) {
        return rPersona.findByNombre(nombre);
    }

    public void save(Persona per) {
        rPersona.save(per);
    }

    public void delete(int id) {
        rPersona.deleteById(id);
    }

    public boolean existsById(int id) {
        return rPersona.existsById(id);
    }

    public boolean existsByNombre(String nombre) {
        return rPersona.existsByNombre(nombre);
    }

    @Override
    public Persona findPersona(int id) {
        Persona persona = rPersona.findById(id).orElse(null);
        return persona;
    }

    
}
