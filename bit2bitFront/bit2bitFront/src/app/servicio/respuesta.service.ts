import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Pregunta } from '../modelos/Pregunta';
import { Respuesta } from '../modelos/Respuesta';

@Injectable({
  providedIn: 'root'
})
export class RespuestaService {

  constructor(private http:HttpClient) { }
  url = 'http://localhost:8080/api/respuestas';
  urlpre = 'http://localhost:8080/api/preguntas';


  getRespuestas(){
    return this.http.get<Respuesta[]>(this.url);
  }

  createRespuesta(respuesta: Respuesta){
    return this.http.post<Respuesta>(this.url, respuesta);
  }

  getPregunta(){
    return this.http.get<Pregunta[]>(this.urlpre);
  }
}
