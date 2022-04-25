package br.com.exercicio1

class Funcionario(
    var nome: String,
    var sobrenome: String,
    var horasTrabalhadas: Int,
    var valorPorHora: Double
) {
    fun nomeCompleto(){
        println("$nome $sobrenome")
    }

    fun calcularSalario(){
        println("Total de salário pelas horas trabalhadas: ${horasTrabalhadas * valorPorHora}")
    }

    fun incrementarHoras(valor: Double){
        valorPorHora += valor
    }
}