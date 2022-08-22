package com.danceandmusicschoolgiggle.todoapp.fragments.add

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import com.danceandmusicschoolgiggle.todoapp.R
import com.danceandmusicschoolgiggle.todoapp.databinding.FragmentAddBinding


class AddFragment : Fragment() {

private lateinit var binding: FragmentAddBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View {
        // Inflate the layout for this fragment
       // binding = DataBindingUtil.inflate(inflater, R.layout.fragment_add, container, false)
       binding = FragmentAddBinding.inflate(inflater,container,false)
        setHasOptionsMenu(true)
        return binding.root
    }


    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.add_fragment_menu,menu)
    }

}