import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Pregunta } from 'src/app/modelos/Pregunta';
import { PreguntaService } from 'src/app/servicio/pregunta.service';

@Component({
  selector: 'app-add-pregunta',
  templateUrl: './add-pregunta.component.html',
  styleUrls: ['./add-pregunta.component.css']
})
export class AddPreguntaComponent implements OnInit {

  modelPregunta = new Pregunta();
  constructor(private router:Router, private preguntaService:PreguntaService) { }

  ngOnInit(): void {
  }

  guardar(pregunta:Pregunta){

    this.preguntaService.createPregunta(pregunta).subscribe(data=>{
      this.router.navigate(['preguntas']);
    });
  }

  cancelar(){
    this.router.navigate(['preguntas']);
  }

}
