package com.porfoliodb.pdb.Security.Service;

import com.porfoliodb.pdb.Security.Entity.Rol;
import com.porfoliodb.pdb.Security.Enums.RolNombre;
import com.porfoliodb.pdb.Security.Repository.iRolRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional //Persistencia 
public class RolService {
    @Autowired
    iRolRepository irolRepository;
    
    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
        return irolRepository.findByRolNombre(rolNombre);
    }
    
    public void save(Rol rol){
        irolRepository.save(rol);
    }
}
