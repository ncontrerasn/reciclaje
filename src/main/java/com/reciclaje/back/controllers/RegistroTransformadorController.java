package com.reciclaje.back.controllers;

import java.util.ArrayList;

import com.reciclaje.back.dto.RegistroTransformadorDto;
import com.reciclaje.back.models.RegistroTransformador;
import com.reciclaje.back.services.RegistroTransformadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/registros-transformadores")
public class RegistroTransformadorController {
    @Autowired
    RegistroTransformadorService registroTransformadorService;

    @GetMapping("/obtener-registros-transformadores")
    public ArrayList<RegistroTransformador> obtenerRegistros(){
        return registroTransformadorService.obtenerRegistros();
    }

    @PostMapping("guardar-registro-transformador")
    public RegistroTransformador guardarRegistro(@RequestBody RegistroTransformadorDto registroTransformadorDto){
        return this.registroTransformadorService.guardarRegistro(registroTransformadorDto);
    }

    @GetMapping("registros-transformador/{usuario}")
    public ArrayList<RegistroTransformador> obtenerRegistroPorUsuario(@PathVariable("usuario") String usuario) {
        return this.registroTransformadorService.obtenerPorUsuario(usuario);
    }

}
