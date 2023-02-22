public class Main {
    public static void main(String[] args) {
        //Сумма на счете у клиента
        int client_amount = 100;
        //Сумма пополнения
        int added_sum = 1100;

        //Итоговая сумма
        int result_sum = (added_sum >= 1000)
                ? client_amount + (added_sum / 100) + added_sum
                : client_amount + added_sum;

        System.out.println("Ваш балланс " + result_sum + " рублей.");
    }
}