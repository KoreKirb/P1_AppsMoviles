fun palindromo(s: String): Boolean {
    var texto = s.lowercase().replace(" ", "")
    texto = texto.replace(".", "")
    texto = texto.replace("á", "a").replace("é", "e").replace("í", "i")
    texto = texto.replace("ó", "o").replace("ú", "u")

    return texto == texto.reversed()
}

fun main() {
    var palindromo: String = "Ana lleva al oso la avellana."

    if (palindromo(palindromo)) {
        println("Si es un palindromo")
    } else {
        println("No es un palindromo")
    }
}