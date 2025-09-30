package com.rivasluis.digimind.ui.notifications

import kotlinx.serialization.Serializable

@Serializable
class Carrito {
    var recordatorios = ArrayList<Recordatorio>()
    fun agregar (p: Recordatorio): Boolean{
        return recordatorios.add(p)
    }
}