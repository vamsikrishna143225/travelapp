package com.example.packyourbags

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class FragmentTwo: Fragment() {
    lateinit var v:View
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?  ): View? {

        v = inflater.inflate(R.layout.fragment_two,container,false)
        return  v
    }
}