package com.porfoliodb.pdb.Dto;

import javax.validation.constraints.NotBlank;

public class dtoEducacion {

    @NotBlank
    private String nombreEdu;
    private String urlEdu;
    @NotBlank
    private String descripcionEdu;
    @NotBlank
    private String inicioEdu;
    private String finEdu;
    @NotBlank
    private String tituloEdu;
    private String imgEdu;

    public dtoEducacion() {
    }

    public dtoEducacion(String nombreEdu,String urlEdu, String descripcionEdu, String inicioEdu, String finEdu, String tituloEdu, String imgEdu) {
        this.nombreEdu = nombreEdu;
        this.urlEdu = urlEdu;
        this.descripcionEdu = descripcionEdu;
        this.inicioEdu = inicioEdu;
        this.finEdu = finEdu;
        this.tituloEdu = tituloEdu;
        this.imgEdu = imgEdu;
    }

    public String getNombreEdu() {
        return nombreEdu;
    }

    public void setNombreEdu(String nombreEdu) {
        this.nombreEdu = nombreEdu;
    }

    public String getDescripcionEdu() {
        return descripcionEdu;
    }

    public void setDescripcionEdu(String descripcionEdu) {
        this.descripcionEdu = descripcionEdu;
    }

    public String getInicioEdu() {
        return inicioEdu;
    }

    public void setInicioEdu(String inicioEdu) {
        this.inicioEdu = inicioEdu;
    }

    public String getFinEdu() {
        return finEdu;
    }

    public void setFinEdu(String finEdu) {
        this.finEdu = finEdu;
    }

    public String getTituloEdu() {
        return tituloEdu;
    }

    public void setTituloEdu(String TituloEdu) {
        this.tituloEdu = TituloEdu;
    }

    public String getImgEdu() {
        return imgEdu;
    }

    public void setImgEdu(String imgEdu) {
        this.imgEdu = imgEdu;
    }

    public String getUrlEdu() {
        return urlEdu;
    }

    public void setUrlEdu(String urlEdu) {
        this.urlEdu = urlEdu;
    }
    
    
    
}
