# microTarjetas

Que hace el proyecto?
Es un microservicio que devuelve al cliente la lista de tarjetas para las que aplica dada su principal pasion, su salario y su edad.

Que hace el API?
  El API recibe un request body del tipo
  
    {
      "pasion": "shopping",
      "edad": 23,
      "salario": 15000
    }
    
  Y regresa una lista de tarjetas para las que aplica.
  
Cual es la finalidad del proyecto?
  Demostrar los conocimientos adquiridos durante la academia de microservicios impartida por profesionales de IBM.
  Los principales temas que se utilizaron en el microservicios son mapeo a traves de @ConfigurationProperties sacados de un archivo YAML
  y el uso de streams y principios de programacion funcional.
  Hubo tambien un par de inyecciones de dependencias y el proyecto esta listo para ser reconocido por un server de Eureka
  
  ![Captura Postman 1](https://i.imgur.com/JEn8eoz.png)
  
  
  ![Captura Postman 1](https://i.imgur.com/fNa0HVK.png)
  
  
  ![Captura Postman 1](https://i.imgur.com/BiMopCJ.png)
  
  
