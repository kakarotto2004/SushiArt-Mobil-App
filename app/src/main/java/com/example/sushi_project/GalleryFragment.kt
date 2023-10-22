package com.example.sushi_project

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout

class GalleryFragment : Fragment() {
    var imageView: ImageView? = null
    @SuppressLint("DiscouragedApi")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_gallery, container, false)

        val linearLayout = view.findViewById(R.id.linearLayout) as LinearLayout
        imageView = view.findViewById(R.id.imageView) as ImageView

        for (i in 1..10) {
            val localView = ImageView(activity)
            localView.layoutParams = ViewGroup.LayoutParams(200, 200)
            localView.scaleType = ImageView.ScaleType.CENTER_INSIDE
            val resID = resources.getIdentifier("sushi$i", "drawable", activity?.packageName)
            localView.setImageResource(resID)
            localView.setOnClickListener{
                imageView?.setImageDrawable(localView.drawable)
            }
            //localView.setOnClickListener(activit)
            linearLayout.addView(localView)
        }
        return view
    }
}