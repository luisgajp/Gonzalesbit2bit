package com.hipermaxi.dtos;

import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Getter
@Setter
public class PreguntaDTO {


    private Long idpregunta;

    private String titulo;

    private String detalle;

    private Date fecha;
}
