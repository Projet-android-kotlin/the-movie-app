package com.gmail.eamosse.imdb.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment
import com.gmail.eamosse.imdb.R

class FirstFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_first, container, false)
        val textView: TextView = root.findViewById(R.id.app_name)
        return root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<View>(R.id.button_start).setOnClickListener {
            val action = FirstFragmentDirections
                .actionFirstFragmentToHomeFragment("From FirstFragment")
            NavHostFragment.findNavController(this@FirstFragment)
                .navigate(action)
        }
    }
}
