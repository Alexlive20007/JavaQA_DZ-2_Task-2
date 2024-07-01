//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int currentBalance = 500; // текущая сумма на счету
        int topUpAmount = 1100; // сумма пополнения

        int bonusPer100 = topUpAmount / 100; // бонусные рубли за каждые 100 рублей

        int bonusAmount; // количество бонусных рублей
        if (topUpAmount > 1000) {
            bonusAmount = bonusPer100;
        } else {
            bonusAmount = 0;
        }

        int totalBalance = currentBalance + topUpAmount + bonusAmount; // итоговый счет

        System.out.println("Текущий счет: " + currentBalance + " рублей");
        System.out.println("Сумма пополнения: " + topUpAmount + " рублей");
        System.out.println("Бонусные рубли: " + bonusAmount + " рублей");
        System.out.println("Итоговый счет: " + totalBalance + " рублей");
    }
}