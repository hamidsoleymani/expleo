public class ChildLearnsAddition {
    public static void main(String[] args) {
        String s1;
        s1 = printCodeIfIncorrectAdded(123, 456, 578);
        System.out.println("123, 456, 578" + "->" + s1);
        s1 = printCodeIfIncorrectAdded(123, 456, 579);
        System.out.println("123, 456, 579" + "->" + s1);
        s1 = printCodeIfIncorrectAdded(123, 456, 589);
        System.out.println("123, 456, 589" + "->" + s1);
        s1 = printCodeIfIncorrectAdded(123, 456, 679);
        System.out.println("123, 456, 679" + "->" + s1);
        s1 = printCodeIfIncorrectAdded(23, 456, 479);
        System.out.println("23, 456, 479" + "->" + s1);
        s1 = printCodeIfIncorrectAdded(153, 456, 509);
        System.out.println("153, 456, 509" + "->" + s1);
        s1 = printCodeIfIncorrectAdded(153, 457, 510);
        System.out.println("153, 457, 510" + "->" + s1);
        s1 = printCodeIfIncorrectAdded(1553, 1457, 2010);
        System.out.println("1553, 1457, 2010" + "->" + s1);
        s1 = printCodeIfIncorrectAdded(553, 457, 788);
        System.out.println("553, 457, 788" + "->" + s1);
        s1 = printCodeIfIncorrectAdded(553, 457, 910);
        System.out.println("553, 457, 910" + "->" + s1);

    }

    public static String printCodeIfIncorrectAdded(int value1, int value2, int sum) {

        if (value1 + value2 == sum) {
            return "ok";
        }
        char[] charArray1 = String.valueOf(value1).toCharArray();
        char[] charArray2 = String.valueOf(value2).toCharArray();
        char[] charArraySum = String.valueOf(sum).toCharArray();
        int biggestLength = Math.max(charArray1.length, charArray2.length);
        int erg = 0;
        int ueberlauf = 0;

        for (int i = biggestLength - 1; i >= 0; i--) {
            erg = erg + 1;
            int sumCharI = ueberlauf + getNrFromChar(charArray1[i]) + getNrFromChar(charArray2[i]);
            ueberlauf = 0;
            if (!(sumCharI == getNrFromChar(charArraySum[i])) && !(sumCharI % 10 == getNrFromChar(charArraySum[i]))) {
                return String.valueOf(erg);
            } else if (sumCharI >= 10) {
                ueberlauf++;
            }
        }
        return "ok";
    }

    private static int getNrFromChar(char i) {
        return Character.getNumericValue(i);
    }
}
