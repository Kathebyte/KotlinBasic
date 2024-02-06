import java.util.Scanner

/*2. Una vez allí, desarrolle un programa con varios métodos donde pida un número de estudiantes de un aula.
Guarde sus nombres; luego pida 3 notas que se promediarán para obtener una nota final,
esta nota final deberá guardarse, y devolverá la lista de nombres ordenada de mayor a menor.
fun main(args: Array<String>)
 */

fun main() {

    println("Ejerecicio de Kotlin")
    println("****************")

    val estudiantes = mutableListOf<String>()
    val notasFinales = mutableListOf<Double>()
    val scanner = Scanner(System.`in`)


    println("Escriba el numero de Estudiantes por Aula que desea ingresar")
    val numeroEstudiantes = scanner.nextInt()

    for (i in 1..numeroEstudiantes) {
        println("Ingrese el nombre del estudiante $i:")
        var nombre = readLine() ?: ""
        estudiantes.add(nombre)

        println("Ingrese las 3 notas del estudiante $nombre:")
        val note1 = readLine()?.toDouble() ?: 0.0
        val note2 = readLine()?.toDouble() ?: 0.0
        val note3 = readLine()?.toDouble() ?: 0.0

        val promedio = "%.1f".format(calcularPromedio(note1, note2, note3)).toDouble()
        notasFinales.add(promedio)

    }

    var listaOrdenada = estudiantes.zip(notasFinales).sortedByDescending { it.second }

    println("Lista de estudiantes")
    listaOrdenada.forEach { (nombre, nota) ->
        println("$nombre - Nota final: $nota")
    }
}

fun calcularPromedio(note1: Double, note2: Double, note3: Double): Double {
    return (note1 + note2 + note3) / 3.0
}



