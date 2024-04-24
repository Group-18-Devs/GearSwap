package com.example.gearswap.ui.home

import android.icu.text.NumberFormat
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.gearswap.R
import com.example.gearswap.databinding.GearItemBinding
import com.example.gearswap.placeholder.PlaceholderContent.PlaceholderItem
import java.util.Locale

/**
 * [RecyclerView.Adapter] that can display a list of [PlaceholderItem].
 * Each item displays a title, price, description, and an image.
 */
class GearItemListRecyclerViewAdapter(
    private val values: List<PlaceholderItem>, private val onItemClick: (gearItemId: Int) -> Unit
) : RecyclerView.Adapter<GearItemListRecyclerViewAdapter.ViewHolder>() {

    inner class ViewHolder(binding: GearItemBinding) : RecyclerView.ViewHolder(binding.root) {
        val titleView: TextView = binding.gearTitle
        val priceView: TextView = binding.gearPrice
        val descriptionView: TextView = binding.gearDescription
        val imageView: ImageView = binding.gearImage
        val ratingView: RatingBar = binding.gearRating

        init {
            binding.root.setOnClickListener {
                onItemClick(bindingAdapterPosition)
            }
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup, viewType: Int
    ): ViewHolder {
        return ViewHolder(
            GearItemBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = values[position]
        holder.titleView.text = item.title
        //Fixme: format price for appropriate locale using string resources

        holder.priceView.text = holder.itemView.context.getString(R.string.item_price_string,NumberFormat.getCurrencyInstance().format(item.price))

        holder.descriptionView.text = item.description
        holder.ratingView.rating = item.rating
        Glide.with(holder.imageView.context).load(item.imageUrl)
            .placeholder(R.drawable.placeholder300).into(holder.imageView)

    }

    override fun getItemCount(): Int = values.size

}

