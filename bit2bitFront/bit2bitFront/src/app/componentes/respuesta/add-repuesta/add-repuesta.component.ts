import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Pregunta } from 'src/app/modelos/Pregunta';
import { Respuesta } from 'src/app/modelos/Respuesta';
import { RespuestaService } from 'src/app/servicio/respuesta.service';

@Component({
  selector: 'app-add-repuesta',
  templateUrl: './add-repuesta.component.html',
  styleUrls: ['./add-repuesta.component.css']
})
export class AddRepuestaComponent implements OnInit {

  modelRespuesta = new Respuesta();
  preguntas!:Pregunta[];

  constructor(private router:Router, private respuestaService:RespuestaService) { }

  ngOnInit(): void {
    this.cargarPregunta();
  }

  guardar(respuesta:Respuesta){

    this.respuestaService.createRespuesta(respuesta).subscribe(data=>{
      this.router.navigate(['respuestas']);
    });
  }

  cancelar(){
    this.router.navigate(['respuestas']);
  }

  cargarPregunta(){
    this.respuestaService.getPregunta().subscribe(data=>{

      this.preguntas=data;
      console.log("datos son: ");
      console.log(data);
    },
    error=>{
       console.log(error);
    }
    );
  }
}
