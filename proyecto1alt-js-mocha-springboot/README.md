# spring-rest-js-mocha
# Integración de microservicio realizado en springboot que consume y produce el json de cliente y sus datos, y el proyecto javascript+mocha que valida esta API

1) Levantar microservicio springboot con el siguiente comando, asegurarse que el puerto 8080 esté libre
<br>
```
java -jar spring-rest-dario-1.0.0.jar
```
3) Importar con Postman el archivo API Clientes Springboot.postman_collection.json y enviar el request POST
```
2) Ingresar a la carpeta api-validator, 
```
2) Instalar dependencias con 
<br>
```
$ npm install
```

3) Correr test con el siguiente comando
<br>
```
$ mocha test
```
