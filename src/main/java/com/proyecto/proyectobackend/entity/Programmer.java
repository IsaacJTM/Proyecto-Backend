package com.proyecto.proyectobackend.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.List;
@Entity
@Getter
@Setter
@Table (name = "programmer")
@RequiredArgsConstructor
public class Programmer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomApellido;
    private String description;
    private List<String> program;
    @Lob
    private byte[] image;
}
