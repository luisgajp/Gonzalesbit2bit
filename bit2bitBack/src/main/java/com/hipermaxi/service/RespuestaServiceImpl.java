package com.hipermaxi.service;

import com.hipermaxi.dtos.PreguntaDTO;
import com.hipermaxi.dtos.RespuestaCreateDTO;
import com.hipermaxi.dtos.RespuestaDTO;
import com.hipermaxi.mappers.PreguntaMapper;
import com.hipermaxi.mappers.RespuestaMapper;
import com.hipermaxi.model.Pregunta;
import com.hipermaxi.model.Respuesta;
import com.hipermaxi.repository.RespuestaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RespuestaServiceImpl implements RespuestaService{

    @Autowired
    private RespuestaRepository respuestaRepository;

    @Override
    public List<RespuestaDTO> listarRespuestas() {
        return RespuestaMapper.instancia.listaRespuestaAListaRespuestaDTO(respuestaRepository.findAll());
    }

    @Override
    public RespuestaDTO obtenerRespuestasPorID(long id) {
        Optional<Respuesta> respuesta= respuestaRepository.findById(id);
        RespuestaDTO respuestaDTO ;
        if(respuesta.isPresent()){
            respuestaDTO = RespuestaMapper.instancia.respuestaARespuestaDTO(respuesta.get());
        }else {
            respuestaDTO=null;
        }
        return  respuestaDTO;
    }

    @Override
    public RespuestaDTO registrarRespuesta(RespuestaCreateDTO respuestaCreateDTO) {
        Respuesta respuesta=RespuestaMapper.instancia.respuestaCreateDTOARespuesta(respuestaCreateDTO);
        Respuesta respuestaEntity=respuestaRepository.save(respuesta);
        RespuestaDTO respuestaDTO= RespuestaMapper.instancia.respuestaARespuestaDTO(respuestaEntity);
        return respuestaDTO;
    }
}
