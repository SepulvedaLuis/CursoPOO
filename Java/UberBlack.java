package Java;

import java.util.ArrayList;
import java.util.Map;

class UberBlack extends Car {
    Map<String, ArrayList<String, Integer>> typeCarAccepted;
    ArrayList<String> seatsMaterial;

    public UberBlack(String license, Account driver, Integer passegender,
            Map<String, ArrayList<String, Integer>> typeCarAccepted, ArrayList<String> seatsMaterial) {
        super(license, driver, passegender);
        this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterial = seatsMaterial;

    }
}
