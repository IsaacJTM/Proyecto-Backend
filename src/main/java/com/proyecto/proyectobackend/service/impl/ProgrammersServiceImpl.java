package com.proyecto.proyectobackend.service.impl;

import com.proyecto.proyectobackend.entity.Programmer;
import com.proyecto.proyectobackend.repository.ProgrammersRepository;
import com.proyecto.proyectobackend.request.ProgrammerRequest;
import com.proyecto.proyectobackend.service.ProgrammersService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


import java.io.IOException;
import java.util.Base64;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProgrammersServiceImpl implements ProgrammersService {

    private final ProgrammersRepository programmersRepository;
    @Override
    public Programmer createProgrammer(ProgrammerRequest programmerRequest) throws IOException {
        Programmer programmers = new Programmer();

        programmers.setNomApellido(programmerRequest.getNomApellido());
        programmers.setDescription(programmerRequest.getDescription());
        programmers.setProgram(programmerRequest.getProgram());
        programmers.setImage(programmerRequest.getImage().getBytes());
        return programmersRepository.save(programmers);
    }

    @Override
    public List<Programmer> getProgrammers() {
        return programmersRepository.findAll();
    }
}
