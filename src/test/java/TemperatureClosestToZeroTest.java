import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TemperatureClosestToZeroTest {

    @Test
    void closestToZeroTest() {
        int[] expected1 = {20, 17, -2, 6, -8, 3, 9}; // ergebnis -2
        int[] expected2 = {20, 17, -2, -1, 6, -8, 3, 9, 1}; // ergebnis 1
        int[] expected3 = {20, 17, -2, 6, -1, -8, 3, 9}; // ergebnis -1
        int[] expected4 = {-5, -4, -3, 3, 4, 5, -2}; // ergebnis -2
        int[] expected5 = {-5, -4, -3, 3, 4, 0, 5, 2}; // ergebnis 0
        int[] expected6 = {20, 17, -2, 1, 6, -8, 3, 9, -1}; // ergebnis 1
        int actual = TemperatureClosestToZero.closestToZero(expected1);
        assertEquals(-2, actual);
        actual = TemperatureClosestToZero.closestToZero(expected2);
        assertEquals(1, actual);
        actual = TemperatureClosestToZero.closestToZero(expected3);
        assertEquals(-1, actual);
        actual = TemperatureClosestToZero.closestToZero(expected4);
        assertEquals(-2, actual);
        actual = TemperatureClosestToZero.closestToZero(expected5);
        assertEquals(0, actual);
        actual = TemperatureClosestToZero.closestToZero(expected6);
        assertEquals(1, actual);
    }
}
