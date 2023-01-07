package com.hipermaxi.dtos;

import com.hipermaxi.model.Pregunta;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
public class RespuestaDTO {

    private Long idrpta;

    private String detallerpta;

    private Date fecharpta;

    private Pregunta pregunta;
}
