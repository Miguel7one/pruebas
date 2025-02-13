//Este es el punto de partida al crear un server, instalación de modulos e inicio del motor del programa

package com.kotlin

import io.ktor.server.application.* //nos ayuda a abrir un servidor (un host local)

//Contiene la función main, que arranca el servidor con Netty como motor por defecto.
fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain.main(args)
}

/*La función module es donde configuras las características del servidor,
 como la serialización y las rutas (configureSerialization() y configureRouting()). */
fun Application.module() {
    configureSerialization()//primero se define esta ruta para convertir primero una clase a Json
    configureRouting()// pero esta la sobreescribe
}
