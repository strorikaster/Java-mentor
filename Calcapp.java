import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Calcapp {
        public static String inputString;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите аргументы и действия через пробел");
        inputString = reader.readLine();
        Parser parser = new Parser(inputString);
        Converter converter = new Converter(parser.parseArguments());
        Calculator calculator = new Calculator(converter.convertArguments()[0], converter.convertArguments()[1], converter.getMathOperator());
        System.out.println(converter.convertResult(calculator.calculate()));
        }
    }

