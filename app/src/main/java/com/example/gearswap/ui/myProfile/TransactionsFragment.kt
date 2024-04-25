package com.example.gearswap.ui.myProfile

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.gearswap.R
import com.example.gearswap.databinding.FragmentTransactionsBinding
import java.text.SimpleDateFormat
import java.util.*

class TransactionsFragment : Fragment() {

    private var _binding: FragmentTransactionsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentTransactionsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Set placeholder data
        binding.transactionId.text = getString(R.string.placeholder_transaction_id, "TX1234567890")
        binding.itemDetails.text = getString(R.string.placeholder_item_details, "Special Gear", "2", "$100.00")
        binding.dateOfTransaction.text = getString(R.string.placeholder_date_of_transaction, getCurrentDate())
        binding.confirmationMessage.text = getString(R.string.placeholder_confirmation_message)

        // Set up button click listeners
        binding.viewDetailsButton.setOnClickListener {
            // Navigate to the details view
            // TODO: Implement navigation logic
        }

        binding.returnButton.setOnClickListener {
            // Navigate back to the main browsing screen
            // TODO: Implement navigation logic
        }
    }

    private fun getCurrentDate(): String {
        val dateFormat = SimpleDateFormat("MM/dd/yyyy", Locale.getDefault())
        return dateFormat.format(Date())
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {
        fun newInstance() = TransactionsFragment()
    }
}
