package com.example.gearswap.ui.addListing

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
import androidx.fragment.app.Fragment
import com.example.gearswap.databinding.FragmentAddListingBinding

class AddListingFragment : Fragment() {

    private var _binding: FragmentAddListingBinding? = null
    val REQUEST_IMAGE_CAPTURE = 100
    val REQUEST_GALLERY_IMAGE = 110
    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        _binding = FragmentAddListingBinding.inflate(inflater, container, false)
        val root: View = binding.root
        binding.imageViewAddPhoto.setOnClickListener {
            showImagePickerOptions()
        }
        return root
    }
    //TODO: Declare camera and storage permissions in manifest
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
            }.show()
    }
//fixme: This relies on deprecated methods refactor with new methods
    private fun takePhoto() {
        val takePictureIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
        try {

            startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE)
        } catch (e: ActivityNotFoundException) {
            Toast.makeText(requireContext(), "No camera app found", Toast.LENGTH_SHORT).show()
        }
    }

    private fun chooseFromGallery() {
        val intent = Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI)

        startActivityForResult(intent, REQUEST_GALLERY_IMAGE)
    }

    @Deprecated("Deprecated in Java")
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (resultCode == Activity.RESULT_OK) {
            when (requestCode) {
                REQUEST_IMAGE_CAPTURE -> {
                    val imageBitmap = data?.extras?.get("data") as Bitmap
                    binding.imageViewAddPhoto.setImageBitmap(imageBitmap)
                }
                REQUEST_GALLERY_IMAGE -> {
                    val imageUri = data?.data
                    binding.imageViewAddPhoto.setImageURI(imageUri)
                }
            }
        }
    }



    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}