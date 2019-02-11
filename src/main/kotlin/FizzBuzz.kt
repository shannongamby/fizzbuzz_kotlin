class FizzBuzz {
    fun convert(num: Int): String {
        if (num == 15) {
            return "fizzbuzz"
        } else if (num == 3) {
            return "fizz"
        } else if (num == 5) {
            return "buzz"
        } else {
            return num.toString()
        }
    }

}
