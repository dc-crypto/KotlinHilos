package com.diegocastro.ejercicio2

import com.diegocastro.ejercicio1.crearHilo

fun main(){

    //Creamos los hilos
    var hilo1=Hilo()
    var hilo2=Hilo()
    var hilo3=Hilo()
    var hilo4=Hilo()
    var hilo5=Hilo()

    // subimos los hilos al arrayList con un for

    val list: MutableList<Hilo> = mutableListOf(hilo1, hilo2, hilo3, hilo4, hilo5)
    var dseg = 0
    var j=1
    for(i in list){
        dseg += 3000
        crearHilo(j++, dseg.toLong())
    }

//iniciamos los hilos con otro for
}




