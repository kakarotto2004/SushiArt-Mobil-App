package com.example.sushi_project

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class ContactFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_contact, container, false)

        val button = view.findViewById<Button>(R.id.button_to_map)
        button.setOnClickListener {
            val intent = Intent(requireContext(), MapActivity::class.java)
            requireContext().startActivity(intent)
        }

        return view
    }
}