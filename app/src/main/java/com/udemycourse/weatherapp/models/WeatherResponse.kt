package com.udemycourse.weatherapp.models

import java.io.Serializable

data class WeatherResponse(
    val coord:Coord,
    val weather:List<Weather>,
    val base:String,
    val main:Main,
    val visibility:Int,
    val winds:Wind,
    val clouds:Clouds,
    val dt:Double,
    val sys:Sys,
    val id:Int,
    val name:String,
    val cod:Int
) :Serializable