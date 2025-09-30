package com.rivasluis.digimind.ui.notifications

import kotlinx.serialization.Serializable

@Serializable
data class Recordatorio(
    var dias: String,
    var tiempo: String,
    var nombre: String
)