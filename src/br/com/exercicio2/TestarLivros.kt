package br.com.exercicio2

fun main(){
    var livroFavorito = Livros("O Príncipe", 200, 40)

    livroFavorito.titulo = "O Pequeno Prícipe"

    livroFavorito.qtdPaginas = 98

    println("O livro ${livroFavorito.titulo} possui ${livroFavorito.qtdPaginas} páginas")

    livroFavorito.qtdPaginas = 20

    livroFavorito.verificarProgresso()

    livroFavorito.paginasLidas = 50

    livroFavorito.verificarProgresso()

    var livros = ArrayList<Livros>()

    livros.add(Livros("Vida e Morte de Policapo Quaresma", 100, 50))
    livros.add(Livros("Os Sertões", 300, 100))
    livros.add(Livros("Os Lusíadas", 1000, 500))
    livros.add(Livros("Éramos seis", 200, 70))
    livros.add(Livros("Helena", 350, 150))
    livros.add(Livros("Dom Quixote", 1500, 550))
    livros.add(Livros("Dom Casmurro", 100, 30))
    livros.add(Livros("Uma breve história do tempo", 250, 100))
    livros.add(Livros("Clean Code", 700, 300))
    livros.add(Livros("A Arte da Guerra", 400, 200))

    livros.forEach{ livro ->
        println(livro.titulo)
        println(livro.qtdPaginas)
        println(livro.paginasLidas)
        livro.verificarProgresso()
        println("----------##-----##-----##-----------")
        println()
    }
}
