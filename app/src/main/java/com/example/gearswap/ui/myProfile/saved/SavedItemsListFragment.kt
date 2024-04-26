package com.example.gearswap.ui.myProfile.saved

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.gearswap.R
import com.example.gearswap.databinding.FragmentGearItemListBinding
import com.example.gearswap.databinding.FragmentSavedItemDetailBinding
import com.example.gearswap.databinding.FragmentSavedItemListBinding
import com.example.gearswap.placeholder.PlaceholderContent
import com.example.gearswap.ui.home.GearItemListFragment
import com.example.gearswap.ui.home.GearItemListFragmentDirections
import com.example.gearswap.ui.home.GearItemListRecyclerViewAdapter

class SavedItemsListFragment : Fragment() {
    private var columnCount = 1
    private var _binding: FragmentSavedItemListBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            columnCount = it.getInt(GearItemListFragment.ARG_COLUMN_COUNT)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSavedItemListBinding.inflate(inflater, container, false)
        val view = binding.root
        setupRecyclerView()
        return view
        //set textview
    }

    private fun setupRecyclerView() {
        binding.savedItemsList.layoutManager = when {
            columnCount <= 1 -> LinearLayoutManager(context)
            else -> GridLayoutManager(context, columnCount)
        }
        binding.savedItemsList.adapter =
            SavedItemListRecyclerViewAdapter(PlaceholderContent.ITEMS, onItemClick = { itemId ->
                findNavController().navigate(GearItemListFragmentDirections.showItemDetail(itemId))
            })
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null // Clean up binding when the view is destroyed
    }

    companion object {
        const val ARG_COLUMN_COUNT = "column-count"

        @JvmStatic
        fun newInstance(columnCount: Int) = SavedItemsListFragment().apply {
            arguments = Bundle().apply {
                putInt(ARG_COLUMN_COUNT, columnCount)
            }
        }
    }


}