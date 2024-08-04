package uz.alpha.icmedaidavolanishgasodiqlik.presentation.ui.screens

import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.activity.addCallback
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import by.kirich1409.viewbindingdelegate.viewBinding
import uz.alpha.icmedaidavolanishgasodiqlik.R
import uz.alpha.icmedaidavolanishgasodiqlik.databinding.ScreenScoreBinding
import uz.alpha.icmedaidavolanishgasodiqlik.utils.Extension

class ScoreScreen:Fragment(R.layout.screen_score) {

   // private val args: ScoreScreenArgs by navArgs()
    private  val binding by viewBinding(ScreenScoreBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

      //  val score= args.scoreData
        requireActivity().onBackPressedDispatcher.addCallback(this){
            findNavController().navigate(ScoreScreenDirections.actionScoreScreenToStartScreen())
        }

//
//        binding.scoreAll.text=score.allBalls.toString()
//        binding.scoreBall1.text=score.ball1.toString()
//        binding.scoreBall2.text=score.ball2.toString()
//        binding.scoreBall3.text=score.ball3.toString()

        var allBallsTest=Extension.ball1+Extension.ball2+Extension.ball3
        var ball1=Extension.ball1
        var ball2=Extension.ball2
        var ball3=Extension.ball3

        binding.scoreAll.text= "Balingiz: $allBallsTest"
        binding.scoreBall1.text=ball1.toString()+"ball"
        binding.scoreBall2.text=ball2.toString()+"ball"
        binding.scoreBall3.text=ball3.toString()+"ball"

        if (allBallsTest>=0 && allBallsTest<=54){
            binding.txtNatijaviy.text="Davolanishga sodiqlikning umumiy ko`rsatkichi - $allBallsTest"
            binding.txtNatijaviy.setTextColor(Color.parseColor("#73BF19"))
        }
        if (allBallsTest>=55){
            binding.txtNatijaviy.text="Davolanishga sodiqlikning umumiy ko`rsatkichi - $allBallsTest"
            binding.txtNatijaviy.setTextColor(Color.parseColor("#B11818"))
        }

        binding.btnH.setOnClickListener {
            findNavController().navigate(ScoreScreenDirections.actionScoreScreenToStartScreen())
        }

        binding.btnA.setOnClickListener {
            findNavController().navigate(ScoreScreenDirections.actionScoreScreenToAboutScreen())
        }

        binding.btnE.setOnClickListener {
            requireActivity().finish()
        }

        binding.btnK.setOnClickListener {
            findNavController().navigate(ScoreScreenDirections.actionScoreScreenToScoreKognitiv())
        }

        binding.btnEmotsional.setOnClickListener {
            findNavController().navigate(ScoreScreenDirections.actionScoreScreenToScreenEmotsional())
        }

        binding.btnX.setOnClickListener {
            findNavController().navigate(ScoreScreenDirections.actionScoreScreenToScreenX())
        }

        binding.sc.setOnClickListener {
            findNavController().navigate(ScoreScreenDirections.actionScoreScreenToScoreAll())
        }


        binding.txtNatijaviy.setOnClickListener {
            findNavController().navigate(ScoreScreenDirections.actionScoreScreenToScoreAll())
        }



    }

}