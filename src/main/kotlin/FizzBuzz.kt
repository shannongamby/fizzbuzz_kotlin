class FizzBuzz {
    fun convert(num: Int): String {
        if (num % 3 == 0 && num % 5 == 0) {
            return "fizzbuzz"
        } else if (num % 3 == 0) {
            return "fizz"
        } else if (num % 5 == 0) {
            return "buzz"
        } else {
            return num.toString()
        }
    }

    fun listFizzBuzz(num: Int): List<Any> {
        val list: MutableList<Any> = mutableListOf()
        for (i in 1..num) {
            list.add(convert(i))
        }
        return list
    }

}
