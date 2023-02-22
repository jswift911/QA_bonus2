public class Main {
    public static void main(String[] args) {
        //Сумма на счете у клиента
        int clientAmount = 100;
        //Сумма пополнения
        int addedSum = 1100;
        //Бонусы
        int bonus = (addedSum >= 1000) ? addedSum / 100 : 0;

        //Итоговая сумма
        int resultSum = (addedSum >= 1000)
                ? clientAmount + bonus + addedSum
                : clientAmount + addedSum;

        System.out.println("Ваш балланс " + resultSum + " рублей.");
        System.out.println("Ваш бонус " + bonus + " рублей.");
    }
}