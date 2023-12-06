package com.laura.viewsui.screen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView.ItemDecoration
import androidx.recyclerview.widget.RecyclerView.Orientation
import com.laura.shared.pets.domain.MockRepo
import com.laura.viewsui.R
import com.laura.viewsui.databinding.FragmentPetsBinding

class PetsFragment : Fragment() {

    companion object {
        const val TAG = "PetsFragment"
    }

    private lateinit var binding: FragmentPetsBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentPetsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.petsList.apply {
            layoutManager = LinearLayoutManager(activity)
            adapter = PetAdapter(MockRepo.petList())
        }
    }
}