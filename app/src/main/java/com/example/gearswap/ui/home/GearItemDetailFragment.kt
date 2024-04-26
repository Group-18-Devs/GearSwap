package com.example.gearswap.ui.home

import android.icu.text.NumberFormat
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.bumptech.glide.Glide
import com.example.gearswap.R
import com.example.gearswap.databinding.FragmentGearItemDetailBinding
import com.example.gearswap.placeholder.PlaceholderContent


private val args = GearItemDetailFragmentArgs

/**
 * A simple [Fragment] subclass.
 * Use the [GearItemDetailFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class GearItemDetailFragment : Fragment() {

    private var gearItemId: Int? = null
    //TODO:Refactor viewBinding
    private var _binding: FragmentGearItemDetailBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            // +1 to get the correct index item ids starts at 1
            gearItemId = args.fromBundle(it).gearItemId + 1
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        Log.d("GearItemDetail", "Gear Item ID - fragment: $gearItemId")
        _binding = FragmentGearItemDetailBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        PlaceholderContent.ITEMS.find { it.id == gearItemId.toString() }?.let { item ->
            val imageView = binding.imageViewGearPhoto
            Glide.with(this).load(item.imageUrl).placeholder(R.drawable.placeholder300)
                .into(imageView)
            binding.textViewGearTitle.text = item.title
            binding.textViewGearDescription.text = item.shortDescription
            binding.textViewGearDescription2.text = item.longDescription
            binding.textViewGearPrice.text = getString(
                R.string.item_price_string, NumberFormat.getCurrencyInstance().format(item.price)
            )
            binding.ratingBarGear.rating = item.rating
            binding.buyNowButton.setOnClickListener {
                findNavController().navigate(R.id.show_checkout)
            }

        }
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param gearItemId Int, Gear Item Id.
         * @return A new instance of fragment GearItemDetailFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(gearItemId: Int) = GearItemDetailFragment()

    }
}