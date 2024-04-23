package visitorPattern;
import java.util.*;

public class UnliCallTextPackage implements UnliCallsTextOffer{

    private static final Map<String, String> unliCallTextOfferMap = new HashMap<>();

    static {
        unliCallTextOfferMap.put("Smart", "Does not offer any free calls or texts, and you will be charged per use.");
        unliCallTextOfferMap.put("Globe", "This plan comes with unlimited calls and texts to subscribers within their network. Calls and texts to other networks are charged extra.");
        unliCallTextOfferMap.put("Ditto", "This plan includes unlimited calls and texts to all networks within the country.");
    }

    @Override
    public String showUnliCallsTextOffer(String telcoName, boolean unliCallText) {
        String offer = unliCallTextOfferMap.getOrDefault(telcoName, "Unknown");

        return (unliCallText ? "Unlimited" : "No unlimited") + " calls and text package for " + telcoName + ". " + offer;
    }
}
