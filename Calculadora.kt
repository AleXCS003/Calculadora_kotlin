fun main() {
    var continuar = true

    while (continuar) {
        println("Seleccione una opción para calcular el área:")
        println("1. Área del Cuadrado")
        println("2. Área del Círculo")
        println("3. Área del Triángulo")
        println("4. Salir")
        print("Ingrese el número de la opción: ")
        val opcion = readLine()?.toIntOrNull()
        
        when (opcion) {
            1 -> {
                print("Ingrese el lado del cuadrado: ")
                val lado = readLine()?.toDoubleOrNull()
                if (lado != null && lado > 0) {
                    val area = lado * lado
                    println("El área del cuadrado es: $area")
                } else {
                    println("Por favor ingrese un valor válido para el lado.")
                }
            }
            2 -> {
                print("Ingrese el radio del círculo: ")
                val radio = readLine()?.toDoubleOrNull()
                if (radio != null && radio > 0) {
                    val area = 3.14 * radio * radio
                    println("El área del círculo es: $area")
                } else {
                    println("Por favor ingrese un valor válido para el radio.")
                }
            }
            3 -> {
                print("Ingrese la base del triángulo: ")
                val base = readLine()?.toDoubleOrNull()
                print("Ingrese la altura del triángulo: ")
                val altura = readLine()?.toDoubleOrNull()
                if (base != null && altura != null && base > 0 && altura > 0) {
                    val area = (base * altura) / 2
                    println("El área del triángulo es: $area")
                } else {
                    println("Por favor ingrese valores válidos para la base y la altura.")
                }
            }
            4 -> {
                println("Gracias por usar el programa")
                continuar = false
            }
            else -> {
                println("Opción no válida. Por favor ingrese un número entre 1 y 4.")
            }
        }
        println()
    }
}