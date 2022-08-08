package com.kotlin.philippl_androidfundamentals

import android.os.Bundle
import android.os.Handler
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.updateLayoutParams
import com.kotlin.philippl_androidfundamentals.databinding.ActivityImageBinding

class ImageActivity : AppCompatActivity() {

    private lateinit var binding: ActivityImageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityImageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.title = "Image Activity"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        binding.btnAddimage.setOnClickListener {
            Handler().postDelayed({
                binding.imgvImage.setImageResource(0)
                finish()
            }, 1000)
            binding.imgvImage.setImageResource(R.drawable.theworldafterthefall)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }
}