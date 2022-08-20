
package com.porfoliodb.pdb.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Skills {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @NotNull
    private String nombreS;
    @NotNull
    private String valueSk;
    @NotNull
    private String imgS;

    public Skills() {
    }

    public Skills(String nombreS, String valueSk, String imgS) {
        this.nombreS = nombreS;
        this.valueSk = valueSk;
        this.imgS = imgS;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreS() {
        return nombreS;
    }

    public void setNombreS(String nombreS) {
        this.nombreS = nombreS;
    }

    public String getValueSk() {
        return valueSk;
    }

    public void setValueSk(String valueSk) {
        this.valueSk = valueSk;
    }

    public String getImgS() {
        return imgS;
    }

    public void setImgS(String imgS) {
        this.imgS = imgS;
    }
   
    
    
}
