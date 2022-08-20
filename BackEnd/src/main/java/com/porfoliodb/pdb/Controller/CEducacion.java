
package com.porfoliodb.pdb.Controller;

import com.porfoliodb.pdb.Dto.dtoEducacion;
import com.porfoliodb.pdb.Entity.Educacion;
import com.porfoliodb.pdb.Security.Controller.Mensaje;
import com.porfoliodb.pdb.Service.SEducacion;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
@RequestMapping("edu")
@CrossOrigin(origins = "http://localhost:4200")
public class CEducacion {
    
    @Autowired
    SEducacion sEducacion;
    
    
    @GetMapping("/lista")
    public ResponseEntity<List<Educacion>> list(){
        List<Educacion> list = sEducacion.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }
    
    
    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody dtoEducacion dtoedu){
        if(StringUtils.isBlank(dtoedu.getNombreEdu())){
            return new ResponseEntity(new Mensaje("Nombre Obligatorio"), HttpStatus.BAD_REQUEST);
        }
        if(sEducacion.existsByNombreEdu(dtoedu.getNombreEdu())){
            return new ResponseEntity(new Mensaje("El estudio ya existe"), HttpStatus.BAD_REQUEST);
        }
        Educacion educacion = new Educacion(dtoedu.getNombreEdu(),dtoedu.getUrlEdu(),dtoedu.getDescripcionEdu(),dtoedu.getInicioEdu(),dtoedu.getFinEdu(),dtoedu.getTituloEdu(),dtoedu.getImgEdu());
        sEducacion.save(educacion);
        return new ResponseEntity(new Mensaje("Experiencia de estudio creada con exito"), HttpStatus.OK);
    }
        
   
    
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody dtoEducacion dtoedu) {
        if (!sEducacion.existsById(id)) {
            return new ResponseEntity(new Mensaje("El ID no existe"), HttpStatus.BAD_REQUEST);
        }
        if (sEducacion.existsByNombreEdu(dtoedu.getNombreEdu()) && sEducacion.getByNombreEdu(dtoedu.getNombreEdu()).get().getId() != id) {
            return new ResponseEntity(new Mensaje("Esa experiencia educativa ya existe"), HttpStatus.BAD_REQUEST);
        }
        if (StringUtils.isBlank(dtoedu.getNombreEdu())) {
            return new ResponseEntity(new Mensaje("Nombre Obligatorio"), HttpStatus.BAD_REQUEST);
        }

        Educacion educacion = sEducacion.getOne(id).get();
        educacion.setNombreEdu(dtoedu.getNombreEdu());
        educacion.setUrlEdu(dtoedu.getUrlEdu());
        educacion.setDescripcionEdu(dtoedu.getDescripcionEdu());
        educacion.setInicioEdu(dtoedu.getInicioEdu());
        educacion.setFinEdu(dtoedu.getFinEdu());
        educacion.setTituloEdu(dtoedu.getTituloEdu());
        educacion.setImgEdu(dtoedu.getImgEdu());
        sEducacion.save(educacion);
        return new ResponseEntity(new Mensaje("Experiencia educativa actualizada con exito"), HttpStatus.OK);
    }
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id) {
        if (!sEducacion.existsById(id)) {
            return new ResponseEntity(new Mensaje("El ID no existe"), HttpStatus.BAD_REQUEST);
        }
        sEducacion.delete(id);
        return new ResponseEntity(new Mensaje("Experiencia educativa eliminada con exito"), HttpStatus.OK);
    }
    
    @GetMapping("/detail/{id}")
    public ResponseEntity<Educacion> getById(@PathVariable("id") int id) {
        if (!sEducacion.existsById(id)) {
            return new ResponseEntity(new Mensaje("no existe la experiencia educativa"), HttpStatus.NOT_FOUND);
        }
        Educacion educacion = sEducacion.getOne(id).get();
        return new ResponseEntity(educacion, HttpStatus.OK);
    }
    
    
}
