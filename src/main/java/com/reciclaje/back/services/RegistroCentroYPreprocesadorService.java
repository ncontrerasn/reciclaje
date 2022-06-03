package com.reciclaje.back.services;

import java.util.ArrayList;
import com.reciclaje.back.dto.RegistroCentroYPreprocesadorDto;
import com.reciclaje.back.models.RegistroCentroYPreprocesador;
import com.reciclaje.back.repositories.RegistroCentroYPreprocesadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistroCentroYPreprocesadorService {

    @Autowired
    RegistroCentroYPreprocesadorRepository registroCentroYPreprocesadorRepository;

    public ArrayList<com.reciclaje.back.models.RegistroCentroYPreprocesador> obtenerRegistros(){
        return (ArrayList<com.reciclaje.back.models.RegistroCentroYPreprocesador>) registroCentroYPreprocesadorRepository.findAll();
    }

    public com.reciclaje.back.models.RegistroCentroYPreprocesador guardarRegistro(RegistroCentroYPreprocesadorDto registroTransformadorDto){
        RegistroCentroYPreprocesador registroCentroYPreprocesador = new RegistroCentroYPreprocesador(registroTransformadorDto.getPet_comprado(), registroTransformadorDto.getPet_procesado(), registroTransformadorDto.getPet_desechado(), registroTransformadorDto.getPet_perdido(), registroTransformadorDto.getPet_vendido(), registroTransformadorDto.getPrecio_compra(), registroTransformadorDto.getPrecio_venta(), registroTransformadorDto.getUsuario());
        return registroCentroYPreprocesadorRepository.save(registroCentroYPreprocesador);
    }

    public ArrayList<com.reciclaje.back.models.RegistroCentroYPreprocesador> obtenerPorUsuario(String usuario){
        return registroCentroYPreprocesadorRepository.findByUsuario(usuario);
    }
}
