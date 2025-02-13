/*observamos la configuración de serialization usando Ktor para enviar
  respuestas en formato Json.*/
package com.kotlin

import io.ktor.serialization.kotlinx.json.*
import io.ktor.server.application.*
import io.ktor.server.plugins.contentnegotiation.*
import kotlinx.serialization.json.Json

fun Application.configureSerialization() {

    install(ContentNegotiation) {
        json(Json {  //permite que los datos enviados se conviertan en tipo Json

            prettyPrint = true
            isLenient = true
        })
    }
}
