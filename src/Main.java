public class Main {
    public static void main(String[] args) {
        int amount = 100;
        boolean put = true;
        int x = 1100;
        if (x < 1000) {
            System.out.println("Бонусов нет");
        } else {
            System.out.println("Бонус 1 рубль");
        }
        int bonus = amount + 1100 + 11;

        if (bonus < 1) {
            bonus = 1;
        }

        System.out.println("сумма рублей:" + bonus);
    }
}