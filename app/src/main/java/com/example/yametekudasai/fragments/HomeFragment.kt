package com.example.yametekudasai.fragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.yametekudasai.R

class HomeFragment: Fragment(R.layout.fragment_home) {
    private lateinit var username: EditText

    private lateinit var button: Button
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        username = view.findViewById(R.id.user)
        button = view.findViewById(R.id.butt)
        button.setOnClickListener {
            val name = username.text.toString()
            val action = HomeFragmentDirections.actionHomeFragmentToProfileFragment(name)
            findNavController().navigate(action)
        }

    }
}