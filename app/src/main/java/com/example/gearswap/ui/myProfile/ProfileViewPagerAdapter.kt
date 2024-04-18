package com.example.gearswap.ui.myProfile

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter(fragment: Fragment) : FragmentStateAdapter(fragment) {

    override fun getItemCount(): Int = 4

    override fun createFragment(position: Int): Fragment {
        return when (position) {
//          TODO: Add additional fragments
            0 -> AccountFragment()
            1 -> SavedItemsFragment()
            2 -> TransactionsFragment()
            else -> ReviewsFragment()
        }
    }
}

