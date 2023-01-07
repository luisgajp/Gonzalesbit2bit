package com.hipermaxi.service;

import com.hipermaxi.dtos.PreguntaCreateDTO;
import com.hipermaxi.dtos.PreguntaDTO;
import com.hipermaxi.dtos.RespuestaCreateDTO;
import com.hipermaxi.dtos.RespuestaDTO;

import java.util.List;

public interface RespuestaService {

    List<RespuestaDTO> listarRespuestas();
    RespuestaDTO obtenerRespuestasPorID(long id);
    RespuestaDTO registrarRespuesta(RespuestaCreateDTO respuestaCreateDTO);
}
