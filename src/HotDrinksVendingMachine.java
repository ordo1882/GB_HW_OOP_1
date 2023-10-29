public class HotDrinksVendingMachine implements IVendingMachine {
    private String name;
    private short water;
    private short sugarPerDrink;
    private short milkPerDrink;
    private double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public short getWater() {
        return water;
    }

    public void setWater(short water) {
        this.water = water;
    }

    public short getSugarPerDrink() {
        return sugarPerDrink;
    }

    public void setSugarPerDrink(short sugarPerDrink) {
        this.sugarPerDrink = sugarPerDrink;
    }

    public short getMilkPerDrink() {
        return milkPerDrink;
    }

    public void setMilkPerDrink(short milkPerDrink) {
        this.milkPerDrink = milkPerDrink;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public HotDrinksVendingMachine(String name, short water, short sugarPerDrink, double price, short milkPerDrink) {
        this.name = name;
        this.water = water;
        this.sugarPerDrink = sugarPerDrink;
        this.milkPerDrink = milkPerDrink;
        this.price = price;
    }

    @Override
    public void getProduct() {
        System.out.printf("""
                Take your order:\s
                Beverage = %s
                Size     = %d ml
                Sugar    = %d g
                Price    = $%.2f
                                
                """, name, water, sugarPerDrink, price);
    }
}
