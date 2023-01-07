import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Pregunta } from '../modelos/Pregunta';

@Injectable({
  providedIn: 'root'
})
export class PreguntaService {

  constructor(private http:HttpClient) { }

  url = 'http://localhost:8080/api/preguntas';


  getPreguntas(){
    return this.http.get<Pregunta[]>(this.url);
  }

  createPregunta(pregunta:Pregunta){
    return this.http.post<Pregunta>(this.url, pregunta);
  }

}
