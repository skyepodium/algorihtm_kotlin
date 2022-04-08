fun main(args: Array<String>){

    val sl = Solution()
    val s = "A man, a plan, a canal: Panama"
    val res = sl.isPalindrome(s)

    println(res)
}

class Solution {
    fun isPalindrome(s: String): Boolean {
        val t = s.toLowerCase().replace("[^a-zA-Z0-9]".toRegex(), "")
        println(t)
        return t == t.reversed();
    }
}