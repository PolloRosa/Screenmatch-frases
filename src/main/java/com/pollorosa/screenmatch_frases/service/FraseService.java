package com.pollorosa.screenmatch_frases.service;

import com.pollorosa.screenmatch_frases.dto.FraseDTO;
import com.pollorosa.screenmatch_frases.model.Frase;
import com.pollorosa.screenmatch_frases.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FraseService {
    @Autowired
    private FraseRepository repository;

    public FraseDTO obtenerFraseAleatoria() {
        Frase frase = repository.obtenerFraseAleatoria();
        return new FraseDTO(frase.getMedia(), frase.getFrase(), frase.getAutor(), frase.getPoster());
    }
}
