package com.pollorosa.screenmatch_frases.model;

import jakarta.persistence.*;

@Entity
@Table(name = "frase")
public class Frase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String media;
    private String frase;
    private String autor;
    private String poster;

    public Frase(){}
}
