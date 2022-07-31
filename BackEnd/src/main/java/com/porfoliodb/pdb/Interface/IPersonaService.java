package com.porfoliodb.pdb.Interface;

import com.porfoliodb.pdb.Entity.Persona;
import java.util.List;



public interface IPersonaService {
    //traer lista de personas
    public List<Persona> getPersona();
    
    //guardar un objeto del tipo persona
    public void savePersona(Persona persona);
    
    //Eliminar un usuario pero lo buscamos por ID
    public void deletePersona(Long id);
    
    //buscar una persona por ID
    public Persona findPersona(Long Id);
}
