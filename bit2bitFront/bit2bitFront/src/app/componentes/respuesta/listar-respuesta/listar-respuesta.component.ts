import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Respuesta } from 'src/app/modelos/Respuesta';
import { RespuestaService } from 'src/app/servicio/respuesta.service';

@Component({
  selector: 'app-listar-respuesta',
  templateUrl: './listar-respuesta.component.html',
  styleUrls: ['./listar-respuesta.component.css']
})
export class ListarRespuestaComponent implements OnInit {

  filterPost = '';
  respuestas?:Respuesta[];

  constructor(private respuestaService:RespuestaService, private router:Router) { }

  ngOnInit(): void {
    this.respuestaService.getRespuestas().subscribe(
      data=>{
        this.respuestas=data;
        console.log(data);
      },
      error=>{
        console.log(error);
      }

    );
  }

  nuevo():void{
    this.router.navigate(['nuevoRespuesta']);
  }

  main():void{
    this.router.navigate(['preguntas']);
  }
}
