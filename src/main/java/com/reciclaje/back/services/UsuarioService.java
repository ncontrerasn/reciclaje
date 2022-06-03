package com.reciclaje.back.services;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Optional;
import com.reciclaje.back.dto.UsuarioDto;
import com.reciclaje.back.models.Usuario;
import com.reciclaje.back.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;

    public static String encriptar(String input) {
        try {
            // getInstance() method is called with algorithm SHA-512
            MessageDigest md = MessageDigest.getInstance("SHA-512");
            // digest() method is called
            // to calculate message digest of the input string
            // returned as array of byte
            byte[] messageDigest = md.digest(input.getBytes());
            // Convert byte array into signum representation
            BigInteger no = new BigInteger(1, messageDigest);
            // Convert message digest into hex value
            String hashtext = no.toString(16);
            // Add preceding 0s to make it 32 bit
            while (hashtext.length() < 32) {
                hashtext = "0" + hashtext;
            }
            // return the HashText
            return hashtext;
        }// For specifying wrong message digest algorithms
        catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public ArrayList<com.reciclaje.back.models.Usuario> obtenerUsuarios(){
        ArrayList<Usuario> usuarios = (ArrayList<Usuario>) usuarioRepository.findAll();
        for(int i = 0; i < usuarios.size(); i++)
            usuarios.get(i).setClave("");
        return usuarios;
    }

    public Usuario guardarUsuario(UsuarioDto usuario){
        Usuario u = new Usuario(usuario.getId_usuario(), encriptar(usuario.getClave()), usuario.getNombre_empresa(), usuario.getEmail(), usuario.getTelefono(), usuario.getResponsable(), usuario.getDireccion(), usuario.getRol());
        Usuario x = usuarioRepository.save(u);
        x.setClave("");
        return x;
    }

    public Optional<Usuario> login(UsuarioDto usuario){
        Optional<Usuario> u = usuarioRepository.findById(usuario.getId_usuario());
        Optional<Usuario> ux = Optional.of(new Usuario());

        if(u.isEmpty()){
            ux.get().setId_usuario("Error: El usuario no existe");
            return ux;
        }
        else if(u.get().getClave().equals(encriptar(usuario.getClave()))){
            u.get().setClave("");
            return u;
        }
        else{
            ux.get().setId_usuario("Error: Clave incorrecta");
            return ux;
        }
    }

    public Optional<Usuario> obtenerPorId(String id){
        Optional<Usuario> u = usuarioRepository.findById(id);

        if(u.isEmpty()){
            Optional<Usuario> ux = Optional.of(new Usuario());
            ux.get().setId_usuario("Error: El usuario no existe");
            return ux;
        }
        u.get().setClave("");
        return u;
    }

    public boolean eliminarUsuario(String id) {
        try{
            usuarioRepository.deleteById(id);
            return true;
        }catch(Exception err){
            return false;
        }
    }
}
