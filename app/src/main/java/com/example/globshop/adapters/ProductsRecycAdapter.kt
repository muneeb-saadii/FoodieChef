package com.example.globshop.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.globshop.R
import com.example.globshop.databinding.ProductItemDesignBinding
import com.example.globshop.models.products.ProductsResponseItem

class ProductsRecycAdapter : RecyclerView.Adapter<ProductsRecycAdapter.MyViewHolder>() {

    inner class MyViewHolder(val binding: ProductItemDesignBinding) : RecyclerView.ViewHolder(binding.root)

    private val differCallback = object : DiffUtil.ItemCallback<ProductsResponseItem>() {
        override fun areItemsTheSame(oldItem: ProductsResponseItem, newItem: ProductsResponseItem): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: ProductsResponseItem, newItem: ProductsResponseItem): Boolean {
            return oldItem == newItem
        }
    }

    val differ = AsyncListDiffer(this, differCallback)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val binding = ProductItemDesignBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return differ.currentList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val item = differ.currentList[position]
        holder.binding.apply {
            var isFav = false
            Glide.with(root).load(item.image).into(productImage)
            productTitle.text = item.title
            productPrice.text = "${item.price}$"
            productBrand.text = item.category
            ratingBar.rating = item.rating.rate.toFloat()
            ratingCount.text = "(${item.rating.count})"
            /*favoriteIcon.setImageResource(if (item.isFavorite) R.drawable.ic_fav else R.drawable.ic_unfav)
            newTag.visibility = if (item.isNew) View.VISIBLE else View.GONE*/

            rootLayArea.setOnClickListener{
                onItemClickListener?.let {
                    it(item, position)
                }
            }
            favIconArea.setOnClickListener {
                isFav = !isFav
                if(isFav){
                    favoriteIcon.setImageDrawable(ContextCompat.getDrawable(root.context, R.drawable.ic_fav_filled))
                }else{
                    favoriteIcon.setImageDrawable(ContextCompat.getDrawable(root.context, R.drawable.ic_fav_unfilled))
                }
            }
        }
    }

    private var onItemClickListener: ((ProductsResponseItem, Int)-> Unit)? = null

    fun setOnItemClickListener(listener: (ProductsResponseItem, Int)-> Unit){
        onItemClickListener = listener
    }
}
