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

    @DeleteMapping( path = "eliminar-usuario/{usuario}")
    public String eliminarPorId(@PathVariable("usuario") String usuario){
        boolean ok = this.usuarioService.eliminarUsuario(usuario);
        if (ok){
            return "Se eliminó el usuario " + usuario;
        }else{
            return "No existe el usuario " + usuario;
        }
    }

}