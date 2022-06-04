package com.reciclaje.back.services;

import java.util.ArrayList;
import com.reciclaje.back.models.Rol;
import com.reciclaje.back.repositories.RolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RolService {

    @Autowired
    RolRepository rolRepository;

    public ArrayList<Rol> obtenerRoles(){
        return (ArrayList<Rol>) rolRepository.findAll();
    }
}
