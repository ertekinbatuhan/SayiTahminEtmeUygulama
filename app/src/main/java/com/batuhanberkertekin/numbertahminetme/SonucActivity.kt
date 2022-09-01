package com.batuhanberkertekin.numbertahminetme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_sonuc.*

class SonucActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sonuc)



        val getIntent = intent.getBooleanExtra("key",false)


        if(getIntent == true){


            textViewSonuc.text = "Tebrikler Bildiniz"


            imageView.setImageResource(R.drawable.mutlu)






        }

        if(getIntent == false){
            textViewSonuc.text = "Maalesef Bilemediniz"


            imageView.setImageResource(R.drawable.uzgun)


        }








        tekrarButton.setOnClickListener {
            val intent = Intent(applicationContext,TahminActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}