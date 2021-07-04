import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calcapp {
        public static String inputString;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите аргументы и действия");
        inputString = reader.readLine();
        Parcer parser = new Parcer(inputString);
        Checker checker = new Checker(parser.parceArguments());
        if (checker.checkArabicArgs() == true){
            Calculator calculator = new Calculator(
                    Integer.parseInt(new Parcer(inputString).parceArguments()[0]),
                    Integer.parseInt(new Parcer(inputString).parceArguments()[2]),
                    new Parcer(inputString).parceArguments()[1].charAt(0));
            calculator.Calculate();
        }

    }
}
