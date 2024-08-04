package uz.alpha.icmedaidavolanishgasodiqlik.presentation.viewmodel.impl

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import uz.alpha.icmedaidavolanishgasodiqlik.data.TestData
import uz.alpha.icmedaidavolanishgasodiqlik.domain.repository.impl.TestRepositoryImpl
import uz.alpha.icmedaidavolanishgasodiqlik.presentation.viewmodel.MainViewModel

class MainViewModelImpl: MainViewModel ,ViewModel() {

    private val data = TestRepositoryImpl()

    override val newQuestionLiveData = MutableLiveData<TestData>()

    override val messageLiveData = MutableLiveData<String>()

    override val isFinishLiveData = MutableLiveData<Boolean>()


    override fun newTest(index: Int) {
        if (index >= data.totalCount()) {
            isFinishLiveData.value = true
        }
        else  newQuestionLiveData.value = data.getQuestion(index)
    }

}