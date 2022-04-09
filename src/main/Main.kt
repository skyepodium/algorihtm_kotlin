import java.util.*

fun main(args: Array<String>){

}

class KthLargest(k: Int, nums: IntArray) {

    private val pq: PriorityQueue<Int> = PriorityQueue { a, b -> b - a }
    private val k = k

    init {
        for(element in nums) pq.add(element)

        while(pq.size > k) pq.poll()
    }

    fun add(a: Int): Int {
        pq.add(a)

        while(pq.size > k) pq.poll()

        return pq.peek()
    }
}