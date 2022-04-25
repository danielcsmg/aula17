package br.com.exercicio2

class Livros(
    var titulo: String,
    var qtdPaginas: Int,
    var paginasLidas: Int
) {
    fun verificarProgresso(){
        var progresso: Double = paginasLidas.toDouble() * 100 / qtdPaginas.toDouble()
        println("Você já leu $progresso por cento do livro")
    }
}