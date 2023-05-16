enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

class Formacao(val nome: String, var conteudos: MutableList<ConteudoEducacional> = mutableListOf()) {

    val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
    }
}

fun main() {
    // Criando objetos de exemplo para ConteudoEducacional
    val conteudo1 = ConteudoEducacional("Introdução ao Kotlin", 120)
    val conteudo2 = ConteudoEducacional("Programação Orientada a Objetos em Kotlin")
    val conteudo3 = ConteudoEducacional("Kotlin Avançado", 90)

    // Criando um objeto de Formacao
    val formacao = Formacao("Formação Kotlin")

    // Adicionando os conteúdos à formação
    formacao.conteudos.add(conteudo1)
    formacao.conteudos.add(conteudo2)
    formacao.conteudos.add(conteudo3)

    // Criando usuários
    val usuario1 = Usuario()
    val usuario2 = Usuario()

    // Matriculando os usuários na formação
    formacao.matricular(usuario1)
    formacao.matricular(usuario2)

    // Imprimindo as informações da formação, conteúdos e inscritos
    println("Formação: ${formacao.nome}")
    println("Conteúdos:")
    for (conteudo in formacao.conteudos) {
        println("- ${conteudo.nome} (${conteudo.duracao} minutos)")
    }
    println("Inscritos:")
    for (inscrito in formacao.inscritos) {
        println("- $inscrito")
    }
}
