import { Pregunta } from "./Pregunta";

export class Respuesta{

   idrpta:number;
   detallerpta: string;
   fecharpta:string;
   pregunta!: Pregunta;

   constructor(){
       this.idrpta=0;
       this.detallerpta ="";
       this.fecharpta="";
   }


}