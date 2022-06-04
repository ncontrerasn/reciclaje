package com.reciclaje.back.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.*;
import lombok.*;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "registro_centro_preprocesador")

public class RegistroCentroYPreprocesador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Integer id_registro_centro_preprocesador;

    private Integer pet_comprado;
    private Integer pet_procesado;
    private Integer pet_desechado;
    private Integer pet_perdido;
    private Integer pet_vendido;
    private Integer precio_compra;
    private Integer precio_venta;
    private String usuario;
    private LocalDate localDate;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "usuario", referencedColumnName = "id_usuario",updatable = false, insertable = false)
    private Usuario centro_preprocesador_usuario;

    public RegistroCentroYPreprocesador(Integer pet_comprado, Integer pet_procesado, Integer pet_desechado, Integer pet_perdido, Integer pet_vendido, Integer precio_compra, Integer precio_venta, String usuario, LocalDate localDate) {
        this.pet_comprado = pet_comprado;
        this.pet_procesado = pet_procesado;
        this.pet_desechado = pet_desechado;
        this.pet_perdido = pet_perdido;
        this.pet_vendido = pet_vendido;
        this.precio_compra = precio_compra;
        this.precio_venta = precio_venta;
        this.usuario = usuario;
        this.localDate = localDate;
    }

    public Integer getId_registro_centro_preprocesador() {
        return id_registro_centro_preprocesador;
    }

    public void setId_registro_centro_preprocesador(Integer id_registro_centro_preprocesador) {
        this.id_registro_centro_preprocesador = id_registro_centro_preprocesador;
    }

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

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }
}
