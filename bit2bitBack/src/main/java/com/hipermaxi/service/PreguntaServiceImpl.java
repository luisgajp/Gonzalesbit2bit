package com.hipermaxi.service;


import com.hipermaxi.dtos.PreguntaCreateDTO;
import com.hipermaxi.dtos.PreguntaDTO;
import com.hipermaxi.mappers.PreguntaMapper;
import com.hipermaxi.model.Pregunta;
import com.hipermaxi.repository.PreguntaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PreguntaServiceImpl implements  PreguntaService {

    @Autowired
    private PreguntaRepository preguntaRepository;

    @Override
    public List<PreguntaDTO> listarPreguntas() {

        return PreguntaMapper.instancia.listaPreguntaAListaPreguntaDTO( preguntaRepository.findAll());
    }

    @Override
    public PreguntaDTO obtenerPreguntaPorID(long id) {
        Optional<Pregunta> pregunta= preguntaRepository.findById(id);
        PreguntaDTO preguntaDTO ;
        if(pregunta.isPresent()){
            preguntaDTO = PreguntaMapper.instancia.preguntaAPreguntaDTO(pregunta.get());
        }else {
            preguntaDTO=null;
        }
        return  preguntaDTO;
    }

    @Override
    public PreguntaDTO registrarPregunta(PreguntaCreateDTO preguntaCreateDTO) {
        Pregunta pregunta=PreguntaMapper.instancia.preguntaCreateDTOAPregunta(preguntaCreateDTO);
        Pregunta respuestaEntity=preguntaRepository.save(pregunta);
        PreguntaDTO respuestaDTO= PreguntaMapper.instancia.preguntaAPreguntaDTO(respuestaEntity);
        return respuestaDTO;
    }
}
