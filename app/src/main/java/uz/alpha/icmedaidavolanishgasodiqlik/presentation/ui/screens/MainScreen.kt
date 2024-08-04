package uz.alpha.icmedaidavolanishgasodiqlik.presentation.ui.screens

import android.os.Bundle
import android.view.View
import android.widget.ScrollView
import android.widget.Toast
import androidx.activity.addCallback
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import by.kirich1409.viewbindingdelegate.viewBinding
import com.google.android.material.radiobutton.MaterialRadioButton
import com.tapadoo.alerter.Alerter
import uz.alpha.icmedaidavolanishgasodiqlik.R
import uz.alpha.icmedaidavolanishgasodiqlik.data.ScoreData
import uz.alpha.icmedaidavolanishgasodiqlik.data.TestData
import uz.alpha.icmedaidavolanishgasodiqlik.databinding.ScreenMainBinding
import uz.alpha.icmedaidavolanishgasodiqlik.presentation.viewmodel.impl.MainViewModelImpl
import uz.alpha.icmedaidavolanishgasodiqlik.utils.Extension

class MainScreen : Fragment(R.layout.screen_main) {

    var score = 0
    var selectedAnswer = -1
    var index = 0
    var ball : Float =0f
    var ball1 : Float =0f
    var ball2 : Float =0f
    var ball3 : Float =0f
    var isChecked:Boolean =false

    private val radioButtons: ArrayList<MaterialRadioButton> = ArrayList()
    private val binding by viewBinding(ScreenMainBinding::bind)
    private val viewModel by viewModels<MainViewModelImpl>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initData()


        requireActivity().onBackPressedDispatcher.addCallback(this) {
//            val dialog= CustomDialog()
//            dialog.show(childFragmentManager,"")
//            dialog.setListener {
//                findNavController().navigate(QuestionsScreenDirections.actionQuestionsScreenToMainScreen())
//            }
            findNavController().navigateUp()
        }

        viewModel.newQuestionLiveData.observe(viewLifecycleOwner , newQuestionObserver)
        viewModel.isFinishLiveData.observe(viewLifecycleOwner , isFinishObserver)
        viewModel.newTest(0)

