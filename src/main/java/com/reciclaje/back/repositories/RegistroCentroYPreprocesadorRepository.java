package com.reciclaje.back.repositories;

import com.reciclaje.back.models.RegistroCentroYPreprocesador;
import com.reciclaje.back.models.RegistroTransformador;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface RegistroCentroYPreprocesadorRepository extends CrudRepository<com.reciclaje.back.models.RegistroCentroYPreprocesador, Integer> {
    public abstract ArrayList<RegistroCentroYPreprocesador> findByUsuario(String usuario);
}
