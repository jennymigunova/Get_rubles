public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int payment = 1100;
        boolean hasBonus = payment > 1000;

        if (hasBonus) {
            int bonus = payment / 100;
            int total = balance + payment + bonus;
            System.out.println("Бонус: " + bonus + " \nИтоговая сумма на счету клиента: " + total);

        } else {
            int total = balance + payment;
            System.out.println("Бонус: 0" + " \nИтоговая сумма на счету клиента: " + total);
        }
    }
}
