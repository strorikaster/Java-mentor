import java.util.Arrays;

public class Converter {
    public String[] arguments = {"", ""};
    public int[] convertedArguments = {0, 0};
    public String result = "";

    public Converter(String[] arguments){
        this.arguments = Parser.arguments;
    }

    public int[] convertArguments() {
        if ((Arrays.toString(RomeNumbers.values())).contains(arguments[0]) && (Arrays.toString(RomeNumbers.values())).contains(arguments[2])) {
            convertedArguments[0] = RomeNumbers.valueOf(arguments[0]).ConvertToInt(arguments[0]);
            convertedArguments[1] = RomeNumbers.valueOf(arguments[2]).ConvertToInt(arguments[2]);
            //arguments[1].charAt(0);
        } else {
            convertedArguments[0] = Integer.parseInt(arguments[0]);
            convertedArguments[1] = Integer.parseInt(arguments[2]);
           // arguments[1].charAt(0);
        }
        return convertedArguments;
    }

    public String convertResult(int intResult){
        if ((Arrays.toString(RomeNumbers.values())).contains(arguments[0]) && (Arrays.toString(RomeNumbers.values())).contains(arguments[2])){
            result = RomeNumbers.convertToRomeNumbers(intResult);
        }else{
            result = Integer.toString(intResult);
        }
       return result;
    }

    public char getMathOperator() {
        return arguments[1].charAt(0);
    }
}
