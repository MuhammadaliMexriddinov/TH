package uz.alpha.icmedaidavolanishgasodiqlik.presentation.ui.screens

import android.os.Bundle
import android.view.View
import androidx.activity.addCallback
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.tapadoo.alerter.Alerter
import uz.alpha.icmedaidavolanishgasodiqlik.R
import uz.alpha.icmedaidavolanishgasodiqlik.databinding.ScreenStartBinding

class StartScreen:Fragment(R.layout.screen_start) {


    private  val binding by viewBinding(ScreenStartBinding::bind)
    private  var isClick:Boolean=false

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if (!binding.checkbox.isChecked){
            binding.checkbox.setOnClickListener {
                binding.btnStart.setBackgroundResource(R.drawable.shape3)
//                isClick=true
            }
        }

        if(binding.checkbox.isChecked) {
            binding.btnStart.setBackgroundResource(R.drawable.shape4)
           // isClick=false
        }

        binding.btnStart.setOnClickListener {
            if (binding.checkbox.isChecked){
                binding.checkbox.isChecked=false
                findNavController().navigate(StartScreenDirections.actionStartScreenToMainScreen())
            }
            else{
                Alerter.create(requireActivity())
                    .setText("Iltimos ma`lumotlar bilan tanishib chiqing !!!")
                     .setBackgroundColorRes(R.color.purple_200)
                    .show()
            }
        }


//        if (isClick){
//            binding.btnStart.setBackgroundResource(R.drawable.shape3)
//            isClick=false
//        }
//        else{
//            binding.btnStart.setBackgroundResource(R.drawable.shape4)
//            isClick=true
//        }

        binding.btnAbout.setOnClickListener {
            binding.checkbox.isChecked=false
            findNavController().navigate(StartScreenDirections.actionStartScreenToAboutScreen())
        }

        requireActivity().onBackPressedDispatcher.addCallback(this) {
            requireActivity().finish()
        }


    }
}