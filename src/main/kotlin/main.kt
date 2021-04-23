fun main(){

    val maratoniano1 = Maratoniano("Laia")
    val maratoniano2 = Maratoniano("Daniel")
    val maratoniano3 = Maratoniano("Claudia")

    val esgrimista1 = Esgrimista("Victor")
    val esgrimista2 = Esgrimista("Gema")
    val esgrimista3 = Esgrimista("Elisa")

    val nadador1 = Nadador("Miguel")
    val nadador2 = Nadador("Alex")
    val nadador3 = Nadador("Amane")
    val nadador4 = Nadador("Álvaro")

    val listaParticipantes  = listOf(maratoniano1,maratoniano2,maratoniano3,
                                    esgrimista1,esgrimista2,esgrimista3,
                                    nadador1,nadador2,nadador3,nadador4)

    listaParticipantes.forEach{
        it.decirNombre()
        it.accion()
    }
}

open class Participante (val nombreParticipante : String) : DecirNombre{

    override fun decirNombre(){
        print("Soy $nombreParticipante")
    }

}

class Esgrimista (nombre : String) : Participante(nombre), DecirAccion{
    val deporte : String= "Esgrmima"

    override fun accion() {
        println(" y pego espadazos")
    }
}

class Maratoniano (nombre: String) : Participante(nombre), DecirAccion{
    val deporte : String = "Maraton"

    override fun accion() {
        println(" y corro durante mucho rato")
    }
}

class Nadador (nombre: String) : Participante(nombre),DecirAccion{
    val deporte : String ="Natación"

    override fun accion() {
        println(" y hago chof, chof, chof")
    }
}

interface DecirAccion{
    fun accion()
}

interface DecirNombre{
    fun decirNombre()
}