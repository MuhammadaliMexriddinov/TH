package uz.alpha.icmedaidavolanishgasodiqlik.domain.repository

import uz.alpha.icmedaidavolanishgasodiqlik.data.TestData

interface TestRepository {
    fun initQuestions()
    fun getQuestion(index: Int): TestData
    fun getAllTestRepo():List<TestData>
    fun totalCount(): Int
}