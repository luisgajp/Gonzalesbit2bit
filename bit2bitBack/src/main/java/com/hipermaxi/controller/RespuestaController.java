package com.hipermaxi.controller;

import com.hipermaxi.dtos.PreguntaCreateDTO;
import com.hipermaxi.dtos.PreguntaDTO;
import com.hipermaxi.dtos.RespuestaCreateDTO;
import com.hipermaxi.dtos.RespuestaDTO;
import com.hipermaxi.service.RespuestaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class RespuestaController {

    @Autowired
    private RespuestaService respuestaService;

    @GetMapping("respuestas")
    public ResponseEntity<List<RespuestaDTO>> listarRespuestas(){
        return   new ResponseEntity<>(respuestaService.listarRespuestas(), HttpStatus.OK);
    }

    @GetMapping("/respuestas/{idrpta}")
    public ResponseEntity<RespuestaDTO> obtenerRespuestaPorId(@PathVariable("idrpta") long idrpta){
        return  new ResponseEntity<> ( respuestaService.obtenerRespuestasPorID(idrpta),HttpStatus.OK);
    }

    @PostMapping("respuestas")
    public ResponseEntity<RespuestaDTO> registrarRespuesta(@RequestBody RespuestaCreateDTO respuestaCreateDTO){
        return  new ResponseEntity <>( respuestaService.registrarRespuesta(respuestaCreateDTO) ,HttpStatus.OK) ;
    }

}
