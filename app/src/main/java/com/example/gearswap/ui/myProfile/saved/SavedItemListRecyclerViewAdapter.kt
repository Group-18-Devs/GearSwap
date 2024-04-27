package com.example.gearswap.ui.myProfile.saved

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.gearswap.R
import com.example.gearswap.databinding.GearItemBinding
import com.example.gearswap.databinding.SavedItemBinding
import com.example.gearswap.placeholder.PlaceholderContent
import java.util.Locale

class SavedItemListRecyclerViewAdapter(
    private val values: List<PlaceholderContent.PlaceholderItem>, private val onItemClick: (gearItemId: Int) -> Unit
) : RecyclerView.Adapter<SavedItemListRecyclerViewAdapter.ViewHolder>(){
    inner class ViewHolder(binding: SavedItemBinding) : RecyclerView.ViewHolder
        (binding.root) {

        val savedTitleView: TextView = binding.savedGearTitle
        val savedPriceView: TextView = binding.savedGearPrice
        val savedDescriptionView: TextView = binding.savedGearDescription
        val savedImageView: ImageView = binding.savedGearImage

        init {
            binding.root.setOnClickListener {
                onItemClick(bindingAdapterPosition)
            }
        }

    }

    override fun onCreateViewHolder(
        parent: ViewGroup, viewType: Int): ViewHolder {
            return ViewHolder(
                SavedItemBinding.inflate(
                    LayoutInflater.from(parent.context), parent, false
                )
            )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = values[position]
        holder.savedTitleView.text = item.title
        //Fixme: format price for appropriate locale using string resources
        holder.savedPriceView.text = "$${
            String.format(
                Locale.US, "%.2f", item.price
            )
        }"
        holder.savedDescriptionView.text = item.shortDescription
        Glide.with(holder.savedImageView.context).load(item.imageUrl)
            .placeholder(R.drawable.placeholder300).into(holder.savedImageView)

    }

    override fun getItemCount(): Int = values.size


}