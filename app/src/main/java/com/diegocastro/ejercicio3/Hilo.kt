package com.diegocastro.ejercicio3

class Hilo(var pelicula:String) {

    //fun que crea el hilo de descarga de la peli
    fun descargarPelicula(listener: ListenerDescarga){
        var hilo=Thread(Runnable {

            println("descargando pelicula $pelicula")
            println("esperando descarga de $pelicula")
            Thread.sleep(5000)//simula tiempo de descarga
            listener.descargaFinalizada()

        })

        hilo.start()
    }
}