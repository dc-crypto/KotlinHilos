package com.diegocastro.ejercicio3

//lo primero que debemos crear es una interfaz listener con una funcion/metodo que nos avise que obtuvimos respuesta

//luego creamos un objeto de tipo hilo con un parámetro que identifica la pelicula y la corresponidente fun crearHilo en main

//En la clase Hilo que recibe por parametro el nombre de la peli creamos la funcion descargar peli y esta funcion recibe por parametro la interfaz Listener

//finalmente implementamos la interfaz en el main para recibir la respuesta "CallBack"
fun main(){
    var peli=Hilo("The Judge")
    peli.descargarPelicula(object:ListenerDescarga{
        override fun descargaFinalizada() {
            println("pelicula ${peli.pelicula} descargada")
            println("Dale play a ${peli.pelicula}")
        }
    })


}

