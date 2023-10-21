package com.example.peterivansfarm

import android.app.AlertDialog
import android.os.Bundle
import android.os.Message
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.peterivansfarm.databinding.FragmentLoginBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [Login.newInstance] factory method to
 * create an instance of this fragment.
 */
class Login : Fragment() {

    var _binding : FragmentLoginBinding? = null
    val binding get() = _binding !!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentLoginBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        with(binding){
           signin.setOnClickListener{
               when {
                   editTextPhone.text.isEmpty() -> {
                       showDialogue(title = "invalid", "enter phone number")
                   }
                   editTextTextPassword.text.isEmpty() -> {
                       showDialogue(title = "invalid", "enter password")
                   }
                   else -> {}

               }
           }
        }

    }

    fun showDialogue (title:String, message: String) {
        val alert = androidx.appcompat.app.AlertDialog.Builder(requireContext()).setTitle(title).setMessage(message)
        alert.create()
        alert.show()
    }

    override fun onDestroyView() {
        super.onDestroyView()

        _binding = null
    }



}