
// 
import java.util.*;

public class App {

    public static void main(String[] args) {
        System.out.println("Введите пример вида  a + b, a - b, a * b, a / b.:");
        try (Scanner st = new Scanner(System.in)) {
            String input = st.nextLine();
            // System.out.println("Result: " + input);

            String[] ops = input.split(" ");
            int i = 0;
            String[] zn = new String[3];
            for (String op : ops) {
                zn[i] = op;
                // System.out.println(zn[i]);
                i = i + 1;

            }
            int num1 = 0;
            int num2 = 0;
            boolean valid = false;
            String[] rome = new String[101];
            rome[0] = "";
            rome[1] = "I";
            rome[2] = "II";
            rome[3] = "III";
            rome[4] = "IV";
            rome[5] = "V";
            rome[6] = "VI";
            rome[7] = "VII";
            rome[8] = "VIII";
            rome[9] = "IX";
            rome[10] = "X";
            rome[11] = "XI";
            rome[12] = "XII";
            rome[13] = "XIII";
            rome[14] = "XIV";
            rome[15] = "XV";
            rome[16] = "XVI";
            rome[17] = "XVII";
            rome[18] = "XVIII";
            rome[19] = "XIX";
            rome[20] = "XX";
            rome[21] = "XXI";
            rome[22] = "XXII";
            rome[23] = "XXIII";
            rome[24] = "XXIV";
            rome[25] = "XXV";
            rome[26] = "XXVI";
            rome[27] = "XXVII";
            rome[28] = "XXVIII";
            rome[29] = "XXIX";
            rome[30] = "XXX";
            rome[31] = "XXXI";
            rome[32] = "XXXII";
            rome[33] = "XXXIII";
            rome[34] = "XXXIV";
            rome[35] = "XXXV";
            rome[36] = "XXXVI";
            rome[37] = "XXXVII";
            rome[38] = "XXXVIII";
            rome[39] = "XXXIX";
            rome[40] = "XL";
            rome[41] = "XLI";
            rome[42] = "XLII";
            rome[43] = "XLIII";
            rome[44] = "XLIV";
            rome[45] = "XLV";
            rome[46] = "XLVI";
            rome[47] = "XLVII";
            rome[48] = "XLVIII";
            rome[49] = "XLIX";
            rome[50] = "L";
            rome[51] = "LI";
            rome[52] = "LII";
            rome[53] = "LIII";
            rome[54] = "LIV";
            rome[55] = "LV";
            rome[56] = "LVI";
            rome[57] = "LVII";
            rome[58] = "LVIII";
            rome[59] = "LIX";
            rome[60] = "LX";
            rome[61] = "LXI";
            rome[62] = "LXII";
            rome[63] = "LXIII";
            rome[64] = "LXIV";
            rome[65] = "LXV";
            rome[66] = "LXVI";
            rome[67] = "LXVII";
            rome[68] = "LXVIII";
            rome[69] = "LXIX";
            rome[70] = "LXX";
            rome[71] = "LXXI";
            rome[72] = "LXXII";
            rome[73] = "LXXIII";
            rome[74] = "LXXIV";
            rome[75] = "LXXV";
            rome[76] = "LXXVI";
            rome[77] = "LXXVII";
            rome[78] = "LXXVIII";
            rome[79] = "LXXIX";
            rome[80] = "LXXX";
            rome[81] = "LXXXI";
            rome[82] = "LXXXII";
            rome[83] = "LXXXIII";
            rome[84] = "LXXXIV";
            rome[85] = "LXXXV";
            rome[86] = "LXXXVI";
            rome[87] = "LXXXVII";
            rome[88] = "LXXXVIII";
            rome[89] = "LXXXIX";
            rome[90] = "XC";
            rome[91] = "XCI";
            rome[92] = "XCII";
            rome[93] = "XCIII";
            rome[94] = "XCIV";
            rome[95] = "XCV";
            rome[96] = "XCVI";
            rome[97] = "XCVII";
            rome[98] = "XCVIII";
            rome[99] = "XCIX";
            rome[100] = "C";

            switch (zn[0]) {
                case "I":
                    num1 = 1;
                    valid = true;
                    break;
                case "II":
                    num1 = 2;
                    valid = true;
                    break;
                case "III":
                    num1 = 3;
                    valid = true;
                    break;
                case "IV":
                    num1 = 4;
                    valid = true;
                    break;
                case "V":
                    num1 = 5;
                    valid = true;
                    break;
                case "VI":
                    num1 = 6;
                    break;
                case "VII":
                    num1 = 7;
                    valid = true;
                    break;
                case "VIII":
                    num1 = 8;
                    valid = true;
                    break;
                case "IX":
                    num1 = 9;
                    valid = true;
                    break;
                case "X":
                    num1 = 10;
                    valid = true;
                    break;
            }
            switch (zn[2]) {
                case "I":
                    num2 = 1;
                    break;
                case "II":
                    num2 = 2;
                    break;
                case "III":
                    num2 = 3;
                    break;
                case "IV":
                    num2 = 4;
                    break;
                case "V":
                    num2 = 5;
                    break;
                case "VI":
                    num2 = 6;
                    break;
                case "VII":
                    num2 = 7;
                    break;
                case "VIII":
                    num2 = 8;
                    break;
                case "IX":
                    num2 = 9;
                    break;
                case "X":
                    num2 = 10;
                    break;
            }
            if (num1 == 0) {

                try {
                    num1 = Integer.parseInt(zn[0]);
                    num2 = Integer.parseInt(zn[2]);
                } catch (NumberFormatException e) {
                    System.out.println("Одно или оба значения не корректны!");
                    System.exit(0);
                }
            }

            if (num1 >= -10 && num1 <= 10 && num2 >= -10 && num2 <= 10) {

            } else {
                System.out.println("Операнд должен быть в диапазоне от -10 до 10");
                System.exit(0);
            }

            int result = 0;

            switch (zn[1]) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    result = num1 / num2;
                    break;
                default:
                    System.out.println("Операция не распознана.");
                    System.exit(0);
            }

            if (valid == false) {

                System.out.println("Результат = " + result);
            } else {
                if (result > 0) {
                    System.out.println("Результат = " + rome[result]);
                } else {
                    System.out
                            .println("Результат в Римской системе исчисления не может быть нулевым или отрицательным!");
                    System.exit(0);
                }
            }
        }
    }
}