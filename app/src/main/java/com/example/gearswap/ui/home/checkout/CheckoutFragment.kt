package com.example.gearswap.ui.home.checkout

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.android.volley.Request
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.Volley
import com.example.gearswap.R
import com.example.gearswap.databinding.FragmentCheckoutBinding
import com.stripe.android.PaymentConfiguration
import com.stripe.android.paymentsheet.PaymentSheet
import com.stripe.android.paymentsheet.PaymentSheetResult

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [CheckoutFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class CheckoutFragment : Fragment() {
    private lateinit var paymentSheet: PaymentSheet
    private var paymentIntentClientSecret: String? = null

    private var _binding: FragmentCheckoutBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentCheckoutBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



            paymentSheet = PaymentSheet(this) { result ->
                onPaymentSheetResult(result)
            }


        setupPaymentConfiguration()
//        simulateFetchPaymentIntent()
fetchPaymentIntentClientSecret()

        binding.button.setOnClickListener {
            paymentIntentClientSecret?.let { secret ->
                presentPaymentSheet(secret)
            }
        }
    }

    private fun setupPaymentConfiguration() {
        PaymentConfiguration.init(requireContext(), "pk_test_TYooMQauvdEDq54NiTphI7jx")
    }

    private fun simulateFetchPaymentIntent() {
        // This is where you'd fetch from your server in a real scenario
        // Simulating a fetch with a hardcoded client secret from a test PaymentIntent
        paymentIntentClientSecret = "pi_3PA6oi2eZvKYlo2C1eXf5Iil_secret_3fzEz7fl6PkEq7TGqYHnCihxq"

    }

    private fun fetchPaymentIntentClientSecret() {
        // This is a placeholder URL for demonstration purposes only.
        // Replace with the URL of your server where you're creating the PaymentIntent.
        //TODO: Replace with your own server URL
        val url = "https://tidy-rectangular-coat.glitch.me/checkout"

        val request = JsonObjectRequest(
            Request.Method.POST, url, null,
            { response ->
                // The response from the server includes the client secret
                paymentIntentClientSecret = response.getString("paymentIntent")
            },
            { error ->
                // Handle the error
                Log.d("PaymentSheet" ,"Error: ${error.message}")
                Toast.makeText(requireContext(), "Error: ${error.message}", Toast.LENGTH_SHORT).show()
            }
        )

        // Add the request to the RequestQueue.
        Volley.newRequestQueue(requireContext()).add(request)
    }


    private fun presentPaymentSheet(clientSecret: String) {
        val configuration = PaymentSheet.Configuration(
            merchantDisplayName = "Demo Store"
            // Add additional configuration as needed
        )
        paymentSheet.presentWithPaymentIntent(clientSecret, configuration)
    }

    private fun onPaymentSheetResult(result: PaymentSheetResult) {
        when (result) {
            is PaymentSheetResult.Completed -> {
                Log.d("PaymentSheet", "Payment completed successfully.")
                findNavController().navigate(R.id.show_confirmation)
            }
            is PaymentSheetResult.Canceled -> {
                Log.d("PaymentSheet", "Payment was canceled.")
                Toast.makeText(requireContext(), "Payment was canceled.", Toast.LENGTH_SHORT).show()
            }
            is PaymentSheetResult.Failed -> {
                Log.e("PaymentSheet", "Payment failed with exception: ${result.error?.message}")
                Toast.makeText(requireContext(), "Payment failed with exception: ${result.error?.message}", Toast.LENGTH_SHORT).show()
            }
        }
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment CheckoutFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            CheckoutFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}