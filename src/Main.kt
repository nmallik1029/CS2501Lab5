fun main() {
    println(countWords("Neel Mallik is at Northeastern University"))
    println(countCharNGrams("RasikaRasika", 4))
}

fun countWords(sentence: String): Map<String, Int> {
    val words = sentence.split(" ")
    val counts = mutableMapOf<String, Int>()

    for (word in words) {
        counts[word] = counts.getOrDefault(word, 0) + 1 }
    return counts
}

fun countCharNGrams(text: String, n: Int = 3): Map<String, Int> {
    val counts = mutableMapOf<String, Int>()

    for (chars in 0..text.length - n) {
        val nGram = text.substring(chars, chars + n)
        counts[nGram] = counts.getOrDefault(nGram, 0) + 1
    }
    return counts
}

