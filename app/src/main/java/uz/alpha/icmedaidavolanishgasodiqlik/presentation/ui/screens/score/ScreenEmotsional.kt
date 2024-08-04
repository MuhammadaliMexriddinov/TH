package uz.alpha.icmedaidavolanishgasodiqlik.presentation.ui.screens.score

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import uz.alpha.icmedaidavolanishgasodiqlik.R
import uz.alpha.icmedaidavolanishgasodiqlik.databinding.ScreenEmotsionalBinding
import uz.alpha.icmedaidavolanishgasodiqlik.databinding.ScreenKognitivBinding

class ScreenEmotsional:Fragment(R.layout.screen_emotsional) {

    private  val binding by viewBinding(ScreenEmotsionalBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnBack.setOnClickListener {
            findNavController().navigateUp()
        }
    }
}