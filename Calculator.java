import java.sql.PreparedStatement;
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


        switch(mathAction){
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
