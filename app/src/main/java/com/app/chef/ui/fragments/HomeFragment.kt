package com.app.chef.ui.fragments

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.app.chef.R
import com.app.chef.adapters.ProductsRecycAdapter
import com.app.chef.databinding.FragmentHomeBinding
import com.app.chef.MainActivity
import com.app.chef.ui.viewmodels.ProductViewModel
import com.app.chef.core.utils.Resource
import com.app.chef.core.utils.TAGS

class HomeFragment: Fragment(R.layout.fragment_home){

    private var _binding: FragmentHomeBinding? = null
    private val bind get() = _binding!!

    lateinit var mViewModel: ProductViewModel
    lateinit var prodsAdapter: ProductsRecycAdapter


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentHomeBinding.bind(view)
        mViewModel = (activity as MainActivity).viewModel
        setupProdsRecycView()

        mViewModel.productsData.observe(viewLifecycleOwner, Observer {response ->
            when(response){
                is Resource.Loading -> {
//                    showProgressBar()
                }
                is Resource.Success -> {
//                    hideProgressBar()
                    response.data?.let { prodsResponse ->
                        Log.e(TAGS.API_SUCCESS, "An error occurred: ${response.data}")
                        prodsAdapter.differ.submitList(prodsResponse)
                    }
                }
                is Resource.Error -> {
//                    hideProgressBar()
                    response.data?.let { msg ->
                        Log.e(TAGS.API_ERR, "An error occurred: $msg")
                    }
                }
            }
        })
        mViewModel.getAllProducts()
    }

    private fun hideProgressBar() {
        TODO("Not yet implemented")
    }

    private fun showProgressBar() {
        TODO("Not yet implemented")
    }

    private fun setupProdsRecycView() {
        prodsAdapter = ProductsRecycAdapter()
        bind.productsRecycView.apply {
            adapter = prodsAdapter
            layoutManager = LinearLayoutManager(activity, LinearLayoutManager.HORIZONTAL, false)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}