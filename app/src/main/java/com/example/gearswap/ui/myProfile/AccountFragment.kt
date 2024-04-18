package com.example.gearswap.ui.myProfile

import androidx.fragment.app.viewModels
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.example.gearswap.R
import com.example.gearswap.databinding.FragmentAccountBinding
import com.example.gearswap.databinding.FragmentHomeBinding
import com.example.gearswap.databinding.FragmentMyProfileBinding
import com.example.gearswap.ui.account.AccountViewModel
import com.example.gearswap.ui.home.HomeViewModel

class AccountFragment : Fragment() {

    private var _binding: FragmentAccountBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!
    companion object {
        fun newInstance() = AccountFragment()
    }

    private val viewModel: AccountViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val accountViewModel =
            ViewModelProvider(this)[MyProfileViewModel::class.java]

         _binding = FragmentAccountBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.accountText
        accountViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }
}