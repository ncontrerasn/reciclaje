package com.reciclaje.back.controllers;

import java.util.ArrayList;
import java.util.Optional;
import com.reciclaje.back.dto.UsuarioDto;
import com.reciclaje.back.models.Usuario;
import com.reciclaje.back.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    UsuarioService usuarioService;

    @GetMapping("/obtener-usuarios")
    public ArrayList<Usuario> obtenerUsuarios(){
        return usuarioService.obtenerUsuarios();
    }

    @PostMapping("/guardar-usuario")
    public Usuario guardarUsuario(@RequestBody UsuarioDto usuario){
        return this.usuarioService.guardarUsuario(usuario);
    }

    @PostMapping("/login")
    public Optional<Usuario> login(@RequestBody UsuarioDto usuario){
        return this.usuarioService.login(usuario);
    }

    @GetMapping("/obtener-usuario/{usuario}")
    public Optional<Usuario> obtenerUsuarioPorId(@PathVariable("usuario") String usuario) {
        return this.usuarioService.obtenerPorId(usuario);
    }

    /*
    @DeleteMapping( path = "/{id}")
    public String eliminarPorId(@PathVariable("id") String id){
        boolean ok = this.usuarioService.eliminarUsuario(id);
        if (ok){
            return "Se eliminó el usuario con id " + id;
        }else{
            return "No pudo eliminar el usuario con id" + id;
        }
    }*/

}