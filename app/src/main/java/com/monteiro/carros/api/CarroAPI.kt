package com.monteiro.carros.api

import com.monteiro.carros.model.Carro
import retrofit2.Call
import retrofit2.http.GET

/**
 * Created by Monteiro on 10/03/18.
 */
interface CarroAPI{

    @GET("carro")
    fun buscarTodos():Call<List<Carro>>


}