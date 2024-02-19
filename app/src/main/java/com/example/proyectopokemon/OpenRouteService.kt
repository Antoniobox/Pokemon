package com.example.proyectopokemon

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface OpenRouteService {
    @Headers("Authorization: Bearer <T5b3ce3597851110001cf624892cba9b6b1a942faab1ef50861b1da04>")
    @GET("v2/directions/driving-car")
    fun getRoute(@Query("api_key") key:String, @Query("start") start:String, @Query("end") end:String): Response<RouteResponse>
}