        binding.btnBack.setOnClickListener{
            findNavController().navigateUp()
//            val dialog= CustomDialog()
//            dialog.show(childFragmentManager,"")
//            dialog.setListener {
//                findNavController().navigate(QuestionsScreenDirections.actionQuestionsScreenToMainScreen())
//            }
        }


    }


    fun initData(){
        radioButtons.add(binding.radioA)
        radioButtons.add(binding.radioB)
        radioButtons.add(binding.radioC)
        radioButtons.add(binding.radioD)
        radioButtons.add(binding.radioE)


        radioButtons[0].setOnClickListener {
            isChecked=true
            clearAllCheck()
            trueCheck(0)
            index=0

        }


        radioButtons[1].setOnClickListener {
            isChecked=true
            clearAllCheck()
            trueCheck(1)
            index=1
        }


        radioButtons[2].setOnClickListener {
            isChecked=true
            clearAllCheck()
            trueCheck(2)
            index=2
        }


        radioButtons[3].setOnClickListener {
            isChecked=true
            clearAllCheck()
            trueCheck(3)
            index=3
        }


        radioButtons[4].setOnClickListener {
            isChecked=true
            clearAllCheck()
            trueCheck(4)
            index=4
        }



        binding.btnNext.setOnClickListener {
            if(isChecked) {
                score++
                if (score>=1 && score<=7){//7
                    when(index){
                        0->{
                            ball1+=1
                        }
                        1->{
                            ball1+=2f
                        }
                        2->{
                            ball1+=3f
                        }
                        3->{
                            ball1+=4f
                        }
                        4->{
                            ball1+=5f
                        }
                    }
                    ball=ball1
                }
                if (score>=8 && score<=14){//14
                    when(index){
                        0->{
                            ball2+=1
                        }
                        1->{
                            ball2+=2f
                        }
                        2->{
                            ball2+=3f
                        }
                        3->{
                            ball2+=4f
                        }
                        4->{
                            ball2+=5f
                        }
                    }
                    ball=ball2
                }
                if (score>=15 && score<=21){//35
                    when(index){
                        0->{
                            ball3+=1
                        }
                        1->{
                            ball3+=2f
                        }
                        2->{
                            ball3+=3f
                        }
                        3->{
                            ball3+=4f
                        }
                        4->{
                            ball3+=5f
                        }
                    }
                    ball=ball3
                }
                viewModel.newTest(score)
                //
            }
            else {
                Alerter.create(requireActivity())
                    .setText("Iltimos o`zingizga mos javobni belgilang !")
                    .show()
            }
            isChecked=false
            //binding.nested.fullScroll(ScrollView.FOCUS_UP);
        }

        binding.btnBehind.setOnClickListener {
            if(score!=0) {
                score--
                if (score>=1 && score<=7){//7
                    when(index){
                        0->{
                            ball1-=1
                        }
                        1->{
                            ball1-=2f
                        }
                        2->{
                            ball1-=3f
                        }
                        3->{
                            ball1-=4f
                        }
                        4->{
                            ball1-=5f
                        }
                    }
                    ball=ball1
                }
                if (score>=8 && score<=14){//14
                    when(index){
                        0->{
                            ball2-=1
                        }
                        1->{
                            ball2-=2f
                        }
                        2->{
                            ball2-=3f
                        }
                        3->{
                            ball2-=4f
                        }
                        4->{
                            ball2-=5f
                        }
                    }
                    ball=ball2
                }
                if (score>=15 && score<=21){//35
                    when(index){
                        0->{
                            ball3-=1
                        }
                        1->{
                            ball3-=2f
                        }
                        2->{
                            ball3-=3f
                        }
                        3->{
                            ball3-=4f
                        }
                        4->{
                            ball3-=5f
                        }
                    }
                    ball=ball3
                }
                viewModel.newTest(score)
            }
            else {
                Alerter.create(requireActivity())
                    .setText("Siz eng birinchi savoldasiz !")
                    .show()
            }
            //binding.nested.fullScroll(ScrollView.FOCUS_UP);
        }

    }

    fun loadQuestion(testData: TestData) {
        binding.txtQuestion.setText(testData.question)
        radioButtons!![0].setText(testData.variant1)
        radioButtons[1].setText(testData.variant2)
        radioButtons[2].setText(testData.variant3)
        radioButtons[3].setText(testData.variant4)
        radioButtons[4].setText(testData.variant5)

        binding.txtCount.text=(score+1).toString()+"/21"

        if (score>=6 && score<=13){
            binding.txtCount.setBackgroundResource(R.drawable.shapeemotsional)
        }

        if (score>=14){
            binding.txtCount.setBackgroundResource(R.drawable.shapexulq)
        }

        initData()
    }

    fun trueCheck(position: Int) {
        radioButtons!![position].isChecked = true
    }




    fun clearAllCheck(){
        radioButtons[0].isChecked=false
        radioButtons[1].isChecked=false
        radioButtons[2].isChecked=false
        radioButtons[3].isChecked=false
        radioButtons[4].isChecked=false
    }

    private  val newQuestionObserver = Observer<TestData>{
        clearAllCheck()
        loadQuestion(it)
    }

    private  val isFinishObserver = Observer<Boolean>{
        if(it){
          //  Toast.makeText(requireContext(), "$ball", Toast.LENGTH_SHORT).show()
         //   findNavController().navigate(QuestionsScreenDirections.actionQuestionsScreenToScoreScreen(ball))
            Extension.ball=ball
            Extension.ball1=ball1
            Extension.ball2=ball2
            Extension.ball3=ball3
            findNavController().navigate(MainScreenDirections.actionMainScreenToScoreScreen())
        }
    }



}