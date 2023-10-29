public class Coffee extends HotDrinksVendingMachine {
    private short volume;
    private byte temperatureCelsius;

    public short getVolume() {
        return volume;
    }

    public void setVolume(short volume) {
        this.volume = volume;
    }

    public byte getTemperatureCelsius() {
        return temperatureCelsius;
    }

    public void setTemperatureCelsius(byte temperatureCelsius) {
        this.temperatureCelsius = temperatureCelsius;
    }

    public Coffee(String name, short water, short sugarPerDrink, double price, byte temperatureCelsius, short milkPerDrink) {
        super(name, water, sugarPerDrink, price, milkPerDrink);
        this.temperatureCelsius = temperatureCelsius;
        this.volume = (short) (water + milkPerDrink);
    }

    @Override
    public void getProduct() {
        System.out.printf("""
                Take your order:\s
                Beverage    = %s
                Size        = %d ml
                Sugar       = %d g
                Temperature = %d
                Price       = $%.2f
                                
                """, getName(), getVolume(), getSugarPerDrink(), temperatureCelsius, getPrice());
    }
}
