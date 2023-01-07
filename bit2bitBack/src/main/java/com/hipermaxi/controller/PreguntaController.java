package com.hipermaxi.controller;

import com.hipermaxi.dtos.PreguntaCreateDTO;
import com.hipermaxi.dtos.PreguntaDTO;
import com.hipermaxi.service.PreguntaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class PreguntaController {

    @Autowired
    private PreguntaService preguntaService;

    @GetMapping("preguntas")
    public ResponseEntity<List<PreguntaDTO>> listarPreguntas(){
        return   new ResponseEntity<>(preguntaService.listarPreguntas(), HttpStatus.OK);
    }

    @GetMapping("/preguntas/{idpregunta}")
    public ResponseEntity<PreguntaDTO> obtenerPreguntaPorId(@PathVariable("idpregunta") long idpregunta){
        return  new ResponseEntity<> ( preguntaService.obtenerPreguntaPorID(idpregunta),HttpStatus.OK);
    }

    @PostMapping("preguntas")
    public ResponseEntity<PreguntaDTO> registrarPregunta(@RequestBody PreguntaCreateDTO preguntaCreateDTO){
        return  new ResponseEntity <>( preguntaService.registrarPregunta(preguntaCreateDTO) ,HttpStatus.OK) ;
    }
}
