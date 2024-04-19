package com.example.gearswap.ui.home

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
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
    private var _binding: FragmentGearItemDetailBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            gearItemId = args.fromBundle(it).gearItemId

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
        PlaceholderContent.ITEMS.find { it.id == gearItemId.toString() }?.let {
        binding.textView.text = "Gear Item Detail Fragment Item ID: $gearItemId/n" + it.title
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