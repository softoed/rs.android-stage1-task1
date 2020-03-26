package subtask2

class MiniMaxSum {

    // TODO: Complete the following function
    fun getResult(input: IntArray): IntArray {
        var numberForRes = input.min()
        var minNumber = 0
        if (numberForRes != null) minNumber = numberForRes

        numberForRes = input.max()
        var maxNumber = 0
        if (numberForRes != null) maxNumber = numberForRes

        val maxSum = input.sum() - minNumber
        val minSum = input.sum() - maxNumber

        return intArrayOf(minSum, maxSum)
    }
}
