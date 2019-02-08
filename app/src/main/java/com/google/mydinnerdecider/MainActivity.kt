package com.google.mydinnerdecider

import android.annotation.SuppressLint
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    val foodlist = arrayListOf("Chinese","Burger","Chocolates","Pizza")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       decidebtn.setOnClickListener{
           val random = Random()
               val randomfood = random.nextInt(foodlist.count())
           selectedfoodtxt.text = foodlist[randomfood]
    }
        addfoodbtn.setOnClickListener{
            val newfood = addfoodtxt.text.toString()
            foodlist.add(newfood)
            addfoodtxt.text.clear()
            println(foodlist)
        }
    }
}

