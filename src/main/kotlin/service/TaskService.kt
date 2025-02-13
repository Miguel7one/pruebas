//acá creamos un servicio de tarea
package com.kotlin.service

object TaskService {

     private val tasks = mutableListOf <Task>() //asi creamos una lista de datos

    fun getAllTasks(): List<Task> = tasks

    fun createTask(task: Task): Task {
        tasks.add(task)
        return task
    }

}

