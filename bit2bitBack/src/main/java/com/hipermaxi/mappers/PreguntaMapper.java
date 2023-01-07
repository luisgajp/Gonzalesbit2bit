package com.hipermaxi.mappers;


import com.hipermaxi.dtos.*;
import com.hipermaxi.model.Pregunta;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface PreguntaMapper {


    PreguntaMapper instancia= Mappers.getMapper(PreguntaMapper.class);

    PreguntaDTO preguntaAPreguntaDTO(Pregunta pregunta);
    Pregunta preguntaDTOAPregunta(PreguntaDTO preguntaDTO);
    Pregunta preguntaCreateDTOAPregunta(PreguntaCreateDTO preguntaCreateDTO);
    List<PreguntaDTO> listaPreguntaAListaPreguntaDTO (List<Pregunta> listaPregunta);
}
