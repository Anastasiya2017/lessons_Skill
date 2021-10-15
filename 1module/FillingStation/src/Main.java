public class Main {
    public static void main(String[] args) {
        System.out.println("Система расчета стоимости топлива");

        int fuelType = 95;
        int amount = 50;

        double fuel92price = 60.2;
        double fuel95price = 67.33;

        double fuelPrice = 0;
        if(fuelType == 92) {
            fuelPrice = fuel92price;
        }

        if(fuelType == 95) {
            fuelPrice = 95;
        }

        System.out.println("Цена выбранного топлива: " + fuelPrice + "руб.");
    }
}
