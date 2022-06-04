package com.reciclaje.back.controllers;

import java.util.ArrayList;
import com.reciclaje.back.models.Rol;
import com.reciclaje.back.services.RolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/roles")
public class RolController {

    @Autowired
    RolService rolService;

    @GetMapping("/obtener-roles")
    public ArrayList<Rol> obtenerRoles(){
        return rolService.obtenerRoles();
    }

}
