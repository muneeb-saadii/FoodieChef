package com.example.globshop.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.globshop.R
import com.example.globshop.databinding.ActivityMainBinding
import com.example.globshop.db.AppDatabase
import com.example.globshop.factory.ProductsVMProviderFactory
import com.example.globshop.repository.ProductsRepository
import com.example.globshop.ui.viewmodels.ProductViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var b: ActivityMainBinding
    lateinit var viewModel: ProductViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityMainBinding.inflate(layoutInflater)
        setContentView(b.root)

        val prodsRepository = ProductsRepository(AppDatabase(this))
        val vmProviderFactory = ProductsVMProviderFactory(prodsRepository)
        viewModel = ViewModelProvider(this, vmProviderFactory).get(ProductViewModel::class.java)

        viewModel?.let{ b.mainBottomNavView.setupWithNavController(findNavController(R.id.mainNavHostFrag)) }


    }
}