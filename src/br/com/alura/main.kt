package br.com.alura

fun main() {
    val nomes: List<String> = listOf(
            "Alex",
            "Fran",
            "Gui",
            "Maria",
            "Ana"
    )
    for (nome in nomes){
        println(nome)
    }
    println(nomes)
    println("Tem o nome Alex? ${nomes.contains("Alex")}")
    println("Tamanho da coleção ${nomes.size}")
}