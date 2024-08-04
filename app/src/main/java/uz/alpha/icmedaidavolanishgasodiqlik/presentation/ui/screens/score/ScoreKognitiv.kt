package uz.alpha.icmedaidavolanishgasodiqlik.presentation.ui.screens.score

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import uz.alpha.icmedaidavolanishgasodiqlik.R
import uz.alpha.icmedaidavolanishgasodiqlik.databinding.ScreenKognitivBinding

class ScoreKognitiv:Fragment(R.layout.screen_kognitiv) {

    private  val binding by viewBinding(ScreenKognitivBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnBack.setOnClickListener {
            findNavController().navigateUp()
        }
    }
}