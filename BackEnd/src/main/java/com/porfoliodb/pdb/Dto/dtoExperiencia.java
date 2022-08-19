package com.porfoliodb.pdb.Dto;

import javax.validation.constraints.NotBlank;

public class dtoExperiencia {

    @NotBlank
    private String nombreExp;
    @NotBlank
    private String inicioExp;

    private String finExp;
    @NotBlank
    private String cargoExp;

    @NotBlank
    private String descripcionExp;
    private String imgExp;

    public dtoExperiencia() {
    }

    public dtoExperiencia(String nombreExp, String inicioExp, String finExp, String cargoExp, String descripcionExp, String imgExp) {
        this.nombreExp = nombreExp;
        this.inicioExp = inicioExp;
        this.finExp = finExp;
        this.cargoExp = cargoExp;
        this.descripcionExp = descripcionExp;
        this.imgExp = imgExp;
    }

    public String getNombreExp() {
        return nombreExp;
    }

    public void setNombreExp(String nombreExp) {
        this.nombreExp = nombreExp;
    }

    public String getDescripcionExp() {
        return descripcionExp;
    }

    public void setDescripcionExp(String descripcionExp) {
        this.descripcionExp = descripcionExp;
    }

    public String getInicioExp() {
        return inicioExp;
    }

    public void setInicioExp(String inicioExp) {
        this.inicioExp = inicioExp;
    }

    public String getFinExp() {
        return finExp;
    }

    public void setFinExp(String finExp) {
        this.finExp = finExp;
    }

    public String getCargoExp() {
        return cargoExp;
    }

    public void setCargoExp(String cargoExp) {
        this.cargoExp = cargoExp;
    }

    public String getImgExp() {
        return imgExp;
    }

    public void setImgExp(String imgExp) {
        this.imgExp = imgExp;
    }

}
