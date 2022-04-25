package br.com.exercicio3

class Filme(
    var titulo: String,
    var duracaoEmMinutos: Int
) {
    fun exibirDuracaoEmMinutos(){
        var horas = duracaoEmMinutos / 60
        var min = duracaoEmMinutos % 60
        println("O filme $titulo possui $horas horas e $min minutos de duração")
    }
}