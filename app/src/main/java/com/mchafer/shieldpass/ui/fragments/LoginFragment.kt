package com.mchafer.shieldpass.ui.fragments

import android.os.Bundle
import android.renderscript.ScriptGroup.Binding
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.mchafer.shieldpass.MainActivity
import com.mchafer.shieldpass.R
import com.mchafer.shieldpass.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {

    // Binding
    private lateinit var binding: FragmentLoginBinding;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentLoginBinding.inflate(layoutInflater)

        // Listeners
        binding.loginBtnLogin.setOnClickListener {
            findNavController().navigate(R.id.action_loginFragment_to_listaPasswordFragment)
        }

        return binding.root;
    }
}