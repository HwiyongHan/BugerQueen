package app;

import app.discount.Discount;
import app.discount.discountCondition.CozDiscountCondition;
import app.discount.discountCondition.DiscountCondition;
import app.discount.discountCondition.KidDiscountCondition;
import app.discount.discountPolicy.FixedAmountDiscountPolicy;
import app.discount.discountPolicy.FixedRateDiscountPolicy;

public class Order {
    private Cart cart;
    private Discount discount;
    public Order(Cart cart, Discount discount){
        this.cart = cart;
        this.discount = discount;
    }
    private DiscountCondition[] discountConditions;
    public void makeOrder() {

        int totalPrice = cart.calculateTotalPrice();
        int finalPrice = discount.discount(totalPrice);


        System.out.println(" 주문이 완료되었습니다. ");
        System.out.println(" 주문 내역은 다음과 같습니다. ");
        System.out.println("-".repeat(60));

        cart.printCartItemDetails();//상품 상세 내역 출력

        System.out.println("-".repeat(60));
        System.out.printf("금액 합계      : %d원\n", totalPrice/*금액 합계 계산*/);
        System.out.printf("할인 적용 금액 : %d원\n", finalPrice/*할인 적용 금액 계산*/);

    }
}
