package main.kotlin

class Main {
    fun main(args: Array<String>) {
        println("Hellow World");
    }
}

class Solution {
    fun search(nums: IntArray, target: Int): Int {

        return binarySearch(nums, target, 0, nums.size - 1)
    }

    private fun binarySearch(nums: IntArray, target: Int, s: Int, e: Int): Int {
        if(s > e) return -1

        val mid: Int = s + (e - s) / 2

        return if(nums[mid] < target) binarySearch(nums, target, mid+1, e)
        else if(nums[mid] == target) mid
        else binarySearch(nums, target, s, mid - 1)
    }
}