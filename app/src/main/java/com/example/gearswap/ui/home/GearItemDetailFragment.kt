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
import kotlin.random.Random


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


            Glide.with(this)
                .load(getProfilePicture(item.author))
//                .centerCrop()
                .circleCrop().placeholder(R.drawable.baseline_account_circle_24).into(binding.profileImage)

            binding.textViewUserName.text = item.author
            binding.textViewUserLocation.text = getProfileLocation()
            binding.textViewUserRating.text =
                "${(Random.nextInt(10, 51) / 10.0)}   (${Random.nextInt(50, 990)})"

            binding.buyNowButton.setOnClickListener {
                findNavController().navigate(R.id.show_checkout)
            }


        }
    }

    private fun getProfilePicture(author : String): String {
        return when (author) {
            "AliceSmith789" -> "https://images.pexels.com/photos/415829/pexels-photo-415829.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1"
            "BobWhite202" -> "https://images.pexels.com/photos/428364/pexels-photo-428364.jpeg?auto=compress&cs=tinysrgb&w=600"
            "CharlieBrown321" -> "https://images.pexels.com/photos/1043471/pexels-photo-1043471.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1"
            "DannyPhantom654" -> "https://images.pexels.com/photos/697509/pexels-photo-697509.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1"
            "EvaFox777" -> "https://images.pexels.com/photos/1674752/pexels-photo-1674752.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1"
            "FredAstaire888" -> "https://images.pexels.com/photos/1674752/pexels-photo-1674752.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1"
            "GraceHopper999" -> "https://images.pexels.com/photos/1499327/pexels-photo-1499327.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1    "
            "JaneDoe456" -> "https://images.pexels.com/photos/678783/pexels-photo-678783.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1"
            "JohnDoe123" -> "https://images.pexels.com/photos/1462980/pexels-photo-1462980.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1"


            else -> ""
        }
    }

    private fun getProfileLocation(): String {
        return when (Random.nextInt(1, 5)) {
            1 -> "San Francisco, CA"
            2 -> "New York, NY"
            3 -> "Los Angeles, CA"
            4 -> "Chicago, IL"
            5 -> "Houston, TX"
            else -> "Unknown"
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