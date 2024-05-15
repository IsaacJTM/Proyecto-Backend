package com.proyecto.proyectobackend.request;

import lombok.Getter;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Getter
@Setter
public class ProgrammerRequest {
    private Long id;
    private String nomApellido;
    private String description;
    private List<String> program;
    MultipartFile image;
}
