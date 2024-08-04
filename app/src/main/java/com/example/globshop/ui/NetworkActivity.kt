package com.example.globshop.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.globshop.adapters.ProductsRecycAdapter
import com.example.globshop.databinding.ActivityNetworkBinding
import com.example.globshop.models.products.ProductsResponse
import com.example.globshop.practice.MyApi
import com.example.globshop.utils.Constants
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

class NetworkActivity : AppCompatActivity() {

    lateinit var b: ActivityNetworkBinding
    lateinit var prodsAdapter: ProductsRecycAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityNetworkBinding.inflate(layoutInflater)
        setContentView(b.root)

        setUpRecyc()
//        requestAllProducts()
        val api = ApiHelper.getInstance().create(MyApi::class.java)

        GlobalScope.launch(Dispatchers.Main) {
            val result = api.getProducts()
            if(result.isSuccessful){
                result.body()?.let {
                    Log.d("MY_API", it.toString())
                    prodsAdapter.differ.submitList(it)
                }
            }
        }
    }

    private fun setUpRecyc() {
        prodsAdapter = ProductsRecycAdapter()
        b.recycView.apply {
            this.adapter = prodsAdapter
            layoutManager = LinearLayoutManager(this@NetworkActivity, LinearLayoutManager.HORIZONTAL, false)
        }
    }

    fun requestAllProducts(){
        val api = Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(MyApi::class.java)

        api.getAllProducts().enqueue(object : Callback<ProductsResponse>{
            override fun onResponse(
                call: Call<ProductsResponse>,
                response: Response<ProductsResponse>
            ) {
                if(response.isSuccessful){
                    response.body()?.let {
                        Log.d("MY_API", it.toString())
                        prodsAdapter.differ.submitList(it)
                    }
                }
            }

            override fun onFailure(call: Call<ProductsResponse>, t: Throwable) {
                Log.d("MY_API", "Error::${t.message}")
            }
        })
    }

    object ApiHelper{
        fun getInstance(): Retrofit{
            return Retrofit.Builder().baseUrl(Constants.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }
    }
}