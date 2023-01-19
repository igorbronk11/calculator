public class RomanNumber {
    public String convert(int num) {
        String[] roman = {"O", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
                "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
                "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
                "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
                "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
                "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
                "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"};

        String s = roman[num];
        return s;
    }
    public int convertArabiam(String a) {
        int arabian;
        switch (a) {
            case "0" :
                arabian = 0;
                break;
            case "I" :
                arabian = 1;
                break;
            case "II" :
                arabian = 2;
                break;
            case "III" :
                arabian = 3;
                break;
            case "IV" :
                arabian = 4;
                break;
            case "V" :
                arabian = 5;
                break;
            case "VI" :
                arabian = 6;
                break;
            case "VII" :
                arabian = 7;
                break;
            case "VIII" :
                arabian = 8;
                break;
            case "IX" :
                arabian = 9;
                break;
            case "X" :
                arabian = 10;
                break;
            default: throw new RuntimeException("Неправильное значение");

        }
        return arabian;
    }
}
