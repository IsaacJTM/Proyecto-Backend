package com.proyecto.proyectobackend.repository;

import com.proyecto.proyectobackend.entity.Programmer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProgrammersRepository extends JpaRepository<Programmer, Long> {
}
