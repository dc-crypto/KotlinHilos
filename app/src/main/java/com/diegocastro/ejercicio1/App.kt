package com.diegocastro.ejercicio1

fun main(){
    println("Hilo Principal")


    for(i in 1..5){

        var dseg = i*2000
        crearHilo(i, dseg.toLong())
    }

}



fun crearHilo(num:Int, dormir:Long){
    var hilo=Thread(Runnable {

        print("Hilo numero $num creado... ")
        Thread.sleep(dormir)
        println("Hilo $num terminado")

    })

    hilo.start()
}