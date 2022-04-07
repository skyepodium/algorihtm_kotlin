fun main(args: Array<String>){
    var nums = arrayOf(0, 1, 2, 3)

    val res = bubbleSort(nums)
    for(r in res) {
        println(r)
    }
}

fun bubbleSort(nums: Array<Int>): Array<Int> {
    for(i in nums.size - 1 downTo 0) {
        for(j in 0 until i) {
            if(nums[j] > nums[j+1]) {
                val temp = nums[j]
                nums[j] = nums[i]
                nums[i] = temp
            }
        }
    }

    return nums
}