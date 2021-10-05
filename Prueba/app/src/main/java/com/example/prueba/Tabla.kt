package com.example.prueba

class Tabla (private val numero: Int){

    public fun tablasMultiplicar (): ArrayList<String>{
        var lista = ArrayList<String>()

        for(i in 0..12)
        {

            lista.add("$numero x $i = ${numero * i} \n ")
        }
        return lista
    }
}