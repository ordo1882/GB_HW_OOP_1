import java.util.ArrayList;

public class ProductPreparing {
    // Реализация приготовления продукта.
    public static void something(Components components, ArrayList<HotDrinksVendingMachine> beverages) {
        beverages.get(beverages.size() - 1).getProduct(); // Вывод заказа на экран.
        components.recalculateComponents(beverages.get(beverages.size() - 1).getWater(),
                beverages.get(beverages.size() - 1).getMilkPerDrink(),
                beverages.get(beverages.size() - 1).getSugarPerDrink(), beverages); // Пересчет оставшихся компонентов.
    }
}
