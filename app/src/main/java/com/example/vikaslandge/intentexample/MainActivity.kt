package com.example.vikaslandge.intentexample

import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        b1.setOnClickListener{
            val i= Intent()
            i.action=Intent.ACTION_DIAL
            i.data= Uri.parse("tel:"+txt.text.toString())
            startActivity(i)
        }

        b2.setOnClickListener{
            val i= Intent(this@MainActivity,welcome::class.java)
            startActivity(i)
        }
        b3.setOnClickListener{
            val i= packageManager.getLaunchIntentForPackage("com.android.chrome")
            if (i==null){

                val i= Intent()
                i.action= Intent.ACTION_VIEW
                i.data= Uri.parse("http://www.google.com")
                startActivity(i)
            }else{
                startActivity(i)

            }


        }

    }
}
