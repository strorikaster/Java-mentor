import java.util.Map;

public enum RomeNumbers {
    _I("_I", -1),
    _II("_II", -2),
    _III("_III", -3),
    _IV("_IV",-4),
    _V("_V", -5),
    _VI("_VI", -6),
    _VII("_VII", -7),
    _VIII("_VIII", -8),
    _IX("_IX", -9),
    _X("_X", -10),
    _L("_L", -50),
    _C("_C", -100),
    O("0", 0),
    I("I", 1),
    II("II", 2),
    III("III", 3),
    IV("IV",4),
    V("V", 5),
    VI("VI", 6),
    VII("VII", 7),
    VIII("VIII", 8),
    IX("IX", 9),
    X("X", 10),
     L("L", 50),
    C("C", 100);


    private int value = 0;
    private String key = "";


    RomeNumbers(String key, int value) {
        this.key = key;
        this.value = value;
    }

     public int getValue() {
        return value;
    }

    public  String getKey() {
        return key;
    }

     public int ConvertToInt(String key) {

         int arabicValue = 0;

         for(RomeNumbers i: values()) {

             if (i.getKey().equals(key)){
                 arabicValue = i.getValue();
                    break;
             }
         }
        return arabicValue;

    }

    public static String convertToRomeNumbers(int value) {
        String romeValue = "";
        //int
        switch (value/10){
            case(0) :
        for(RomeNumbers i: values()) {
            if (i.getValue() == (value)) {
                if (value == 0) {
                    romeValue = "0";
                }else{
                   // if(value > 0) {
                        romeValue = i.getKey();
                   // }/*else{
                     //   romeValue = i.getKey();*/
                    //}
                }
            }
        }

            case(1) :
                for(RomeNumbers i: values()) {
                    if (i.getValue() == (value - 10)) {
                        if (i.getValue() == 0) {
                            romeValue = "X";
                        } else {
                            romeValue = "X" + i.getKey();
                        }
                    }
                }
                break;

            case(2) :
                for(RomeNumbers i: values()) {
                    if (i.getValue() == (value - 20)) {
                        if (i.getValue() == 0) {
                            romeValue = "XX";
                        } else {
                            romeValue = "XX" + i.getKey();
                        }
                    }
                }
                break;
            case(3) :
                for(RomeNumbers i: values()) {
                    if (i.getValue() == (value - 30)) {
                        if (i.getValue() == 0) {
                            romeValue = "XXX";
                        } else {
                            romeValue = "XXX" + i.getKey();
                        }
                    }
                }
                break;
            case(4) :
                for(RomeNumbers i: values()) {
                    if (i.getValue() == (value - 40)) {
                        if (i.getValue() == 0) {
                            romeValue = "XL";
                        } else {
                            romeValue = "XL" + i.getKey();
                        }
                    }
                }
                break;
            case(5) :
                for(RomeNumbers i: values()) {
                    if (i.getValue() == (value - 50)) {
                        if (i.getValue() == 0) {
                            romeValue = "L";
                        } else {
                            romeValue = "L" + i.getKey();
                        }
                    }
                }
                break;
            case(6) :
                for(RomeNumbers i: values()) {
                    if (i.getValue() == (value - 60)) {
                        if (i.getValue() == 0) {
                            romeValue = "LX";
                        } else {
                            romeValue = "LX" + i.getKey();
                        }
                    }
                }
                break;
            case(7) :
                for(RomeNumbers i: values()) {
                    if (i.getValue() == (value - 70)) {
                        if (i.getValue() == 0) {
                            romeValue = "LXX";
                        } else {
                            romeValue = "LXX" + i.getKey();
                        }
                    }
                }
                break;
            case(8) :
                for(RomeNumbers i: values()) {
                    if (i.getValue() == (value - 80)) {
                        if (i.getValue() == 0) {
                            romeValue = "LXXX";
                        } else {
                            romeValue = "LXXX" + i.getKey();
                        }
                    }
                }
                break;
            case(9) :
                for(RomeNumbers i: values()) {
                    if (i.getValue() == (value - 90)) {
                        if (i.getValue() == 0) {
                            romeValue = "XC";
                        } else {
                            romeValue = "XC" + i.getKey();
                        }
                    }
                }
                break;
            case(10) :
                for(RomeNumbers i: values()) {
                    if (i.getValue() == (value - 100)) {
                        if (i.getValue() == 0) {
                            romeValue = "C";
                        } else {
                            romeValue = "C" + i.getKey();
                        }
                    }
                }
                break;
        }
        return romeValue;
    }

}
