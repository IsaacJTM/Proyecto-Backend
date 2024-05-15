package com.proyecto.proyectobackend.service;

import com.proyecto.proyectobackend.entity.Programmer;
import com.proyecto.proyectobackend.request.ProgrammerRequest;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface ProgrammersService {
    Programmer createProgrammer(ProgrammerRequest programmerRequest) throws IOException;
    List<Programmer> getProgrammers();
}
