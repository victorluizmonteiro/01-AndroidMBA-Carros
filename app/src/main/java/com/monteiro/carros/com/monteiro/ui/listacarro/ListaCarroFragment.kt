package com.monteiro.carros.com.monteiro.ui.listacarro

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.monteiro.carros.R
import com.monteiro.carros.api.CarroAPI
import com.monteiro.carros.api.RetroFitClient
import com.monteiro.carros.model.Carro
import kotlinx.android.synthetic.main.fragment_lista_carro.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class ListaCarroFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        carregarDados()
        // Inflate the layout for this fragment
        return inflater!!.inflate(R.layout.fragment_lista_carro, container, false)
    }


    fun carregarDados(){
        val api = RetroFitClient.getInstance(baseUrl = "https://carroapivictor.herokuapp.com")
                .create(CarroAPI::class.java)

        api.buscarTodos()
                .enqueue(object : Callback<List<Carro>>{
                    override fun onResponse(call: Call<List<Carro>>?, response: Response<List<Carro>>?) {
                        if(response?.isSuccessful == true){
                            setupLista(response?.body())
                        }
                    }

                    override fun onFailure(call: Call<List<Carro>>?, t: Throwable?) {

                    }

                })



    }

    fun setupLista(carros: List<Carro>?) {
        carros.let {
            rvCarros.adapter = ListaCarroAdapter(carros!!, context)
            val layoutManager = LinearLayoutManager(context)
            rvCarros.layoutManager = layoutManager
        }

    }
}// Required empty public constructor
