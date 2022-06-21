package com.marquez.poke_tinder.data.model

import com.google.gson.annotations.SerializedName

data class StatsModel (
    @SerializedName("base_stat") val base_stat: Int,
    @SerializedName("stat") val stat: StatModel
)