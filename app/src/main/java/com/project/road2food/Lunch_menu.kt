package com.project.road2food

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction

class Lunch_menu: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.lunchmenu, container, false)
        val btnmap = view.findViewById<Button>(R.id.btnmap)
        val btnoffers = view.findViewById<Button>(R.id.btnoffers)

        btnmap.setOnClickListener {
            val mapfragment = Map_fragment()
            val transaction: FragmentTransaction = requireFragmentManager().beginTransaction()
            transaction.replace(R.id.fragment_container, mapfragment)
            transaction.commit()

        }
        btnoffers.setOnClickListener {
            val offerFragment = Discount_Fragment()
            val transaction: FragmentTransaction = requireFragmentManager().beginTransaction()
            transaction.replace(R.id.fragment_container, offerFragment)
            transaction.commit()
        }
        return view


    }
}