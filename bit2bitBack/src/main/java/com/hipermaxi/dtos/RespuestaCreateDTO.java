package com.hipermaxi.dtos;

import com.hipermaxi.model.Pregunta;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class RespuestaCreateDTO {
    private String detallerpta;

    private Date fecharpta;

    private Pregunta pregunta;
}
