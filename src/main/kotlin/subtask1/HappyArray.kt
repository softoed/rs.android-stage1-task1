package subtask1

class HappyArray {

    // TODO: Complete the following function
    fun convertToHappy(sadArray: IntArray): IntArray {
        var tempArray = sadArray.toMutableList()
        if (sadArray.count() < 3) return sadArray

        var i: Int = 0

        do if (tempArray.elementAt(i) + tempArray.elementAt(i+2) < tempArray.elementAt(i+1)) {
            tempArray.removeAt(i+1)
            if (i != 0) i -= 1
        }
        else
        {
            if (i != tempArray.count() - 2) i += 1
        }
        while (i != tempArray.count() - 2)

        return tempArray.toIntArray()
    }
}
