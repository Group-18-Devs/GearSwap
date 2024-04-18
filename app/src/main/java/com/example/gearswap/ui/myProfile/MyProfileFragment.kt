package com.example.gearswap.ui.myProfile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.gearswap.R
import com.example.gearswap.databinding.FragmentMyProfileBinding
import com.google.android.material.tabs.TabLayoutMediator

class MyProfileFragment : Fragment() {

    private var _binding: FragmentMyProfileBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val myProfileViewModel =
            ViewModelProvider(this)[MyProfileViewModel::class.java]

        _binding = FragmentMyProfileBinding.inflate(inflater, container, false)
        val root: View = binding.root


        val viewPager = binding.viewPager
        viewPager.adapter = ViewPagerAdapter(this)

        val tabs = binding.tabs
        TabLayoutMediator(tabs, viewPager) { tab, position ->
            tab.text = when (position) {
                0 -> "Account"
                1 -> "Saved"
                2 -> "Orders"
                3 -> "Reviews"
                else -> null
            }
            tab.icon = when (position) {
                0 -> ContextCompat.getDrawable(
                    requireContext(), R.drawable
                        .baseline_person_24
                )

                1 -> ContextCompat.getDrawable(
                    requireContext(),
                    R.drawable.baseline_save_24
                )

                2 -> ContextCompat.getDrawable(
                    requireContext(), R.drawable
                        .baseline_attach_money_24
                )

                3 -> ContextCompat.getDrawable(
                    requireContext(), R.drawable
                        .baseline_reviews_24
                )

                else -> null
            }
        }.attach()

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}