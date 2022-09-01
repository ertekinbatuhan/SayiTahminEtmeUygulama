package com.batuhanberkertekin.numbertahminetme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_tahmin.*
import kotlin.random.Random

class TahminActivity : AppCompatActivity() {
    private  var randomNumber = 0

    private  var   kalanHak = 2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tahmin)


        randomNumber = Random.nextInt(7) // 0 ile 6 arası random number üretir


      // Log.e("Sayı",randomNumber.toString())










        tahminButton.setOnClickListener {

             kalanHak = kalanHak - 1
            val tahminAl = girdiText.text.toString().toInt()

            if (randomNumber == tahminAl){

                val intent = Intent(applicationContext,SonucActivity::class.java)

                intent.putExtra("key",true)


                startActivity(intent)
                finish()

                   //diğer ifleri devre dışı bırakır true olursa
                //önemli bir bilgi
                return@setOnClickListener


            }
            if(randomNumber > tahminAl){

                arttirmaText.text = "Arttır"
               hakText.text = "Kalan Hak : $kalanHak"

            }else{
                arttirmaText.text = "Azalt"
                hakText.text = "Kalan Hak : $kalanHak"
            }

            if(kalanHak == 0){

                val intent = Intent(applicationContext,SonucActivity::class.java)

                intent.putExtra("key",false)


                startActivity(intent)
                finish()

            }
            girdiText.setText("")




        }
    }
}