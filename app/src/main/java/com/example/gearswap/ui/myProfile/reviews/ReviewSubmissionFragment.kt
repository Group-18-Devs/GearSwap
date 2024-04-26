package com.example.gearswap.ui.myProfile.reviews

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import androidx.lifecycle.ViewModel
import com.example.gearswap.R


class ReviewSubmissionFragment : Fragment() {

    private lateinit var reviewText: EditText
    private lateinit var viewModel: ReviewViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_review_submission, container, false)
        reviewText = view.findViewById(R.id.reviewText)

        return view
    }

    private fun submitReview(){
        val review = reviewText.text.toString()
    }






}