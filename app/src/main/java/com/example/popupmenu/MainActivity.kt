package com.example.popupmenu

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.PopupMenu
import android.widget.Toast

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


      val  pop_up=findViewById<LinearLayout>(R.id.popupmenu)

        val btn=findViewById<Button>(R.id.showpopupmenu)

        btn.setOnClickListener {
            val popupmenu=PopupMenu(this,btn)

            popupmenu.menuInflater.inflate(R.menu.menu_pop,popupmenu.menu)
            popupmenu.show()

            popupmenu.setOnMenuItemClickListener {

                when(it.itemId){
                    R.id.redColor -> {
                        pop_up.setBackgroundColor(Color.parseColor("#FF0000"))
                      Toast.makeText(this,"Redcolor",Toast.LENGTH_SHORT)

                    }

                    R.id.greenColor -> {
                        pop_up.setBackgroundColor(Color.parseColor("#00FF00"))
                        Toast.makeText(this,"GreenColor",Toast.LENGTH_SHORT)

                    }

                    R.id.blueColor -> {
                        pop_up.setBackgroundColor(Color.parseColor("#0000ff"))
                        Toast.makeText(this,"BlueColor",Toast.LENGTH_SHORT)

                    }
                }
                true
            }
        }

    }
}