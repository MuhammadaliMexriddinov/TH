package uz.alpha.icmedaidavolanishgasodiqlik.presentation.ui.screens

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import kotlinx.coroutines.delay
import uz.alpha.icmedaidavolanishgasodiqlik.R
import uz.alpha.icmedaidavolanishgasodiqlik.databinding.ScreenSlplashBinding

class SplashScreen:Fragment(R.layout.screen_slplash) {


    private  val binding by viewBinding(ScreenSlplashBinding::bind)


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        lifecycleScope.launchWhenCreated {
            delay(2000)
            findNavController().navigate(SplashScreenDirections.actionSplashScreenToStartScreen())
        }

    }

}