package com.example.gearswap.ui.myProfile

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.gearswap.ui.myProfile.Account.AccountFragment
import com.example.gearswap.ui.myProfile.reviews.ReviewsFragment
import com.example.gearswap.ui.myProfile.saved.SavedItemsListFragment
import com.example.gearswap.ui.myProfile.orders.OrdersFragment

class ViewPagerAdapter(fragment: Fragment) : FragmentStateAdapter(fragment) {

    override fun getItemCount(): Int = 3 //4

    override fun createFragment(position: Int): Fragment {
        return when (position) {
//          TODO: Add additional fragments
            0 -> AccountFragment()
            1 -> SavedItemsListFragment()
            else -> OrdersFragment()
//            else -> ReviewsFragment()
        }
    }
}

