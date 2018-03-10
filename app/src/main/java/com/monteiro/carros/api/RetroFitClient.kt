package com.monteiro.carros.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by Monteiro on 10/03/18.
 */
object RetroFitClient{

    private var retrofit: Retrofit? = null

    fun getInstance(baseUrl:String):Retrofit{
        if(retrofit == null){
            retrofit = Retrofit.Builder()
                    .baseUrl(baseUrl)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
        }
        return retrofit!!
    }
}