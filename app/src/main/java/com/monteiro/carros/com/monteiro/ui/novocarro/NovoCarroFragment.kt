package com.monteiro.carros.com.monteiro.ui.novocarro


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.monteiro.carros.R


/**
 * A simple [Fragment] subclass.
 */
class NovoCarroFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater!!.inflate(R.layout.fragment_novo_carro, container, false)
    }

}// Required empty public constructor
