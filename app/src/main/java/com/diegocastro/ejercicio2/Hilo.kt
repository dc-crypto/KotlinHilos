package com.diegocastro.ejercicio2

class Hilo {

    fun crearHilo(num:Int, dormir:Long){
        var hilo=Thread(Runnable {

            print("Hilo numero $num creado... ")
            Thread.sleep(dormir)
            println("Hilo $num terminado")

        })

        hilo.start()
    }
}