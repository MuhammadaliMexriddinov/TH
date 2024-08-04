//package uz.alpha.icmedaidavolanishgasodiqlik.presentation.ui.adapters
//
//import android.view.ViewGroup
//import androidx.recyclerview.widget.DiffUtil
//import androidx.recyclerview.widget.ListAdapter
//import androidx.recyclerview.widget.RecyclerView
//import uz.alpha.icmedaidavolanishgasodiqlik.R
//import uz.alpha.icmedaidavolanishgasodiqlik.data.Numbers
//import uz.alpha.icmedaidavolanishgasodiqlik.data.TestData
//import uz.alpha.icmedaidavolanishgasodiqlik.databinding.ItemTestBinding
//import uz.alpha.icmedaidavolanishgasodiqlik.utils.inflate
//
//
//class TestAdapter : ListAdapter<TestData, TestAdapter.TestViewHolder>(MyDiffUtil) {
//
//
//    var  clicked:Int=0
//    var empty:Boolean=false
//    private var selectedPosition = -1
//    var pos:Int=0
//    private val selectCheck: ArrayList<Int> =ArrayList()
//
//
//    private var radio1Listener: ((TestData , ItemTestBinding, Int) -> Unit)? = null
//
//    fun setRadio1(block: (TestData ,ItemTestBinding , Int) -> Unit) {
//        radio1Listener = block
//    }
//
//    private var radio2Listener: ((TestData, ItemTestBinding) -> Unit)? = null
//
//    fun setRadio2(block: (TestData , ItemTestBinding) -> Unit) {
//        radio2Listener = block
//    }
//
//    private var radio3Listener: ((TestData , ItemTestBinding) -> Unit)? = null
//
//    fun setRadio3(block: (TestData , ItemTestBinding) -> Unit) {
//        radio3Listener = block
//    }
//
//    private var radio4Listener: ((TestData , ItemTestBinding) -> Unit)? = null
//
//    fun setRadio4(block: (TestData , ItemTestBinding) -> Unit) {
//        radio4Listener = block
//    }
//
//    private var radio5Listener: ((TestData ,ItemTestBinding) -> Unit)? = null
//
//    fun setRadio5(block: (TestData ,ItemTestBinding) -> Unit) {
//        radio5Listener = block
//    }
//
//    object MyDiffUtil : DiffUtil.ItemCallback<TestData>() {
//        override fun areItemsTheSame(oldItem: TestData, newItem: TestData): Boolean = oldItem==newItem
//
//        override fun areContentsTheSame(oldItem: TestData, newItem: TestData): Boolean {
//            return oldItem.score == newItem.score && oldItem.question == newItem.question && oldItem.variant1 == newItem.variant1 && oldItem.variant2 == newItem.variant2
//                    && oldItem.variant3 == newItem.variant3 && oldItem.variant4 == newItem.variant4 && oldItem.variant5 == newItem.variant5
//        }
//
//    }
//
//
//    inner class TestViewHolder(private val binding: ItemTestBinding) :
//        RecyclerView.ViewHolder(binding.root) {
//
//
//        fun bind() {
//            clicked =0
//         //  clearCheck()
//            val data = getItem(absoluteAdapterPosition)
//            binding.txtCount.text = data.score.toString()
//            binding.test.text =itemView.context.getString(data.question)
//            binding.radio1.text = itemView.context.getString(data.variant1)
//            binding.radio2.text = itemView.context.getString(data.variant2)
//            binding.radio3.text = itemView.context.getString(data.variant3)
//            binding.radio4.text = itemView.context.getString(data.variant4)
//            binding.radio5.text = itemView.context.getString(data.variant5)
////            binding.radio1.setChecked(selectedPosition == position);
////            binding.radio1.setTag(position);
//
//
//            when(getItem(absoluteAdapterPosition).isSelected){
//                Numbers.VARIANT1 -> {
//                    binding.radio2.isChecked = false
//                    binding.radio3.isChecked = false
//                    binding.radio4.isChecked = false
//                    binding.radio5.isChecked = false
//                }
//                Numbers.VARIANT2 -> TODO()
//                Numbers.VARIANT3 -> TODO()
//                Numbers.VARIANT4 -> TODO()
//                Numbers.VARIANT5 -> TODO()
//                null -> TODO()
//            }
//
//
//            binding.radio1.setOnClickListener {
//                binding.radio2.isChecked = false
//                binding.radio3.isChecked = false
//                binding.radio4.isChecked = false
//                binding.radio5.isChecked = false
//                selectedPosition = it.getTag() as Int
//                radio1Listener?.invoke(getItem(absoluteAdapterPosition), binding , absoluteAdapterPosition )
//
//            }
//
//            binding.radio2.setOnClickListener {
//                radio2Listener?.invoke(getItem(absoluteAdapterPosition) , binding)
//            }
//
//
//            binding.radio3.setOnClickListener {
//                radio3Listener?.invoke(getItem(absoluteAdapterPosition) , binding)
//            }
//
//            binding.radio4.setOnClickListener {
//                radio4Listener?.invoke(getItem(absoluteAdapterPosition) ,  binding)
//            }
//
//            binding.radio5.setOnClickListener {
//                radio5Listener?.invoke(getItem(absoluteAdapterPosition) , binding)
//
//            }
//
//        }
//
//        fun clearCheck(){
//            binding.apply {
//                radio1.isChecked=false
//                radio2.isChecked=false
//                radio3.isChecked=false
//                radio4.isChecked=false
//                radio5.isChecked=false
//            }
//        }
//
//        fun trueCheck(pos:Int){
//            when(pos){
//                1->{
//                    binding.radio1.isChecked=true
//                }
//                2->{
//                    binding.radio2.isChecked=true
//                }
//                3->{
//                    binding.radio3.isChecked=true
//                }
//                4->{
//                    binding.radio4.isChecked=true
//                }
//                5->{
//                    binding.radio5.isChecked=true
//                }
//            }
//        }
//    }
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TestViewHolder =
//        TestViewHolder(
//            ItemTestBinding.bind(parent.inflate(R.layout.item_test))
//        )
//
//    override fun onBindViewHolder(holder: TestViewHolder, position: Int) {
////        if (position>=1 && position<=7){
////        //    Extension.count=Extension.ball
////        }
//        holder.bind()
//    }
//
//
//
//}