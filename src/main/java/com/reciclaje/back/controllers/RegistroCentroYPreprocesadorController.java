package com.reciclaje.back.controllers;

import com.reciclaje.back.dto.RegistroCentroYPreprocesadorDto;
import com.reciclaje.back.models.RegistroCentroYPreprocesador;
import com.reciclaje.back.services.RegistroCentroYPreprocesadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/registros-centros-preprocesadores")
public class RegistroCentroYPreprocesadorController {
    @Autowired
    RegistroCentroYPreprocesadorService registroCentroYPreprocesadorService;

    @GetMapping("/obtener-registros-centros-preprocesadores")
    public ArrayList<RegistroCentroYPreprocesador> obtenerRegistros(){
        return registroCentroYPreprocesadorService.obtenerRegistros();
    }

    @PostMapping("/guardar-registro-centro-preprocesador")
    public RegistroCentroYPreprocesador guardarRegistro(@RequestBody RegistroCentroYPreprocesadorDto registroCentroYPreprocesadorDto){
        return this.registroCentroYPreprocesadorService.guardarRegistro(registroCentroYPreprocesadorDto);
    }

    @GetMapping("registros-centro-preprocesador/{usuario}")
    public ArrayList<RegistroCentroYPreprocesador> obtenerRegistroPorUsuario(@PathVariable("usuario") String usuario) {
        return this.registroCentroYPreprocesadorService.obtenerPorUsuario(usuario);
    }
}
