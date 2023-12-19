import java.util.Arrays;

public class TemperatureClosestToZero {

    public static void main(String[] args) {
        int[] values1 = {20, 17, -2, 6, -8, 3, 9}; // ergebnis -2
        int[] values2 = {20, 17, -2, -1, 6, -8, 3, 9, 1}; // ergebnis 1
        int[] values3 = {20, 17, -2, 6, -1, -8, 3, 9}; // ergebnis -1
        int[] values4 = {-5, -4, -3, 3, 4, 5, -2}; // ergebnis -2
        int[] values5 = {-5, -4, -3, 3, 4, 0, 5, 2}; // ergebnis 0
        int[] values6 = {20, 17, -2, 1, 6, -8, 3, 9, -1}; // ergebnis 1
        int min = closestToZero(values1);
        System.out.println(Arrays.toString(values1) + " -> " + min);
        min = closestToZero(values2);
        System.out.println(Arrays.toString(values2) + " -> " + min);
        min = closestToZero(values3);
        System.out.println(Arrays.toString(values3) + " -> " + min);
        min = closestToZero(values4);
        System.out.println(Arrays.toString(values4) + " -> " + min);
        min = closestToZero(values5);
        System.out.println(Arrays.toString(values5) + " -> " + min);
        min = closestToZero(values6);
        System.out.println(Arrays.toString(values6) + " -> " + min);

    }

    public static int closestToZero(int[] values) {
        if (values == null || values.length == 0) {
            return 0;
        }
        int min = values[0];
        for (int i = 1; i < values.length; i++) {
            if (Math.abs(min) >= Math.abs(values[i]) && min != Math.abs(values[i])) {
                min = values[i];
                if (min == 0) {
                    return min;
                }
            }
        }
        return min;
    }
}
