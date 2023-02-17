package com.esardo.p3_navigation_splashscreen

import android.app.Activity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.esardo.p3_navigation_splashscreen.databinding.FragmentContactBinding


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [ContactFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ContactFragment : Fragment() {

    private lateinit var _binding: FragmentContactBinding

    private val binding get() = _binding!!

    var activity: Activity? = getActivity()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentContactBinding.inflate(inflater, container, false)
        val message = binding.etMessage
        val name = binding.etName
        val mail = binding.etMail
        /*When the user clicks the Send button the edit text fields will clear and show a Toast message,
        but only if e-mail and text message are filled (simulating that if you send a message
        with a real app, they need at least that information to write you back*/
        binding.btnSend.setOnClickListener(){
            if(message.text.toString() != "" && mail.text.toString() != ""){
                Toast.makeText(getActivity(),"Message sended",Toast.LENGTH_SHORT).show();
                name.text.clear()
                mail.text.clear()
                message.text.clear()
            }

        }
        return binding.root
    }
}