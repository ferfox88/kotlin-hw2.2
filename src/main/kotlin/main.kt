fun main() {
    val likes = 61
    if (likes % 10 == 1 && likes != 11) {
        println("Понравилось $likes человеку")
    } else {
        println("Понравилось $likes людям")
    }
}
