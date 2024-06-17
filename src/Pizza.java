public class Pizza {
    private int price;
    private Boolean veg;

    private int extraCheesePrice = 100;
    private int extraToppingsPrice = 200;
    private int backPackPrice = 40;
    private int basePizzaPrice;

    private boolean isExtraCheeseAdded = false;
    private boolean isExtraToppingAdded = false;
    private boolean isSelected = false;

    public Pizza(Boolean veg) {
        this.veg = veg;
        if (this.veg) {
            this.price = 500;
        } else {
            this.price = 600;
        }
        basePizzaPrice = this.price;
    }

    public void addExtraCheese() {
        isExtraCheeseAdded = true;
        this.price += extraCheesePrice;

    }

    public void addExtraTopping() {
        isExtraToppingAdded = true;
        this.price += extraToppingsPrice;

    }

    public void takeAway() {
        isSelected = true;
        this.price += backPackPrice;

    }

    public void getBill() {
        String bill = "";
        System.out.println("Pizza : " + basePizzaPrice);

        if (isExtraCheeseAdded) {
            bill += "Extra Cheese Added : " + extraCheesePrice + "\n";
        }
        if (isExtraToppingAdded) {
            bill += "ExtraTopping Added : " + extraToppingsPrice + "\n";
        }
        if (isSelected) {
            bill += "Take Away : " + backPackPrice + "\n";
        }
        bill += "Bill : " + this.price + "\n";
        System.out.println(bill);

    }

}
