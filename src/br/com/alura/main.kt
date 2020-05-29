package br.com.alura

fun main() {
    val banco = BancoDeNomes()
//    banco.nomes.add("Alex")
    banco.salva("Alex")
    println(banco.nomes)
    println(BancoDeNomes().nomes)
}

class BancoDeNomes {

    val nomes: Collection<String> get() = dados

    fun salva(nome: String){
        dados.add(nome)
    }

    companion object {
        private val dados = mutableListOf<String>()
    }
}

fun testaColecao() {
    val nomes: Collection<String> = mutableListOf(
            "Alex",
            "Fran",
            "Gui",
            "Maria",
            "Ana"
    )
    for (nome in nomes) {
        println(nome)
    }
    println(nomes)
    println("Tem o nome Alex? ${nomes.contains("Alex")}")
    println("Tamanho da coleção ${nomes.size}")
}