package subtask2

class Combinator {

    fun checkChooseFromArray(array: Array<Int>): Int? {
        var c = array[0]
        var n = array[1]
        var answer = 0
        fun factorial(a: Int): Long = if (a == 1) a.toLong() else factorial(a - 1) * a
        for(k in n-1 downTo 1){
            var total = factorial(n) / (factorial(n - k) * factorial(k))
            if(total.toInt() == c) {
                answer = k
            }
        }
        if(answer != 0) {
            return answer
        } else {
            return null
        }
    }
}
