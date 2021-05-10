package com.example.test

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup



class BlankFragment : Fragment() {

    companion object{
        private const val EXTRA_KEY = "key"

        fun newInstance(key: String?): BlankFragment {
            val fragment = BlankFragment()
            val bundle = Bundle()
            bundle.putString(EXTRA_KEY, key)
            fragment.arguments = bundle
            return fragment
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank, container, false)

    }




}