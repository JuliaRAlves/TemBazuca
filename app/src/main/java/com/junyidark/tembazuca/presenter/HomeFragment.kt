package com.junyidark.tembazuca.presenter

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import com.junyidark.tembazuca.core.enums.Language
import com.junyidark.tembazuca.data.api.Api
import com.junyidark.tembazuca.data.model.MovieTitleModel
import com.junyidark.tembazuca.databinding.HomeFragmentBinding
import kotlinx.coroutines.launch
import kotlin.coroutines.coroutineContext

class HomeFragment : Fragment() {

    private var _binding: HomeFragmentBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = HomeFragmentBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()

        _binding = null
    }
}