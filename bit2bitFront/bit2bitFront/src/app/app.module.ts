import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ListarPreguntasComponent } from './componentes/pregunta/listar-preguntas/listar-preguntas.component';
import {HttpClientModule} from "@angular/common/http";
import { AddPreguntaComponent } from './componentes/pregunta/add-pregunta/add-pregunta.component';
import { FilterPipe } from './pipes/filter.pipe';
import { ListarRespuestaComponent } from './componentes/respuesta/listar-respuesta/listar-respuesta.component';
import { AddRepuestaComponent } from './componentes/respuesta/add-repuesta/add-repuesta.component';


@NgModule({
  declarations: [
    AppComponent,
    ListarPreguntasComponent,
    AddPreguntaComponent,
    FilterPipe,
    ListarRespuestaComponent,
    AddRepuestaComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
