package com.kemalurekli.cleannews.ui.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kemalurekli.cleannews.R
import com.kemalurekli.cleannews.databinding.FragmentDetailsPageBinding
import com.kemalurekli.cleannews.databinding.FragmentSavedNewsBinding

class DetailsPageFragment : Fragment() {
    private var _binding: FragmentDetailsPageBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentDetailsPageBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}