package br.com.exercicio1

fun main() {
    var novoFuncionario = Funcionario("Luis", "Silva",10, 25.50)

    novoFuncionario.nomeCompleto()
    novoFuncionario.calcularSalario()
    println("------##------##------##-------")
    println(novoFuncionario.valorPorHora)

    novoFuncionario.incrementarHoras(8.0)

    novoFuncionario.calcularSalario()

    println("------##------##------##-------")
    println(novoFuncionario.valorPorHora)

    val listaFuncionarios = ArrayList<Funcionario>()
    listaFuncionarios.add(novoFuncionario)
    listaFuncionarios.add(Funcionario("Daniel", "Souza", 10, 20.50))
    listaFuncionarios.add(Funcionario("Maria", "Oliveira", 11, 20.10))
    listaFuncionarios.add(Funcionario("João", "Reis", 15, 17.00))
    listaFuncionarios.add(Funcionario("Danilo", "Silveira", 7, 50.00))
    listaFuncionarios.add(Funcionario("Carla", "Cesário", 9, 30.00))
    listaFuncionarios.add(Funcionario("Sandra", "Aquino", 4, 10.50))
    listaFuncionarios.add(Funcionario("Marcelo", "Mendes", 12, 15.10))
    listaFuncionarios.add(Funcionario("Kássia", "Fernandes", 20, 30.50))
    listaFuncionarios.add(Funcionario("Pedro", "Simão", 6, 20.00))

    listaFuncionarios.forEach{ funcionario ->
        println(funcionario.nome)
        println(funcionario.sobrenome)
        println(funcionario.horasTrabalhadas)
        println(funcionario.valorPorHora)
        funcionario.calcularSalario()
        funcionario.incrementarHoras(8.0)
        funcionario.calcularSalario()
        println("-----###-------###--------###--------")
        println()
    }

}