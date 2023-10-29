import java.util.ArrayList;
import java.util.Scanner;

// Класс, в котором представлены компоненты для приготовления напитков.
public class Components {
    private short currentWater = 20000; // Изначальный объем воды в мл.
    private short currentMilk = 10000; // Изначальный объем молока в мл.
    private short currentCoffee = 3000; // Изначальный объем кофе в гр.
    private short currentTea = 100; // Изначальный объем чая в шт.
    private short currentSugar = 5000; // Изначальный объем сахара в гр.

    public Components() {
    }

    public short getCurrentWater() {
        return currentWater;
    }

    public short getCurrentMilk() {
        return currentMilk;
    }

    public short getCurrentCoffee() {
        return currentCoffee;
    }

    public short getCurrentTea() {
        return currentTea;
    }

    public short getCurrentSugar() {
        return currentSugar;
    }

    // Проверка на допустимо выбранное количество сахара.
    public int checkSugar(int sugar, Scanner in) {
        while (sugar < 0 || sugar > 4) {
            System.out.println("Amount of sugar (from 0 to 4 pieces)");
            sugar = in.nextInt();
        }
        return sugar;
    }

    // Пересчет затраченных компонентов после приготовления напитка.
    public void recalculateComponents(short water, short milk, short sugar, ArrayList<HotDrinksVendingMachine> beverages) {
        this.currentWater = (short) (getCurrentWater() - water);
        this.currentMilk = (short) (getCurrentMilk() - milk);
        this.currentSugar = (short) (getCurrentSugar() - sugar);
        if (beverages.get(beverages.size() - 1) instanceof Coffee) { // Если напиток кофе, то минусуем 7 гр кофе.
            this.currentCoffee = (short) (getCurrentCoffee() - 7);
        } else {
            this.currentTea = (short) (getCurrentTea() - 1); // Если чай, то минусуем один пакетик.
        }
    }

    // Проверка наличия необходимого кол-ва компонентов для дальнейшей работы.
    public boolean checkComponents() {
        if (this.currentWater > 200
            && this.currentMilk > 250
            && this.currentCoffee > 15
            && this.currentSugar > 30
            && this.currentTea > 2) {
            return true;
        } else {
            System.out.println("Some components need to be refilled...");
            return false;
        }
    }

    // Вывод текущего состояния компонентов на экран.
    public void componentsStatus() {
        System.out.printf("""
                Components current status information:\s
                Water  = %d/20000 ml
                Milk   = %d/10000 ml
                Coffee = %d/3000 g
                Tea    = %d/100 pcs
                Sugar  = %d/5000 g
                                
                """, currentWater, currentMilk, currentCoffee, currentTea, currentSugar);
    }
}
