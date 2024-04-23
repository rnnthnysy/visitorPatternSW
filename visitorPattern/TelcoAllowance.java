package visitorPattern;

import java.util.*;

public class TelcoAllowance implements UsagePromo {

    private static final Map<String, Double> telcoPromoMap = new HashMap<>();

    static{
        telcoPromoMap.put("Smart", 15.0);
        telcoPromoMap.put("Globe", 10.0);
        telcoPromoMap.put("Ditto", 8.0);
    }

    @Override
    public String showAllowance(String telcoName, double money) {
        return telcoPromoMap.get(telcoName) + "GB " + money + "PHP";
    }




}
