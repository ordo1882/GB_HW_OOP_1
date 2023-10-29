import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Components components = new Components();
        ArrayList<HotDrinksVendingMachine> beverages = new ArrayList<>();
        boolean isWorking = true;
        int op;
        int sugar = -1;
        Scanner in = new Scanner(System.in);
        while (isWorking && components.checkComponents()) { // Проверка наличия необходимого кол-ва компонентов для дальнейшей работы.
            System.out.println("Make a choice:\n1 - Espresso\n2 - Americano\n3 - Cappuccino\n4 - Latte\n5 - Tea\n9 - Machine Status\n0 - Quit");
            op = in.nextInt();
            switch (op) {
                case 1 -> {
                    sugar = components.checkSugar(sugar, in); // Проверка на допустимо выбранное количество сахара.
                    // Готовим эспрессо.
                    beverages.add(new Coffee("Espresso", (short) 25, (short) (sugar * 5), 2.50, (byte) 88, (short) 0));
                    ProductPreparing.something(components, beverages); // Вызов метода приготовления продукта.
                }
                case 2 -> {
                    sugar = components.checkSugar(sugar, in);
                    // Готовим американо.
                    beverages.add(new Coffee("Americano", (short) 150, (short) (sugar * 5), 3.50, (byte) 86, (short) 0));
                    ProductPreparing.something(components, beverages);
                }
                case 3 -> {
                    sugar = components.checkSugar(sugar, in);
                    // Готовим капуччино.
                    beverages.add(new Coffee("Cappuccino", (short) 25, (short) (sugar * 5), 4.50, (byte) 62, (short) 125));
                    ProductPreparing.something(components, beverages);
                }
                case 4 -> {
                    sugar = components.checkSugar(sugar, in);
                    // Готовим латте.
                    beverages.add(new Coffee("Latte", (short) 25, (short) (sugar * 5), 5.50, (byte) 58, (short) 225));
                    ProductPreparing.something(components, beverages);
                }
                case 5 -> {
                    sugar = components.checkSugar(sugar, in);
                    // Готовим чай.
                    beverages.add(new HotDrinksVendingMachine("Tea", (short) 200, (short) (sugar * 5), 2.00, (short) 0));
                    ProductPreparing.something(components, beverages);
                }
                case 9 -> components.componentsStatus(); // Вывод текущего состояния компонентов на экран.
                case 0 -> isWorking = false;
                default -> System.out.println("Incorrect prompt.");
            }
            sugar = -1;
        }
    }
}