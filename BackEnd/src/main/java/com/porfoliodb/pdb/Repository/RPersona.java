
package com.porfoliodb.pdb.Repository;

import com.porfoliodb.pdb.Entity.Persona;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RPersona extends JpaRepository<Persona, Integer>{
    
    public Optional<Persona> findByNombre(String nombre);
    public Optional<Persona> findById(int id);
    public boolean existsByNombre(String nombre);
}
