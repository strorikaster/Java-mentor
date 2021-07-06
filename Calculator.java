import java.sql.PreparedStatement;

public class Calculator {
    public int firstArgument, secondArgument;
    public char mathAction;
    public int result;


    public Calculator(int firstArgument, int secondArgument, char mathAction){
        this.firstArgument = firstArgument;
        this.secondArgument = secondArgument;
        this.mathAction = mathAction;
    }





    public /*int*/void calculate(/*int firstArgument, int secondArgument, char mathAction*/){

        //int result;
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
        //return result;
        System.out.println(result);
    }
}
