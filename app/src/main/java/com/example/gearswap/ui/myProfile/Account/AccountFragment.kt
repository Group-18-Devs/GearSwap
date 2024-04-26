package com.example.gearswap.ui.myProfile.Account

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import com.example.gearswap.databinding.FragmentAccountBinding
//import com.example.gearswap.ui.account.AccountViewModel
import com.example.gearswap.ui.myProfile.MyProfileViewModel

class AccountFragment : Fragment() {

    private var _binding: FragmentAccountBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding
        get() = _binding!!

    companion object {
        fun newInstance() = AccountFragment()
    }

//    private val viewModel: AccountViewModel by viewModels()

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View {
//        val accountViewModel = ViewModelProvider(this)[MyProfileViewModel::class.java]

        _binding = FragmentAccountBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textView3
        textView.text = "This is Account Fragment"
//        accountViewModel.text.observe(viewLifecycleOwner) { textView.text = it }
        return root
    }
}
