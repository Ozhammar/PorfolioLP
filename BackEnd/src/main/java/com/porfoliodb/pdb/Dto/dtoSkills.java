package com.porfoliodb.pdb.Dto;

import javax.validation.constraints.NotBlank;

public class dtoSkills {

    @NotBlank
    private String nombreS;
    @NotBlank
    private String valueSk;
    @NotBlank
    private String imgS;

    public dtoSkills() {
    }

    public dtoSkills(String nombreS, String valueS, String imgS) {
        this.nombreS = nombreS;
        this.valueSk = valueSk;
        this.imgS = imgS;
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
