// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, AVANACADO }

data class Usuario(val matricula: String, val nome: String)

data class ConteudoEducacional(val nome: String, val duracao: Int = 60)

data class Formacao(val nome: String,val nivel: Nivel, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
        println("Matrícula do usuário ${usuario.nome} realizada com sucesso!")
        println("Dados da matrícula:\nCurso: $nome\nNível: $nivel\n")
    }
}

fun main() {
    //Usuário teste
    val user = Usuario("001","Luis Dorea")
    
    //Criação de dois conteúdos para add na lista
    val conteudoTest1 = ConteudoEducacional(nome = "conteudTest1", duracao = 60)
    val conteudoTest2 = ConteudoEducacional(nome = "conteudoTeste2", duracao = 100)
    
    //Criação da lista já add os dois conteúdos
    val conteudoEDList: MutableList<ConteudoEducacional> = mutableListOf(conteudoTest1,conteudoTest2)
    
    //criação de uma formação definindo o nível e passando a lista de conteúdos
    val formacao1 = Formacao("FormacaoTeste1", Nivel.BASICO,conteudoEDList)
    
    //Cadastro do usuário
    formacao1.matricular(user)
}