package com.reciclaje.back.services;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import com.reciclaje.back.dto.RegistroTransformadorDto;
import com.reciclaje.back.models.RegistroTransformador;
import com.reciclaje.back.repositories.RegistroTransformadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistroTransformadorService {

    @Autowired
    RegistroTransformadorRepository registroTransformadorRepository;

    public ArrayList<com.reciclaje.back.models.RegistroTransformador> obtenerRegistros(){
        return (ArrayList<com.reciclaje.back.models.RegistroTransformador>) registroTransformadorRepository.findAll();
    }

    public RegistroTransformador guardarRegistro(RegistroTransformadorDto registroTransformadorDto){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate now = LocalDate.now();
        RegistroTransformador registroTransformador = new RegistroTransformador(registroTransformadorDto.getBotellas_fabricadas(), registroTransformadorDto.getPorcentaje_pet_reciclado(), registroTransformadorDto.getPet_comprado(), registroTransformadorDto.getPet_utilizado(), registroTransformadorDto.getUsuario(), now);
        return registroTransformadorRepository.save(registroTransformador);
    }

    public ArrayList<com.reciclaje.back.models.RegistroTransformador> obtenerPorUsuario(String usuario){
        return registroTransformadorRepository.findByUsuario(usuario);
    }
}
