import java.util.Arrays;

public class Parser {

    public String inputString;
    static public String[] arguments;

    public static String getInputString() {
        return Calcapp.inputString;
    }

    public String[] getArguments() {
        return arguments;
    }


    public Parser(String inputString){
        this.inputString = Calcapp.inputString;
    }

        public String[] parseArguments(){
        arguments = getInputString().replace(" ", "").split("");
            return arguments;
    }
}
