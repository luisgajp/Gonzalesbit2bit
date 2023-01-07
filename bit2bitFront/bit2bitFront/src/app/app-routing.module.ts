import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddPreguntaComponent } from './componentes/pregunta/add-pregunta/add-pregunta.component';
import { ListarPreguntasComponent } from './componentes/pregunta/listar-preguntas/listar-preguntas.component';
import { AddRepuestaComponent } from './componentes/respuesta/add-repuesta/add-repuesta.component';
import { ListarRespuestaComponent } from './componentes/respuesta/listar-respuesta/listar-respuesta.component';

const routes: Routes = [

{path:'preguntas', component:ListarPreguntasComponent},
{path:'nuevoPregunta', component:AddPreguntaComponent},
{path:'respuestas', component:ListarRespuestaComponent},
{path:'nuevoRespuesta', component:AddRepuestaComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
