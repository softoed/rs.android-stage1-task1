package subtask5

class HighestPalindrome {

    // TODO: Complete the following function
    fun highestValuePalindrome(n: Int, k: Int, digitString: String): String {
        var difNumber = 0
        var changes = 0
        val posChangArr = arrayListOf<Int>()
        val tempString = digitString.toCharArray()

        for (i in n/2 - 1 downTo 0) {
            if (digitString[i] != digitString[n - i - 1]) {
                difNumber += 1
                if (digitString[i].toInt() > digitString[n - i - 1].toInt()) {
                    tempString[n - i - i] = digitString[i]
                    changes += 1
                }
                else {
                    tempString[i] = digitString[n - i - 1]
                    changes += 1
                }

                posChangArr.add(i)

            }
        }

        if (difNumber > k) return "-1"

        posChangArr.toIntArray()

        if (k - changes > 0) {
            for (i in posChangArr.count()-1 downTo posChangArr.count() - (k - changes)) {
                tempString[posChangArr[i]] = '9'
                tempString[n - posChangArr[i] - 1] = '9'
            }
        }

        return String(tempString)
    }
}
