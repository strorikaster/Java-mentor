public class Checker {
    public String[] parsResult;

    public Checker (String[] parsResult){
        this.parsResult = new Parcer(Parcer.inputString).parceArguments();
    }

    public String[] getParsResult() {
        return parsResult;
    }

    public boolean checkArabicArgs() {
        try {
            Integer.parseInt(getParsResult()[0]);
            Integer.parseInt(getParsResult()[2]);
            return true;
        } catch (NumberFormatException e) {
           // e.printStackTrace();
            return false;
        }
    }

//    public boolean checkRomeArgs() {
//
//    }

}
