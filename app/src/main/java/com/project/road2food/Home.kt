//package com.project.road2food
//
//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//import android.widget.Toast
//import android.view.View
//import android.widget.PopupMenu
//import androidx.fragment.app.Fragment
//import kotlinx.android.synthetic.main.activity_main.*
//import kotlinx.android.synthetic.main.user_login.*
//import kotlinx.android.synthetic.main.user_login.registration
//import kotlinx.android.synthetic.main.user_registeration.*
//import kotlinx.android.synthetic.main.account.*
//import com.google.android.material.bottomnavigation.BottomNavigationView
//import kotlinx.android.synthetic.main.fragment_home.*
//
//class Home : AppCompatActivity() {
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//
//
//        popupMenu()
//    }
//
//    private fun popupMenu() {
//        val popupmenu = PopupMenu(applicationContext, spinner)
//        popupmenu.inflate(R.menu.food_menu)
//        popupmenu.setOnMenuItemClickListener {
//            when(it.itemId) {
//                R.id.itDinner -> {
//                    Toast.makeText(applicationContext, "share pressed", Toast.LENGTH_LONG).show()
//                    true
//                }
//                else -> true
//            }
//        }
//
//
//    }
//
//}
//
//
//















package com.project.road2food

import android.content.Intent
import android.os.Bundle
import android.text.TextUtils.replace
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
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

        val button = view.findViewById<Button>(R.id.spinner)



        val popupMenu: PopupMenu = PopupMenu(context,button)
        popupMenu.menuInflater.inflate(R.menu.food_menu,popupMenu.menu)
        popupMenu.setOnMenuItemClickListener(PopupMenu.OnMenuItemClickListener { item ->
            when(item.itemId) {
                R.id.itDinner -> {
                    val lunchmenu = Lunch_menu()
                    val transaction: FragmentTransaction = requireFragmentManager().beginTransaction()
                    transaction.replace(R.id.fragment_contain, lunchmenu)
                    transaction.commit()
                }
                R.id.itlunch -> {
                    val lunchmenu = Lunch_menu()
                    val transaction: FragmentTransaction = requireFragmentManager().beginTransaction()
                    transaction.replace(R.id.fragment_contain, lunchmenu)
                    transaction.commit()
                }
                R.id.itbreakfast -> {
                    val lunchmenu = Lunch_menu()
                    val transaction: FragmentTransaction = requireFragmentManager().beginTransaction()
                    transaction.replace(R.id.fragment_contain, lunchmenu)
                    transaction.commit()
                }
            }
            true
        })
        popupMenu.show()

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