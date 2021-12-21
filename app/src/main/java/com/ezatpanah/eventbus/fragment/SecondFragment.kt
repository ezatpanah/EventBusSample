package com.ezatpanah.eventbus.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.ezatpanah.eventbus.EvenetCheckClick
import com.ezatpanah.eventbus.databinding.FragmentSecondBinding
import org.greenrobot.eventbus.EventBus


class SecondFragment : Fragment() {

    private lateinit var binding: FragmentSecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.bntSubmt.setOnClickListener {
            EventBus.getDefault().post(EvenetCheckClick(true))
            Toast.makeText(requireContext(), "send true through the EventBus", Toast.LENGTH_SHORT)
                .show()
        }
    }

}