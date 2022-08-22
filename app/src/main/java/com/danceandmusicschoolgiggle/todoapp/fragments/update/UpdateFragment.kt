package com.danceandmusicschoolgiggle.todoapp.fragments.update

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import com.danceandmusicschoolgiggle.todoapp.R
import com.danceandmusicschoolgiggle.todoapp.databinding.FragmentUpdateBinding


class UpdateFragment : Fragment() {
private lateinit var binding: FragmentUpdateBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_update,container,false)
        setHasOptionsMenu(true)
        return binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.update_fragment_menu,menu)
    }
}