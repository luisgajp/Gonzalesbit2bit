package com.hipermaxi.mappers;

import com.hipermaxi.dtos.PreguntaCreateDTO;
import com.hipermaxi.dtos.PreguntaDTO;
import com.hipermaxi.dtos.RespuestaCreateDTO;
import com.hipermaxi.dtos.RespuestaDTO;

import com.hipermaxi.model.Respuesta;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface RespuestaMapper {

    RespuestaMapper instancia= Mappers.getMapper(RespuestaMapper.class);

    RespuestaDTO respuestaARespuestaDTO(Respuesta respuesta);
    Respuesta respuestaDTOARespuesta(RespuestaDTO respuestaDTO);
    Respuesta respuestaCreateDTOARespuesta(RespuestaCreateDTO respuestaCreateDTO);
    List<RespuestaDTO> listaRespuestaAListaRespuestaDTO (List<Respuesta> listaRespuesta);


}
