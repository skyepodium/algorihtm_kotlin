fun main(args: Array<String>){

}

class Solution {
    fun arraySign(nums: IntArray): Int {
        var res:Int = 1

        for(num in nums) {
            if(num == 0) res = 0
            else if(num < 0) res *= -1
        }

        return res
    }
}