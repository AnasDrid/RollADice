package com.lonelywiz.diceroller

import android.graphics.drawable.AnimationDrawable
import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollbutton :Button = findViewById(R.id.rollbutton)
        val dicetext : TextView = findViewById(R.id.dice)
        val diceimage : ImageView = findViewById(R.id.diceimage)
        rollbutton.setOnClickListener {
            val result = rolldice()
            val drawableResource=when(result){
                1->R.drawable.dice_1
                2->R.drawable.dice_2
                3->R.drawable.dice_3
                4->R.drawable.dice_4
                5->R.drawable.dice_5
                6->R.drawable.dice_6
                else -> R.drawable.dice_6

            }
            diceimage.setImageResource(drawableResource)
        }
    }
    private fun rolldice(): Int {
       return Random.nextInt(6)+1
    }
}