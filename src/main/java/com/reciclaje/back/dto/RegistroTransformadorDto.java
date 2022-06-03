package com.reciclaje.back.dto;

public class RegistroTransformadorDto {

    private Integer botellas_fabricadas;
    private Integer porcentaje_pet_reciclado;
    private Integer pet_comprado;
    private Integer pet_utilizado;
    private String usuario;

    public Integer getBotellas_fabricadas() {
        return botellas_fabricadas;
    }

    public void setBotellas_fabricadas(Integer botellas_fabricadas) {
        this.botellas_fabricadas = botellas_fabricadas;
    }

    public Integer getPorcentaje_pet_reciclado() {
        return porcentaje_pet_reciclado;
    }

    public void setPorcentaje_pet_reciclado(Integer porcentaje_pet_reciclado) {
        this.porcentaje_pet_reciclado = porcentaje_pet_reciclado;
    }

    public Integer getPet_comprado() {
        return pet_comprado;
    }

    public void setPet_comprado(Integer pet_comprado) {
        this.pet_comprado = pet_comprado;
    }

    public Integer getPet_utilizado() {
        return pet_utilizado;
    }

    public void setPet_utilizado(Integer pet_utilizado) {
        this.pet_utilizado = pet_utilizado;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
}
