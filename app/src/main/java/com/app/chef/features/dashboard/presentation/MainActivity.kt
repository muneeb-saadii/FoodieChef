package com.app.chef.features.dashboard.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.app.chef.R
import com.app.chef.databinding.ActivityMainBinding
import com.app.chef.db.AppDatabase
import com.app.chef.features.itemdetails.data.ProductsVMProviderFactory
import com.app.chef.features.itemdetails.domain.repo.ProductsRepository
import com.app.chef.features.itemdetails.data.ProductViewModel

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


        b.bottomNavigationView.background = null
        b.bottomNavigationView.menu.getItem(2).isEnabled = false
        viewModel?.let{ b.bottomNavigationView.setupWithNavController(findNavController(R.id.mainNavHostFrag)) }

        b.fab.setOnClickListener {
            findNavController(R.id.mainNavHostFrag).navigate(R.id.newItemFragment)
        }
    }
}