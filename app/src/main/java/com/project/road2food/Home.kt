package com.project.road2food

import android.content.Intent
import android.os.Bundle
import android.text.TextUtils.replace
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_home.*
import java.util.zip.Inflater

class Home: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_home, container,false)

        val btnmap = view.findViewById<Button>(R.id.btnmap)
        val btnoffers = view.findViewById<Button>(R.id.btnoffers)

        btnmap.setOnClickListener {
            val mapfragment = Map_fragment()
            val transaction: FragmentTransaction = requireFragmentManager().beginTransaction()
            transaction.replace(R.id.fragment_container, mapfragment)
            transaction.commit()

        }

        btnoffers.setOnClickListener {
            val offerFragment= Discount_Fragment()
            val transaction: FragmentTransaction = requireFragmentManager().beginTransaction()
            transaction.replace(R.id.fragment_container, offerFragment)
            transaction.commit()
        }


        return view




    }



}