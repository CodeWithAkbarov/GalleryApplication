package iqro.mobile.galleryapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import iqro.mobile.galleryapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val imageList = arrayListOf(
        R.drawable.apple,
        R.drawable.apricot,
        R.drawable.grapes,
        R.drawable.banana,
        R.drawable.apple,
        R.drawable.peach,
        R.drawable.banana,
        R.drawable.apricot,
        R.drawable.apple,
        R.drawable.apricot,
        R.drawable.grapes,
        R.drawable.banana,
        R.drawable.apple,
        R.drawable.peach,
        R.drawable.banana,
        R.drawable.apricot,
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val adapter = GalleryAdapter(context = this, imageList)

        binding.gridView.adapter = adapter

        binding.gridView.setOnItemClickListener { _, _, position, _ ->
            Toast.makeText(this, "$position tanlandi", Toast.LENGTH_SHORT).show()
            Intent(this, FruitImageActivity::class.java).apply {
                putExtra("id", imageList[position])
                startActivity(this)
            }
        }

    }
}