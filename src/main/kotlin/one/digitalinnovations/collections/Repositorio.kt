package one.digitalinnovations.collections

class Repositorio<T> { //<T> significa recebe um generics
    private val map = mutableMapOf<String, T>() //T significa que vai receber a add do objeto. Simulando uma base simples

    fun create(id: String, value: T){
        //map.put(id, value) - forma padrão
        map[id] = value // melhoria da linguagem passando id como assinatura
    }

    fun remove(id: String) = map.remove(id)  //removendo item

    fun findById(id: String) = map[id] //map.get(id) - forma padrão do get

    fun findAll() = map.values

}