# Web-Demo-LibroAPI
Este proyecto es una Web-API utilizando Spring Boot utilizamos una herramienta llamada Spring Initializr. Spring Initializr es una herramienta web que facilita la configuración inicial de un proyecto Spring Boot, permitiendo seleccionar las dependencias y configuraciones básicas necesarias.

![image](https://github.com/Danielpalma54/Demo-LibroAPI/assets/147771801/1089feb2-a275-4981-805e-f7c30b5fc421)




# Creación de la entidad Libro
La entidad Libro representa el modelo de datos que manejaremos en nuestra API para la gestión de libros.
La clase libro tiene los siguientes campos: 
- id: Tipo Long, que representa el identificador único del libro.
- titulo: Tipo String, que representa el título del libro.
- autor: Tipo String, que representa el autor del libro.
- editorial: Tipo String, que representa la editorial que publicó el libro.
- anioPublicacion: Tipo Integer, que representa el año de publicación del libro.

  ![image](https://github.com/Danielpalma54/Demo-LibroAPI/assets/147771801/2de7f26e-f12f-4b40-8de7-a703e995aa16)

![image](https://github.com/Danielpalma54/Demo-LibroAPI/assets/147771801/528f02c3-a73d-4a43-8e0d-1951ad09db88)

#Creación del Repositorio
El repositorio es la capa que maneja el acceso a los datos en una aplicación. En este caso, vamos a simular un repositorio utilizando una lista en memoria (objetos quemados) en lugar de una base de datos real. Este enfoque es útil para propósitos de desarrollo y pruebas iniciales.

![image](https://github.com/Danielpalma54/Demo-LibroAPI/assets/147771801/602777b6-42a7-4074-bfb8-8127c8e7beba)

En este estamos estableciendo la estructura de una base de datos para almacenar registros de objetos que han sido quemados dentro de libros. Esto implica diseñar tablas para contener información detallada sobre los objetos, como su descripción, el libro al que pertenecen, el contexto del incendio y cualquier otra información relevante. Esta base de datos nos permitirá analizar y comprender mejor los elementos afectados por incendios en la literatura, lo que podría ser útil para diversos fines, como estudios de análisis de texto o investigaciones literarias.

![image](https://github.com/Danielpalma54/Demo-LibroAPI/assets/147771801/fe354abf-5806-4944-9193-54eeeb659000)




#Creación del servicios
En este caso, el servicio se encargará de manejar las operaciones relacionadas con los libros, actuando como un intermediario entre el controlador (que maneja las solicitudes HTTP) y el repositorio (que maneja los datos).

![image](https://github.com/Danielpalma54/Demo-LibroAPI/assets/147771801/09653303-e7a0-4822-8b6c-599d6ec02a24)

![image](https://github.com/Danielpalma54/Demo-LibroAPI/assets/147771801/a0590a09-4528-432d-b50e-12505b0fd301)

#Ejecucion de Web-API
![image](https://github.com/Danielpalma54/Demo-LibroAPI/assets/147771801/30e8477a-1dc5-4ca0-97ef-369783fb513d)

#Visualizacion en Postaman

![image](https://github.com/Danielpalma54/Demo-LibroAPI/assets/147771801/5e5db5bf-6cab-4383-9a4c-48b609b14a2b)

Tambien se puede buscar por el id ejemplo:

![image](https://github.com/Danielpalma54/Demo-LibroAPI/assets/147771801/2d9087f1-162b-4630-b12a-4d62b8839248)






