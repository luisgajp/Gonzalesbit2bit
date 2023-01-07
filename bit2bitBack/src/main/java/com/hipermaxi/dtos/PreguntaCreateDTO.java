package com.hipermaxi.dtos;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class PreguntaCreateDTO {
    private String titulo;

    private String detalle;

    private Date fecha;
}
