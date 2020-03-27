package subtask4

class StringParser {

    // TODO: Complete the following function
    fun getResult(inp: String): Array<Any> {
        var symbArr = ""
        val posArr = arrayListOf<Int>()

        for (i in 0..inp.length - 1) {
            when (inp[i]) {
                '(','[','<',')',']','>' -> {
                    symbArr += inp[i]
                    posArr.add(i)
                }
            }
        }

        posArr.toIntArray()

        fun nextBra(input: String, find: Char, startPos: Int): Int {
            var endSymb = ' '

            when (find) {
                '(' -> endSymb = ')'
                '[' -> endSymb = ']'
                '<' -> endSymb = '>'
            }

            if ((endSymb == ' ') || (startPos == input.length)) return -1

            var symbFound = 0
            var stopSymb = 0
            var j = startPos + 1

            do {
                if (input[j] == find) symbFound += 1
                else if (input[j] == endSymb) {
                    symbFound -= 1
                    stopSymb = posArr[j]
                }

                j += 1
            } while (symbFound > -1)

            return stopSymb
        }

        val resList = arrayListOf<String>()

        for (i in 0 until symbArr.length - 1) {
            val resPos = nextBra(symbArr, symbArr[i], i)

            if (resPos == -1) continue
            resList.add(inp.substring(posArr[i]+1,resPos))
        }

        return  resList.toArray()
    }
}
