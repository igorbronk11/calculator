public class Calculator {

    RomanNumber romanNumber = new RomanNumber();
    public String calculate(String a, String b, String oper) {

        int num1;
        int num2;

        try {

        num1 = Integer.parseInt(a);
        num2 = Integer.parseInt(b);
        if (num1 > 10 | num1 < 0 | num2 > 10 | num2 < 0){
            throw new RuntimeException("Введеное арабское число не должно меньше 0 и больше 10");
        }
        return String.valueOf(result(num1,num2,oper));


        } catch(NumberFormatException fail) {
            num1 = romanNumber.convertArabiam(a);
            num2 = romanNumber.convertArabiam(b);

            int z = result(num1, num2, oper);
            return romanNumber.convert(z);
        }
    }
    public int result(int a, int b, String oper) {
        int i;

        switch (oper) {
            case "+" :
                i = a + b;
                break;
            case "-" :
                i = a - b;
                break;
            case "*" :
                i = a * b;
                break;
            case "/" :
                i = a / b;
                break;
            default: throw new RuntimeException("Неизвестный оператор");
        }

        return i;
    }
}
