package me.arwazkhan.bookhub.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import me.arwazkhan.bookhub.R

class AboutAppFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this me.arwazkhan.bookhub.fragment
        return inflater.inflate(R.layout.fragment_about_app, container, false)
    }

}