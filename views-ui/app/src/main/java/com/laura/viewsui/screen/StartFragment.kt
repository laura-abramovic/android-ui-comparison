package com.laura.viewsui.screen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.laura.viewsui.R
import com.laura.viewsui.databinding.FragmentStartBinding

class StartFragment: Fragment() {

    companion object {
        const val TAG = "StartFragment"
    }

    private lateinit var binding: FragmentStartBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentStartBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.apply {
            updateTitle("")

            greetingsButton.setOnClickListener {
                updateTitle(input.text.toString())
            }
        }
    }

    private fun FragmentStartBinding.updateTitle(name: String) {
        greetingsTitle.text = getString(
            R.string.hello_user,
            name.ifBlank { getString(R.string.user) }
        )
    }
}