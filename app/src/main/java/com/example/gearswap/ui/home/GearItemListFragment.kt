package com.example.gearswap.ui.home

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.gearswap.databinding.FragmentGearItemListBinding
import com.example.gearswap.placeholder.PlaceholderContent

class GearItemListFragment : Fragment() {
    //TODO: Add tab layout for different sport items
    private var columnCount = 1
    private var _binding: FragmentGearItemListBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            columnCount = it.getInt(ARG_COLUMN_COUNT)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        _binding = FragmentGearItemListBinding.inflate(inflater, container, false)
        val view = binding.root
        setupRecyclerView()
        return view
    }


    private fun setupRecyclerView() {
        binding.gearItemsList.layoutManager = when {
            columnCount <= 1 -> LinearLayoutManager(context)
            else -> GridLayoutManager(context, columnCount)
        }
        binding.gearItemsList.adapter =
            GearItemListRecyclerViewAdapter(PlaceholderContent.ITEMS, onItemClick = { itemId ->
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
        fun newInstance(columnCount: Int) = GearItemListFragment().apply {
            arguments = Bundle().apply {
                putInt(ARG_COLUMN_COUNT, columnCount)
            }
        }
    }
}
