package main.kotlin

class Main {
}

class Solution {
    fun search(nums: IntArray, target: Int): Int {
        var s = 0
        var e: Int = nums.size - 1

        while(s <= e) {
            var mid: Int = s + (e - s) / 2

            if(nums[mid] < target) s = mid + 1
            else if(nums[mid] == target) return mid
            else e = mid - 1
        }

        return -1;
    }
}