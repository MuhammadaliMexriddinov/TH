package uz.alpha.icmedaidavolanishgasodiqlik.presentation.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import uz.alpha.icmedaidavolanishgasodiqlik.data.TestData

interface MainViewModel {
    val isFinishLiveData:LiveData<Boolean>
    val  newQuestionLiveData:LiveData<TestData>
    val messageLiveData:LiveData<String>
    fun newTest(index :Int)

}