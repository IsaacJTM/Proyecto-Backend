package com.proyecto.proyectobackend.service;

import com.proyecto.proyectobackend.entity.Usuario;
import com.proyecto.proyectobackend.request.SignInRequest;
import com.proyecto.proyectobackend.request.SignUpRequest;
import com.proyecto.proyectobackend.response.AuthenticationResponse;

public interface AuthenticationService {
    Usuario signUpUser(SignUpRequest signUpRequest);
    Usuario signUpAdmin(SignUpRequest signUpRequest);
    AuthenticationResponse signin(SignInRequest signInRequest);
}
