package visitorPattern;

public class Telco implements TelcoSubscription {

    private String telcoName;
    private double promoPrice;
    private int dataAllowance;
    private boolean unliCallText;

    public Telco(int dataAllowance, double promoPrice, String telcoName, boolean unliCallText) {
        this.telcoName = telcoName;
        this.promoPrice = promoPrice;
        this.dataAllowance = dataAllowance;
        this.unliCallText = unliCallText;
    }

    @Override
    public String accept(UsagePromo usagePromo, double price) {
        this.promoPrice = price;
        return usagePromo.showAllowance(telcoName, price);
    }

    @Override
    public String accept(UnliCallsTextOffer unliCallsTextOffer, boolean unliCallText) {
        this.unliCallText = unliCallText;
        return unliCallsTextOffer.showUnliCallsTextOffer(telcoName, unliCallText);
    }

    @Override
    public String getTelcoName() {
        return telcoName;
    }

    @Override
    public double getPromoPrice() {
        return promoPrice;
    }

    @Override
    public int getDataAllowance() {
        return dataAllowance;
    }

    @Override
    public boolean getUnliCallText() {
        return unliCallText;
    }
}
