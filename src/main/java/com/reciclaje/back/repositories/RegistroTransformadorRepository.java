package com.reciclaje.back.repositories;

import com.reciclaje.back.models.RegistroTransformador;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface RegistroTransformadorRepository extends CrudRepository<com.reciclaje.back.models.RegistroTransformador, Integer> {
    public abstract ArrayList<RegistroTransformador> findByUsuario(String usuario);
}
