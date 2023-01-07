package com.hipermaxi.service;

import com.hipermaxi.dtos.PreguntaCreateDTO;
import com.hipermaxi.dtos.PreguntaDTO;

import java.util.List;

public interface PreguntaService {

    List<PreguntaDTO> listarPreguntas();
    PreguntaDTO obtenerPreguntaPorID(long id);
    PreguntaDTO registrarPregunta(PreguntaCreateDTO preguntaCreateDTO);
}
