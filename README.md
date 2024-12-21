# Calculadora hecho en kotlin
### Descripción
Esta aplicación, desarrollada en Kotlin, permite calcular el área de diversas figuras geométricas básicas mediante un menú interactivo. Las figuras disponibles son:

-Cuadrado

-Círculo

-Triángulo

El usuario puede elegir una figura del menú, ingresar los datos necesarios (como el lado, radio, base o altura) y obtener el resultado del cálculo. Además, incluye la opción de salir del programa cuando se desee.
#### Requisitos
-Tener instalado java

#### Instalacion de  Kotlin
-Para ello descargamos kotlin 

![image](https://github.com/user-attachments/assets/e8778ba9-4c8f-4659-b368-df69a4f2a642)


-Configurar las variables de entorno 

![image](https://github.com/user-attachments/assets/1711278d-c2c1-425f-b592-30cd6d528ebe)

-Abrimos visual Studio Code y descargamos algunas extendiones 

![image](https://github.com/user-attachments/assets/0f605b95-9ff1-4c7b-a9f3-188527ced199)

![image](https://github.com/user-attachments/assets/52157139-58d0-4034-b191-fe65523478dd)

#### Ejecucion con un archivo
-Creamos un archivo .kt , y dentro colocamos el codigo respectivo
-Compila y ejecuta el archivo desde la terminal utilizando los siguientes comandos: 
```bash
kotlinc calculo.kt -include-runtime -d calculo.jar  
java -jar calculo.jar
```

![image](https://github.com/user-attachments/assets/4bc6c3e8-07f8-415b-9706-6aeb372dc2c4)


### Navegar por el Menú
Al iniciar el programa, se mostrará un menú interactivo con las opciones disponibles.

Escoge la figura geométrica deseada ingresando el número correspondiente (1, 2 y  3).

Ingresa los valores requeridos según la figura seleccionada:

Cuadrado: Introduce la longitud de un lado.

Círculo: Especifica el radio.

Triángulo: Proporciona la base y la altura.

El programa calculará y mostrará el área correspondiente.

#### Finalizar la Ejecución
Para salir del programa, selecciona la opción de salida (número 4) desde el menú principal.

