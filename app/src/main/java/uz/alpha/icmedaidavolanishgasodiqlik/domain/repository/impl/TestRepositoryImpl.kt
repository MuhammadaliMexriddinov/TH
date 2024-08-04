package uz.alpha.icmedaidavolanishgasodiqlik.domain.repository.impl

import uz.alpha.icmedaidavolanishgasodiqlik.R
import uz.alpha.icmedaidavolanishgasodiqlik.data.TestData
import uz.alpha.icmedaidavolanishgasodiqlik.domain.repository.TestRepository
import java.util.*
import kotlin.collections.ArrayList

class TestRepositoryImpl : TestRepository {

    private var questions: List<TestData>? = null

    override fun initQuestions() {
        questions = ArrayList()

        (questions as ArrayList<TestData>).add(
            TestData(
                1,
                R.string.test1,
                R.string.variant1_1,
                R.string.variant1_2,
                R.string.variant1_3,
                R.string.variant1_4,
                R.string.variant1_5,
            )
        )

        (questions as ArrayList<TestData>).add(
            TestData(
                2,
                R.string.test2,
                R.string.variant2_1,
                R.string.variant2_2,
                R.string.variant2_3,
                R.string.variant2_4,
                R.string.variant2_5,
            )
        )

        (questions as ArrayList<TestData>).add(
            TestData(
                3,
                R.string.test3,
                R.string.variant3_1,
                R.string.variant3_2,
                R.string.variant3_3,
                R.string.variant3_4,
                R.string.variant3_5,
            )
        )

        (questions as ArrayList<TestData>).add(
            TestData(
                4,
                R.string.test4,
                R.string.variant4_1,
                R.string.variant4_2,
                R.string.variant4_3,
                R.string.variant4_4,
                R.string.variant4_5,
            )
        )

        (questions as ArrayList<TestData>).add(
            TestData(
                5,
                R.string.test5,
                R.string.variant5_1,
                R.string.variant5_2,
                R.string.variant5_3,
                R.string.variant5_4,
                R.string.variant5_5,
            )
        )

        (questions as ArrayList<TestData>).add(
            TestData(
                6,
                R.string.test6,
                R.string.variant6_1,
                R.string.variant6_2,
                R.string.variant6_3,
                R.string.variant6_4,
                R.string.variant6_5,
            )
        )

        (questions as ArrayList<TestData>).add(
            TestData(
                7,
                R.string.test7,
                R.string.variant7_1,
                R.string.variant7_2,
                R.string.variant7_3,
                R.string.variant7_4,
                R.string.variant7_5,
            )
        )

        (questions as ArrayList<TestData>).add(
            TestData(
                8,
                R.string.test8,
                R.string.variant8_1,
                R.string.variant8_2,
                R.string.variant8_3,
                R.string.variant8_4,
                R.string.variant8_5,
            )
        )

        (questions as ArrayList<TestData>).add(
            TestData(
                9,
                R.string.test9,
                R.string.variant9_1,
                R.string.variant9_2,
                R.string.variant9_3,
                R.string.variant9_4,
                R.string.variant9_5,
            )
        )

        (questions as ArrayList<TestData>).add(
            TestData(
                10,
                R.string.test1,
                R.string.variant10_1,
                R.string.variant10_2,
                R.string.variant10_3,
                R.string.variant10_4,
                R.string.variant10_5,
            )
        )

        (questions as ArrayList<TestData>).add(
            TestData(
                11,
                R.string.test11,
                R.string.variant11_1,
                R.string.variant11_2,
                R.string.variant11_3,
                R.string.variant11_4,
                R.string.variant11_5,
            )
        )

        (questions as ArrayList<TestData>).add(
            TestData(
                12,
                R.string.test12,
                R.string.variant12_1,
                R.string.variant12_2,
                R.string.variant12_3,
                R.string.variant12_4,
                R.string.variant12_5,
            )
        )

        (questions as ArrayList<TestData>).add(
            TestData(
                13,
                R.string.test13,
                R.string.variant13_1,
                R.string.variant13_2,
                R.string.variant13_3,
                R.string.variant13_4,
                R.string.variant13_5,
            )
        )

        (questions as ArrayList<TestData>).add(
            TestData(
                14,
                R.string.test14,
                R.string.variant14_1,
                R.string.variant14_2,
                R.string.variant14_3,
                R.string.variant14_4,
                R.string.variant14_5,
            )
        )

        (questions as ArrayList<TestData>).add(
            TestData(
                15,
                R.string.test5,
                R.string.variant15_1,
                R.string.variant15_2,
                R.string.variant15_3,
                R.string.variant15_4,
                R.string.variant15_5,
            )
        )

        (questions as ArrayList<TestData>).add(
            TestData(
                16,
                R.string.test16,
                R.string.variant16_1,
                R.string.variant16_2,
                R.string.variant16_3,
                R.string.variant16_4,
                R.string.variant16_5,
            )
        )
        (questions as ArrayList<TestData>).add(
            TestData(
                17,
                R.string.test17,
                R.string.variant17_1,
                R.string.variant17_2,
                R.string.variant17_3,
                R.string.variant17_4,
                R.string.variant17_5,
            )
        )

        (questions as ArrayList<TestData>).add(
            TestData(
                18,
                R.string.test18,
                R.string.variant18_1,
                R.string.variant18_2,
                R.string.variant18_3,
                R.string.variant18_4,
                R.string.variant18_5,
            )
        )
        (questions as ArrayList<TestData>).add(
            TestData(
                19,
                R.string.test19,
                R.string.variant19_1,
                R.string.variant19_2,
                R.string.variant19_3,
                R.string.variant19_4,
                R.string.variant19_5,
            )
        )

        (questions as ArrayList<TestData>).add(
            TestData(
                20,
                R.string.test20,
                R.string.variant20_1,
                R.string.variant20_2,
                R.string.variant20_3,
                R.string.variant20_4,
                R.string.variant20_5,
            )
        )

        (questions as ArrayList<TestData>).add(
            TestData(
                21,
                R.string.test21,
                R.string.variant21_1,
                R.string.variant21_2,
                R.string.variant21_3,
                R.string.variant21_4,
                R.string.variant21_5,
            )
        )




    }

    init {
        initQuestions()
    }

    override fun getQuestion(index: Int): TestData {
        return questions!![index]
    }

    override fun getAllTestRepo(): List<TestData> {
        return  questions as ArrayList<TestData>
    }


    override fun totalCount(): Int {
        return questions!!.size
    }

}