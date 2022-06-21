package com.marquez.poke_tinder.domain.model

import com.google.gson.annotations.SerializedName
import com.marquez.poke_tinder.data.model.StatsModel

data class Stats(
    val base_stat: Int,
    val stat: Stat
) {
}
