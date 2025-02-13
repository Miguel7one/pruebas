//esta sección responde al servidor
package com.kotlin

import com.kotlin.service.Task
import com.kotlin.service.TaskService
import io.ktor.server.application.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

//creamos acá las rutas para responder en la raíz del servidor ("/").
fun Application.configureRouting() {
    routing {
        get("/") {
            call.respondText("Hello bro!")
            /*Cuando accedas a http://127.0.0.1:8080/ en tu navegador,
             la respuesta será Hello bro! en texto plano.*/
        }

        get("/tasks") {
            call.respond(TaskService.getAllTasks()) //este envia un formato que no podemos ver de manera directa
        }

        post("/tasks/add") { // este nos permite postear datos que queramos obtener

            val task = call.receive<Task>()
            call.respond(TaskService.createTask(task))

        }
    }
}