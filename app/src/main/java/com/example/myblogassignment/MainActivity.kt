package com.example.myblogassignment

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myblogassignment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.rvBlogs.layoutManager = LinearLayoutManager(this)
        displayBlogs()

    }

    fun displayBlogs(){
        val blog1 = Blog("", "1983-04-23", "Henry Wesley", "Blossoms", "Hello there")
        val blog2 = Blog("", "1983-04-23", "Henry Wesley", "Blossoms", "Hello there")
        val blog3 = Blog("", "1983-04-23", "Henry Wesley", "Blossoms", "Hello there")
        val blog4 = Blog("", "1983-04-23", "Henry Wesley", "Blossoms", "Hello there")
        val blog5 = Blog("", "1983-04-23", "Henry Wesley", "Blossoms", "Hello there")
        val blog6 = Blog("", "1983-04-23", "Henry Wesley", "Blossoms", "Hello there")
        val blog7 = Blog("", "1983-04-23", "Henry Wesley", "Blossoms", "Hello there")

        val blogList = listOf(blog1, blog2, blog3, blog4, blog5, blog6, blog7)
        val blogsAdapter = BlogsAdapter(blogList)
        binding.rvBlogs.adapter = blogsAdapter


    }




}