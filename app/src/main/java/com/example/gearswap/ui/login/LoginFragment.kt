package com.example.gearswap.ui.login

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.EditorInfo
import android.widget.Toast
import androidx.annotation.StringRes
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.gearswap.R
import com.example.gearswap.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {

    private lateinit var loginViewModel: LoginViewModel
    private var _binding: FragmentLoginBinding? = null

    // This property is only valid between onCreateView and onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        _binding = FragmentLoginBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loginViewModel = ViewModelProvider(this, LoginViewModelFactory())
            .get(LoginViewModel::class.java)

        setupObservers()
        setupTextWatchers()
        setupLoginButtons()
    }

    private fun setupObservers() {
        loginViewModel.loginFormState.observe(viewLifecycleOwner, Observer { loginFormState ->
            loginFormState ?: return@Observer
            binding.login.isEnabled = loginFormState.isDataValid
            if (loginFormState.usernameError != null) {
                binding.username.error = getString(loginFormState.usernameError)
            }
            if (loginFormState.passwordError != null) {
                binding.password.error = getString(loginFormState.passwordError)
            }
        })

        loginViewModel.loginResult.observe(viewLifecycleOwner, Observer { loginResult ->
            loginResult ?: return@Observer
            binding.loading.visibility = View.GONE
            if (loginResult.error != null) {
                showLoginFailed(loginResult.error)
            }
            if (loginResult.success != null) {
                updateUiWithUser(loginResult.success)
            }
        })
    }

    private fun setupTextWatchers() {
        val afterTextChangedListener = object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {
                // ignore
            }
            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
                // ignore
            }
            override fun afterTextChanged(s: Editable) {
                loginViewModel.loginDataChanged(
                    binding.username.text.toString(),
                    binding.password.text.toString()
                )
            }
        }
        binding.username.addTextChangedListener(afterTextChangedListener)
        binding.password.addTextChangedListener(afterTextChangedListener)
        binding.password.setOnEditorActionListener { _, actionId, _ ->
            if (actionId == EditorInfo.IME_ACTION_DONE) {
                loginViewModel.login(
                    binding.username.text.toString(),
                    binding.password.text.toString()
                )
            }
            false
        }
    }

    private fun setupLoginButtons() {
        binding.login.setOnClickListener {
            binding.loading.visibility = View.VISIBLE
            loginViewModel.login(
                binding.username.text.toString(),
                binding.password.text.toString()
            )
        }

        // Click listeners for social login buttons
        binding.loginButtonFacebook.setOnClickListener {
            // TODO: Handle Facebook login logic here
            Toast.makeText(context, "Facebook login clicked", Toast.LENGTH_SHORT).show()
        }

        binding.loginButtonGoogle.setOnClickListener {
            // TODO: Handle Google login logic here
            Toast.makeText(context, "Google login clicked", Toast.LENGTH_SHORT).show()
        }

        binding.loginButtonApple.setOnClickListener {
            // TODO: Handle Apple login logic here
            Toast.makeText(context, "Apple login clicked", Toast.LENGTH_SHORT).show()
        }

        binding.guestLogin.setOnClickListener {
            findNavController().navigate(R.id.login_to_homescreen)
        }
    }

    private fun updateUiWithUser(model: LoggedInUserView) {
        val welcome = getString(R.string.welcome) + model.displayName
        // TODO : initiate successful logged in experience
        Toast.makeText(context?.applicationContext, welcome, Toast.LENGTH_LONG).show()
        findNavController().navigate(R.id.login_to_homescreen)
    }

    private fun showLoginFailed(@StringRes errorString: Int) {
        Toast.makeText(context?.applicationContext, errorString, Toast.LENGTH_LONG).show()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
