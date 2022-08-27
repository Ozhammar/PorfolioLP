
package com.porfoliodb.pdb.Controller;

import com.porfoliodb.pdb.Dto.dtoSkills;
import com.porfoliodb.pdb.Entity.Skills;
import com.porfoliodb.pdb.Security.Controller.Mensaje;
import com.porfoliodb.pdb.Service.SSkills;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("skills")
@CrossOrigin(origins = "https://frontendlp-d6f81.web.app/")
public class CSkills {
    
    @Autowired
    SSkills sSkills;
    
    @GetMapping("/lista")
    public ResponseEntity<List<Skills>> list(){
        List<Skills> list = sSkills.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody dtoSkills dtoskills){
        if(StringUtils.isBlank(dtoskills.getNombreS())){
            return new ResponseEntity(new Mensaje("Nombre Obligatorio"), HttpStatus.BAD_REQUEST);
        }
        if(sSkills.existsByNombreS(dtoskills.getNombreS())){
            return new ResponseEntity(new Mensaje("El estudio ya existe"), HttpStatus.BAD_REQUEST);
        }
        Skills skills = new Skills(dtoskills.getNombreS(), dtoskills.getValueSk(), dtoskills.getImgS());
        sSkills.save(skills);
        return new ResponseEntity(new Mensaje("Experiencia de estudio creada con exito"), HttpStatus.OK);
    }
        
   
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody dtoSkills dtoskills) {
        if (!sSkills.existsById(id)) {
            return new ResponseEntity(new Mensaje("El ID no existe"), HttpStatus.BAD_REQUEST);
        }
        if (sSkills.existsByNombreS(dtoskills.getNombreS()) && sSkills.getByNombreS(dtoskills.getNombreS()).get().getId() != id) {
            return new ResponseEntity(new Mensaje("Esa experiencia educativa ya existe"), HttpStatus.BAD_REQUEST);
        }
        if (StringUtils.isBlank(dtoskills.getNombreS())) {
            return new ResponseEntity(new Mensaje("Nombre Obligatorio"), HttpStatus.BAD_REQUEST);
        }

        Skills skills = sSkills.getOne(id).get();
        skills.setNombreS(dtoskills.getNombreS());
        skills.setValueSk(dtoskills.getValueSk());
        skills.setImgS(dtoskills.getImgS());
        sSkills.save(skills);
        return new ResponseEntity(new Mensaje("Habilidad actualizada con exito"), HttpStatus.OK);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id) {
        if (!sSkills.existsById(id)) {
            return new ResponseEntity(new Mensaje("El ID no existe"), HttpStatus.BAD_REQUEST);
        }
        sSkills.delete(id);
        return new ResponseEntity(new Mensaje("Experiencia educativa eliminada con exito"), HttpStatus.OK);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/detail/{id}")
    public ResponseEntity<Skills> getById(@PathVariable("id") int id) {
        if (!sSkills.existsById(id)) {
            return new ResponseEntity(new Mensaje("no existe la experiencia educativa"), HttpStatus.NOT_FOUND);
        }
        Skills skills = sSkills.getOne(id).get();
        return new ResponseEntity(skills, HttpStatus.OK);
    }
    
}
