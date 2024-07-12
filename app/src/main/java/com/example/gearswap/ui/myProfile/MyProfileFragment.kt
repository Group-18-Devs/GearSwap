package com.example.gearswap.ui.myProfile

import android.app.Activity
import android.app.AlertDialog
import android.content.ActivityNotFoundException
import android.content.Intent
import android.graphics.Bitmap
import android.os.Bundle
import android.provider.MediaStore
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.gearswap.R
import com.example.gearswap.databinding.FragmentMyProfileBinding
import com.google.android.material.tabs.TabLayoutMediator

class MyProfileFragment : Fragment() {

    private var _binding: FragmentMyProfileBinding? = null
    val REQUEST_PHOTO_CAPTURE = 100
    val REQUEST_GALLERY_PHOTO = 110

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
        binding.profilePicture.setOnClickListener{showImagePickerOptions()}


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

    private fun showImagePickerOptions() {
        val items = arrayOf("Take Photo", "Choose from Gallery", "Cancel")
        AlertDialog.Builder(requireContext())
            .setTitle("Add Photo")
            .setItems(items) { dialog, which ->
                when (items[which]) {
                    "Take Photo" -> takePhoto()
                    "Choose from Gallery" -> chooseFromGallery()
                    "Cancel" -> dialog.dismiss()
                }
            }
            .show()
    }
    // fixme: This relies on deprecated methods refactor with new methods
    private fun takePhoto() {
        val takePictureIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
        try {

            startActivityForResult(takePictureIntent, REQUEST_PHOTO_CAPTURE)
        } catch (e: ActivityNotFoundException) {
            Toast.makeText(requireContext(), "No camera app found", Toast.LENGTH_SHORT).show()
        }
    }

    private fun chooseFromGallery() {
        val intent = Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI)

        startActivityForResult(intent, REQUEST_GALLERY_PHOTO)
    }

    @Deprecated("Deprecated in Java")
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (resultCode == Activity.RESULT_OK) {
            when (requestCode) {
                REQUEST_PHOTO_CAPTURE -> {
                    val imageBitmap = data?.extras?.get("data") as Bitmap
                    binding.profilePicture.setImageBitmap(imageBitmap)
                }
                REQUEST_GALLERY_PHOTO -> {
                    val imageUri = data?.data
                    binding.profilePicture.setImageURI(imageUri)
                }
            }
        }
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}