package com.example.sushi_project

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import android.widget.Button

class HomeFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        val button = view.findViewById<Button>(R.id.button)
        button.setOnClickListener {
            val foodFragment = FoodFragment()
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, foodFragment)
                .addToBackStack(null)
                .commit()
        }

        return view
    }
}