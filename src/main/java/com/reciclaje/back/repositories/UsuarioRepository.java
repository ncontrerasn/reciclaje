package com.reciclaje.back.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends CrudRepository<com.reciclaje.back.models.Usuario, String> {
    //public abstract ArrayList<UsuarioModel> findByPrioridad(Integer prioridad);

}