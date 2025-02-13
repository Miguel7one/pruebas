//acá definimos la tarea para la lista de tareas
package com.kotlin.service

import kotlinx.serialization.Serializable

@Serializable
data class Task( //data class es un tipo de datos especializado
    val id: String,
    val title : String,
    val description : String? = null,
    val completed: Boolean = false
)
