package com.example.gearswap.ui.myProfile.orders

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.gearswap.R

class OrdersFragment : Fragment() {

    companion object {
        fun newInstance() = OrdersFragment()
    }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        Toast.makeText(requireContext(), "Not Yet Implemented", Toast
            .LENGTH_SHORT)
            .show()
        return inflater.inflate(R.layout.fragment_orders, container, false)
    }
}