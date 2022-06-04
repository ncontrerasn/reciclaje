package com.reciclaje.back.repositories;

import com.reciclaje.back.models.RegistroCentroYPreprocesador;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;

@Repository
public interface RegistroCentroYPreprocesadorRepository extends CrudRepository<com.reciclaje.back.models.RegistroCentroYPreprocesador, Integer> {
    ArrayList<RegistroCentroYPreprocesador> findByUsuario(String usuario);
}
