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
    private String key;

    RomeNumbers(String key, int Value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public String getKey() {
        return key;
    }

    int ConvertToInt(String key) {
        for(RomeNumbers i: this.values())
            if (i.getKey().equals(key))
                return i.getValue();

        //return "";
        return 0;
    }



}
