# Gonzalesbit2bit
Prueba Técnica de bit2bit - Gonzales Ascencio Luis
Softwares e open sources frameworks que deben tener instalado para ejecutar el proyecto: 
- Intellij IDEA 2022.2.2  
- Visual Studio Code
- Mysql Workbench 8.0
- node js
- angular js 
Ejecución del proyecto: 
1. Abrir la base de datos mysql workbench, abrir el query sql que se encuentra en el repositorio y ejecutarlo.
2. Abrir el Intellij y abrir el proyecto del repositorio con nombre 'bit2bitback' y ejecutarlo.
3. No debería salir ningun error en consola al ejecutar y para verificar si el API esta trabajando bien ir a este url http://localhost:8080/swagger-ui.html
4. Desde ese url puedes comprobar si las APIs estan jalando la información de la base de datos, que ya deberia estar corriendo si ningun error.
5. Cabe mencionar que el back fue trabajado con la versión de java 11, pero no debería ser un problema porque se descarga todo al momento de abrir el proyecto por primera vez.
6. Para el front de la aplicación debemos abrir el Visual Studio Code y arrastrar la carpeta 'bit2bitFront'.
7. Una vez el proyecto front en el visual studio code abrimos una nueva terminal.
8. Nos ubicamos bien en la misma ruta que este nuestro proyecto y una vez hecho eso colocamos el siguiente comando -> npm install
9. Este comando instalara la carpeta nope_modules que fue eliminada para subir el proyecto, ya que es un carpeta pesada.
10. Una vez finalizado la descarga de las librerias de node, colocamos el siguiente comando -> ng serve 
11.Con ese comando mencionado el proyecto se lanzará en este url http://localhost:4200, cabe aclarar que para el front jale la data de las APIs de nuestra backend el proyecto back debe estar corriendo en el Intellij.
12.Es decir, todo debe estar corriendo base de datos y nuestro backend para que nuestro front pueda jalar los datos y mostrarlos en la web.
13.Si todo fue ejecutado correctamente la información se mostrará en nuestra aplicación web al hacer click en 'bit2bit' ya ubicado en la url http://localhost:4200 
14.Podemos visualizar las preguntas ya realizadas, registrar nuevas preguntas, responder a las preguntas según seleciones por el combobox y  filtrar por titulo de pregunta.


Este proyecto fue trabajado con java para el backend, angular para el frontend y mysql para la base de datos.



