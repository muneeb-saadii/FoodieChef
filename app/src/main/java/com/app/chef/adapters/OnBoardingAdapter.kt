package com.app.chef.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.app.chef.R
import com.app.chef.databinding.ItemOnboardingBinding
import com.app.chef.databinding.ProductItemDesignBinding
import com.app.chef.models.datamodels.OnBoardingModel



class OnBoardingAdapter(val data: ArrayList<OnBoardingModel>): RecyclerView.Adapter<OnBoardingAdapter.VHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VHolder {
        val binding = ItemOnboardingBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return VHolder(binding)
    }


    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: VHolder, position: Int) {
        val iData: OnBoardingModel = data.get(position) ?: return

        holder.binding.apply {

            println("Onboarding_data :: $iData")
            Glide.with(root).load(iData.image).into(imageView)
            itemHTxt.text = iData.title
            itemVTxt.text = iData.desc
        }
    }


    class VHolder(val binding: ItemOnboardingBinding) : RecyclerView.ViewHolder(binding.root)

}
