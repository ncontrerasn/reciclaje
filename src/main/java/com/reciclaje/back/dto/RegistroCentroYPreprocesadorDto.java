package com.reciclaje.back.dto;

public class RegistroCentroYPreprocesadorDto {

    private Integer pet_comprado;
    private Integer pet_procesado;
    private Integer pet_desechado;
    private Integer pet_perdido;
    private Integer pet_vendido;
    private Integer precio_compra;
    private Integer precio_venta;
    private String usuario;

    public Integer getPet_comprado() {
        return pet_comprado;
    }

    public void setPet_comprado(Integer pet_comprado) {
        this.pet_comprado = pet_comprado;
    }

    public Integer getPet_procesado() {
        return pet_procesado;
    }

    public void setPet_procesado(Integer pet_procesado) {
        this.pet_procesado = pet_procesado;
    }

    public Integer getPet_desechado() {
        return pet_desechado;
    }

    public void setPet_desechado(Integer pet_desechado) {
        this.pet_desechado = pet_desechado;
    }

    public Integer getPet_perdido() {
        return pet_perdido;
    }

    public void setPet_perdido(Integer pet_perdido) {
        this.pet_perdido = pet_perdido;
    }

    public Integer getPet_vendido() {
        return pet_vendido;
    }

    public void setPet_vendido(Integer pet_vendido) {
        this.pet_vendido = pet_vendido;
    }

    public Integer getPrecio_compra() {
        return precio_compra;
    }

    public void setPrecio_compra(Integer precio_compra) {
        this.precio_compra = precio_compra;
    }

    public Integer getPrecio_venta() {
        return precio_venta;
    }

    public void setPrecio_venta(Integer precio_venta) {
        this.precio_venta = precio_venta;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
}
