fun main() {
    val type = "vkPay"
    val newTranslation : Int = 1000_00
    val lastSutTranslation = 8000_00
    val lastTranslation = 30000_00

    if (calculatePrice(type, lastTranslation, lastSutTranslation, newTranslation) == -1)
        println("Перевод невозможен")
    else
        println("Комиссия за перевод: " + calculatePrice(type, lastTranslation, lastSutTranslation, newTranslation) + " коп.")
}

fun calculatePrice(type: String = "vkPay", lastTranslation: Int = 0, lastSutTranslation: Int, translation: Int): Int {
    val res: Double = when {
        type == "vkPay" && correct(type, lastTranslation, lastSutTranslation, translation) -> 0.0
        (type == "Mastercard" || type == "Maestro") && correct(
            type,
            lastTranslation,
            lastSutTranslation,
            translation
        ) -> if (translation + translation + lastTranslation <= 75000_00) 0.0
        else 0.006 * translation + 20_00
        (type == "Visa" || type == "Mir") && correct(
            type,
            lastTranslation,
            lastSutTranslation,
            translation
        ) -> if (translation * 0.0075 <= 35_00) 35.0 else translation * 0.0075
        else -> -1.0
    }
    return kotlin.math.round(res).toInt()
}

fun correct(type: String, lastTranslation: Int, lastSutTranslation: Int, translation: Int): Boolean {
    if (type == "vkPay") {
        if (translation > 15000_00) {
            println("Превышен разовый лимит $type")
            return false
        }
        if (translation + lastTranslation + lastSutTranslation > 40000_00) {
            println("Превышен месячный лимит $type")
            return false
        }
    } else
        if (translation + lastSutTranslation > 150000_00) {
            println("Превышен суточный лимит $type")
            return false
        }
    if (translation + lastSutTranslation + lastTranslation > 600000_00) {
        println("Превышен месячный лимит $type")
        return false
    }
    return true
}