import java.sql.PreparedStatement;
import java.sql.SQLOutput;
import java.util.Arrays;

public class Calculator {
    public int firstArgument, secondArgument;
    public char mathAction;
    public Integer result;


    public Calculator(int firstArgument, int secondArgument, char mathAction){
        this.firstArgument = firstArgument;
        this.secondArgument = secondArgument;
        this.mathAction = mathAction;
    }

    public int calculate(){

        if(1 > firstArgument || firstArgument > 10){
            System.out.println("Необходимо использовать числа от 1 до 10, перезапустите программу!!!");
            System.exit(0);
        }
        if (1 > secondArgument || secondArgument > 10){
            System.out.println("Необходимо использовать числа от 1 до 10, перезапустите программу!!!");
            System.exit(0);
        }

         switch (mathAction) {
                case '+':
                    result = firstArgument + secondArgument;
                    break;
                case '-':
                    result = firstArgument - secondArgument;
                    break;
                case '*':
                    result = firstArgument * secondArgument;
                    break;
                case '/':
                    result = firstArgument / secondArgument;
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + mathAction);
            }

            return result;

    }
}
