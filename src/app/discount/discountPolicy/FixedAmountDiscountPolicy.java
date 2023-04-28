package app.discount.discountPolicy;

public class FixedAmountDiscountPolicy {

    private int dicountAmount;

    public FixedAmountDiscountPolicy(int dicountAmount){
        this.dicountAmount = dicountAmount;
    }

    public int calculateDiscountedPrice(int price){
        return price-dicountAmount;
    }

}
