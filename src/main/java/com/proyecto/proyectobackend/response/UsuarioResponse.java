package com.proyecto.proyectobackend.response;

import com.proyecto.proyectobackend.entity.Role;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UsuarioResponse {

    private Long id;
    private String nombres;
    private String apellidos;
    private String email;
    private String password;
    private Role role;
}
