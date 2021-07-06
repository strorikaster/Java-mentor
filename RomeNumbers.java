enum RomeNumbers {
    I("I", 1),
    II("II", 2),
    III("III", 3),
    IV("IV",4),
    V("V", 5),
    VI("VI", 6),
    VII("VII", 7),
    VIII("VIII", 8),
    IX("IX", 9),
    X("X", 10);

    private int value;
    private static String key;

    RomeNumbers(String key, int Value) {
        this.value = value;
    }

     public int getValue() {
        return value;
    }

    public static String getKey() {
        return key;
    }

     public  int ConvertToInt(String key) {
         this.key = key;
         for(RomeNumbers i: this.values())
            if (i.getKey().equals(key))
                return i.getValue();

        //return "";
        return 0;
//    I(1), II(2), III(3), IV(4), V(5), VI(6), VII(7), VIII(8), IX(9), X(10);
//    private int value;
//
//    RomeNumbers(int value) {
//        this.value = value;
//    }
//
//    public int ConvertToInt() {
//        return value;
    }

}
