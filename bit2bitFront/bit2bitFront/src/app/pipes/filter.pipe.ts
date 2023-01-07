import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'filter'
})
export class FilterPipe implements PipeTransform {

  transform(value: any, arg: any): any {
   
     const resultadoPost = [];
     for(const rpta of value){
        if(rpta.pregunta.titulo.indexOf(arg) > -1){
          resultadoPost.push(rpta);
        };


     };
      return resultadoPost;

}

}
