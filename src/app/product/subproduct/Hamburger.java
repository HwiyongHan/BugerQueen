package app.product.subproduct;

import app.product.Product;

public class Hamburger extends Product {
    private boolean isBurgerSet; // 햄버거 세트 여부
    private int burgerSetPrice; // 햄버거 세트 가격

    public Hamburger(int id, String name, int price, int kcal, boolean isBurgerSet, int burgerSetPrice) {
        super(id, name, price, kcal);
        this.burgerSetPrice = burgerSetPrice;
        this.isBurgerSet = isBurgerSet;
    }
    public Hamburger(Hamburger hamburger) {
        super(hamburger.getName(), hamburger.getPrice(), hamburger.getKcal());
        this.isBurgerSet = hamburger.isBurgerSet();
        this.burgerSetPrice = hamburger.getBurgerSetPrice();
    }

    public boolean isBurgerSet() {
        return isBurgerSet;
    }


    public void setIsBurgerSet(boolean isBurgerSet){
        this.isBurgerSet = isBurgerSet;
    }

    public int getBurgerSetPrice(){
        return burgerSetPrice;
    }

    public void setBurgerSetPrice(int burgerSetPrice){
        this.burgerSetPrice = burgerSetPrice;
    }
}
