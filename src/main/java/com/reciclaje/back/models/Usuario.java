package com.reciclaje.back.models;

import javax.persistence.*;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "usuario")
public class Usuario {
    @Id
    @Column(unique = true, nullable = false)
    private String id_usuario;
    private String clave;
    private String nombre_empresa;
    private String email;
    private String telefono;
    private String responsable;
    private String direccion;
    private Integer rol;

    @JsonIgnore
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    @ManyToOne
    @JoinColumn(name = "rol", referencedColumnName = "id_rol",updatable = false, insertable = false)
    private Rol usuario_rol;

    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    @OneToMany(mappedBy = "usuario", cascade = CascadeType.REMOVE)
    private Set<RegistroTransformador> registrosTransformador;

    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    @OneToMany(mappedBy = "usuario")
    private Set<RegistroCentroYPreprocesador> registrosCentroPreprocesador;

    public Usuario(String id_usuario, String clave, String nombre_empresa, String email, String telefono, String responsable, String direccion, Integer rol) {
        this.id_usuario = id_usuario;
        this.clave = clave;
        this.nombre_empresa = nombre_empresa;
        this.email = email;
        this.telefono = telefono;
        this.responsable = responsable;
        this.direccion = direccion;
        this.rol = rol;
    }

    public String getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(String id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getNombre_empresa() {
        return nombre_empresa;
    }

    public void setNombre_empresa(String nombre_empresa) {
        this.nombre_empresa = nombre_empresa;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getRol() {
        return rol;
    }

    public void setRol(Integer rol) {
        this.rol = rol;
    }

    public Rol getUsuario_rol() {
        return usuario_rol;
    }

    public void setUsuario_rol(Rol usuario_rol) {
        this.usuario_rol = usuario_rol;
    }

    public Set<RegistroTransformador> getRegistrosTransformador() {
        return registrosTransformador;
    }

    public void setRegistrosTransformador(Set<RegistroTransformador> registrosTransformador) {
        this.registrosTransformador = registrosTransformador;
    }

    public Set<RegistroCentroYPreprocesador> getRegistrosCentroPreprocesador() {
        return registrosCentroPreprocesador;
    }

    public void setRegistrosCentroPreprocesador(Set<RegistroCentroYPreprocesador> registrosCentroPreprocesador) {
        this.registrosCentroPreprocesador = registrosCentroPreprocesador;
    }

}
