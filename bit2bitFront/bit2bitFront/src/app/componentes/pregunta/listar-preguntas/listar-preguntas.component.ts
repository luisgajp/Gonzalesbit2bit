import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Pregunta } from 'src/app/modelos/Pregunta';
import { PreguntaService } from 'src/app/servicio/pregunta.service';

@Component({
  selector: 'app-listar-preguntas',
  templateUrl: './listar-preguntas.component.html',
  styleUrls: ['./listar-preguntas.component.css']
})
export class ListarPreguntasComponent implements OnInit {

 
  preguntas?:Pregunta[];

  constructor(private preguntaService:PreguntaService, private router:Router) { }

  ngOnInit(): void {

     this.preguntaService.getPreguntas().subscribe(
       data=>{
         this.preguntas=data;
         console.log(data);
       },
       error=>{
         console.log(error);
       }

     );
  }

  nuevo():void{
    this.router.navigate(['nuevoPregunta']);
  }

  answers(){
    this.router.navigate(['respuestas']);
  }

}
