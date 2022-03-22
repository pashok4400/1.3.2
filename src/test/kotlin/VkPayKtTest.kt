import org.junit.Assert.*
import org.junit.Test

class VkPayKtTest {

    @Test
    fun calculatePriceMirSutLim() {

        val typ = "Mir"
        val lastTran = 3000_00
        val lastSutTran = 1000000_00
        val newTran: Int = 1000_00

        val result = calculatePrice(type = typ, lastTranslation = lastTran, lastSutTranslation = lastSutTran, translation = newTran)

        assertEquals(-1, result)
    }

    @Test
    fun calculatePriceMirMonth() {

        val typ = "Mir"
        val lastTran = 600000_00
        val lastSutTran = 1000_00
        val newTran: Int = 1000_00

        val result = calculatePrice(type = typ, lastTranslation = lastTran, lastSutTranslation = lastSutTran, translation = newTran)

        assertEquals(-1, result)
    }

    @Test
    fun calculatePriceMir() {

        val typ = "Mir"
        val lastTran = 30000_00
        val lastSutTran = 100000_00
        val newTran: Int = 10000_00

        val result = calculatePrice(type = typ, lastTranslation = lastTran, lastSutTranslation = lastSutTran, translation = newTran)

        assertEquals(7500, result)
    }

    @Test
    fun calculatePriceMirMin() {

        val typ = "Mir"
        val lastTran = 30000_00
        val lastSutTran = 100000_00
        val newTran: Int = 1000_00

        val result = calculatePrice(type = typ, lastTranslation = lastTran, lastSutTranslation = lastSutTran, translation = newTran)

        assertEquals(35, result)
    }

    @Test
    fun calculatePriceMaestroSutLim() {

        val typ = "Maestro"
        val lastTran = 3000_00
        val lastSutTran = 1000000_00
        val newTran: Int = 1000_00

        val result = calculatePrice(type = typ, lastTranslation = lastTran, lastSutTranslation = lastSutTran, translation = newTran)

        assertEquals(-1, result)
    }

    @Test
    fun calculatePriceMaestroMonth() {

        val typ = "Maestro"
        val lastTran = 600000_00
        val lastSutTran = 1000_00
        val newTran: Int = 1000_00

        val result = calculatePrice(type = typ, lastTranslation = lastTran, lastSutTranslation = lastSutTran, translation = newTran)

        assertEquals(-1, result)
    }


    @Test
    fun calculatePriceMaestroZero() {

        val typ = "Maestro"
        val lastTran = 3000_00
        val lastSutTran = 1000_00
        val newTran: Int = 1000_00

        val result = calculatePrice(type = typ, lastTranslation = lastTran, lastSutTranslation = lastSutTran, translation = newTran)

        assertEquals(0, result)
    }

    @Test
    fun calculatePriceMasterCardSutLim() {

        val typ = "Mastercard"
        val lastTran = 3000_00
        val lastSutTran = 1000000_00
        val newTran: Int = 1000_00

        val result = calculatePrice(type = typ, lastTranslation = lastTran, lastSutTranslation = lastSutTran, translation = newTran)

        assertEquals(-1, result)
    }

    @Test
    fun calculatePriceMasterCardMonth() {

        val typ = "Mastercard"
        val lastTran = 600000_00
        val lastSutTran = 1000_00
        val newTran: Int = 1000_00

        val result = calculatePrice(type = typ, lastTranslation = lastTran, lastSutTranslation = lastSutTran, translation = newTran)

        assertEquals(-1, result)
    }


    @Test
    fun calculatePriceMasterCardZero() {

        val typ = "Mastercard"
        val lastTran = 3000_00
        val lastSutTran = 1000_00
        val newTran: Int = 1000_00

        val result = calculatePrice(type = typ, lastTranslation = lastTran, lastSutTranslation = lastSutTran, translation = newTran)

        assertEquals(0, result)
    }

    @Test
    fun calculatePriceVkLim() {

        val typ = "VkPay"
        val lastTran = 30000_00
        val lastSutTran = 100000_00
        val newTran: Int = 1000_00

        val result = calculatePrice(type = typ, lastTranslation = lastTran, lastSutTranslation = lastSutTran, translation = newTran)

        assertEquals(-1, result)
    }

    @Test
    fun calculatePrice() {
    }


}