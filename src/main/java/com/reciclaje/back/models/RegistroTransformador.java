package com.reciclaje.back.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "registro_tranformador")

public class RegistroTransformador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Integer id_registro_transformador;

    @JsonIgnore
    @ManyToOne
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    @JoinColumn(name = "usuario", referencedColumnName = "id_usuario",updatable = false, insertable = false)
    private Usuario transformador_usuario;

    private Integer botellas_fabricadas;
    private Integer porcentaje_pet_reciclado;
    private Integer pet_comprado;
    private Integer pet_utilizado;
    private String usuario;

    public RegistroTransformador(Integer botellas_fabricadas, Integer porcentaje_pet_reciclado, Integer pet_comprado, Integer pet_utilizado, String usuario) {
        this.botellas_fabricadas = botellas_fabricadas;
        this.porcentaje_pet_reciclado = porcentaje_pet_reciclado;
        this.pet_comprado = pet_comprado;
        this.pet_utilizado = pet_utilizado;
        this.usuario = usuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Usuario getTransformador_usuario() {
        return transformador_usuario;
    }

    public void setTransformador_usuario(Usuario transformador_usuario) {
        this.transformador_usuario = transformador_usuario;
    }

    public Integer getId_registro_transformador() {
        return id_registro_transformador;
    }

    public void setId_registro_transformador(Integer id_registro_transformador) {
        this.id_registro_transformador = id_registro_transformador;
    }

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
}
