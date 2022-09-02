package iqro.mobile.galleryapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import iqro.mobile.galleryapplication.databinding.FruitImageBinding

class FruitImageActivity : AppCompatActivity() {

    private lateinit var binding: FruitImageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FruitImageBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val imageId = intent.getIntExtra("id", 0)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        binding.fruitImage.setImageResource(imageId)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            finish()
        }
        return super.onOptionsItemSelected(item)
    }
}