package com.proyecto.proyectobackend.controller;

import com.proyecto.proyectobackend.entity.Programmer;
import com.proyecto.proyectobackend.request.ProgrammerRequest;
import com.proyecto.proyectobackend.service.ProgrammersService;
import com.proyecto.proyectobackend.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api/v1/user/programmers")
@RequiredArgsConstructor
public class ProgrammerController {

    private final ProgrammersService programmersService;

    @PostMapping("/createProgrammer")
    public ResponseEntity<Programmer> createProgrammer(
            @RequestParam("nomApellido") String nomApellido,
            @RequestParam("description") String description,
            @RequestParam("program") List<String> program,
            @RequestParam("image") MultipartFile image
    ) throws IOException {
        ProgrammerRequest programmerRequest = new ProgrammerRequest();
        programmerRequest.setNomApellido(nomApellido);
        programmerRequest.setDescription(description);
        programmerRequest.setProgram(program);
        programmerRequest.setImage(image);
        return ResponseEntity.ok(programmersService.createProgrammer(programmerRequest));
    }

    @GetMapping("/ListProgrammer")
    public ResponseEntity<List<Programmer>> listProgrammers(){
        return ResponseEntity.ok(programmersService.getProgrammers());
    }




}
