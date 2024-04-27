package com.example.gearswap.ui.myProfile.reviews

import ReviewAdapter
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.gearswap.R

class ReviewsFragment : Fragment() {

    private lateinit var reviewRecyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_reviews, container, false)

        reviewRecyclerView = view.findViewById(R.id.reviewRecyclerView)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val reviews = getReviews()  // Replace with  logic to get reviews

        val layoutManager = LinearLayoutManager(context)
        reviewRecyclerView.layoutManager = layoutManager

        val reviewAdapter = ReviewAdapter(reviews)
        reviewRecyclerView.adapter = reviewAdapter
    }

    private fun getReviews(): List<Review> {
        // This is a placeholder for logic to get reviews here
        val reviewList = mutableListOf<Review>()
        // sample reviews
        reviewList.add(
            Review(
                "John Doe",
                4.5f,
                "Great product! Easy to use and works well.",
                "https://example.com/profile_picture.jpg"
            )
        )
        reviewList.add(
            Review(
                "Lebron James",
                2.5f,
                "Gear was ok",
                "https://example.com/profile_picture.jpg"
            )
        )

        reviewList.add(
            Review(
                "Tom Brady",
                4.5f,
                "Won the superbowl with the football I got from Mr. Sportsman.",
                "https://example.com/profile_picture.jpg"
            )
        )

        reviewList.add(
            Review(
                "J.Brunson",
                5.0f,
                "Got my sneakers from this guy. Im winning",
                "https://example.com/profile_picture.jpg"
            )
        )
        return reviewList
    }
}