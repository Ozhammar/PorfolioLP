package com.porfoliodb.pdb.Service;

import com.porfoliodb.pdb.Entity.Experiencia;
import com.porfoliodb.pdb.Repository.RExperiencia;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SExperiencia {

    @Autowired
    RExperiencia rExperiencia;

    public List<Experiencia> list() {
        return rExperiencia.findAll();
    }

    public Optional<Experiencia> getOne(int id) {
        return rExperiencia.findById(id);
    }

    public Optional<Experiencia> getByNombreExp(String nombreExp) {
        return rExperiencia.findByNombreExp(nombreExp);
    }

    public void save(Experiencia exp) {
        rExperiencia.save(exp);
    }

    public void delete(int id) {
        rExperiencia.deleteById(id);
    }

    public boolean existsById(int id) {
        return rExperiencia.existsById(id);
    }

    public boolean existsByNombreExp(String nombreExp) {
        return rExperiencia.existsByNombreExp(nombreExp);
    }

}
