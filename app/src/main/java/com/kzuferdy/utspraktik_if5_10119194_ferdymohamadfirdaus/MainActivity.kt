package com.kzuferdy.utspraktik_if5_10119194_ferdymohamadfirdaus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
//Nama : Ferdy Mohamad Firdaus
//Nim : 10119194
//Kelas : IF 5
// Mohon maaf pak tidak maksimal di karenakan jaringan saya gangguan terus pak
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_lanjut.setOnClickListener {
            var intent = Intent(this@MainActivity, DataActivity::class.java)
            startActivity(intent)
        }

    }
}