import java.util.Scanner;

public class Main {

    static Calculator calculator = new Calculator();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split(" ");

        if(words.length > 3 | words.length < 3){
            throw new RuntimeException("Введено неверное количество значений");
        }

        String result = calculator.calculate(words[0],words[2],words[1]);
        System.out.print(result);


    }

}


