package br.com.exercicio3

fun main() {
    var filme1 = Filme("Titanic", 235)

    filme1.titulo = "Os Vingadores"

    filme1.duracaoEmMinutos = 142

    filme1.exibirDuracaoEmMinutos()

    val filme2 = Filme("Hotel Transilvânia", 93)

    filme2.exibirDuracaoEmMinutos()

    println("Os filmes em cartaz são $filme1 e $filme2")

    val filmes = ArrayList<Filme>()

    filmes.add(Filme("Se beber, não case", 180))
    filmes.add(Filme("Teoria de Tudo", 200))
    filmes.add(Filme("The Batman", 230))
    filmes.add(Filme("Coringa", 140))
    filmes.add(Filme("A Lista de Schindler", 100))

    filmes.forEach{ filme ->
        println(filme.titulo)
        println(filme.duracaoEmMinutos)
        filme.exibirDuracaoEmMinutos()
    }

    print("Os filmes em cartaz são: ")
    filmes.forEach{ filme ->
        println(filme.titulo)
    }
}