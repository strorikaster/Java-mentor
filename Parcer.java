public class Parcer {

    public static String inputString;
    static public String[] arguments;

    public static String getInputString() {
        return inputString;
    }

    public String[] getArguments() {
        return arguments;
    }


    public Parcer(String inputString){
        this.inputString = inputString;
    }

        public String[] parceArguments(){
        arguments = getInputString().split(" ");
            return arguments;
        }

}
