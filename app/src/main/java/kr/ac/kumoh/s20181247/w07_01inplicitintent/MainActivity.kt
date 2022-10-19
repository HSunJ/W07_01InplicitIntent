package kr.ac.kumoh.s20181247.w07_01inplicitintent

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kr.ac.kumoh.s20181247.w07_01inplicitintent.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnHomepage.setOnClickListener{
            var uri = Uri.parse("http://bwoh.github.io")
            var intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
        }
        binding.btnMap.setOnClickListener{
            var uri = Uri.parse("geo:36.145014,128.393847")
            var intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
        }
        binding.btnTelephone.setOnClickListener{
            var uri = Uri.parse("sms:010-2826-4845")
            var intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
        }
    }
}