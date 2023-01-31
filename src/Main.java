public class Main {
    public static void main(String[] args) {

        /* Условие
        Авиаперевозчики предлагают различные бонусные программы, начисляющие бесплатные мили за перелёты.
        Формула расчёта следующая: за каждые 20 рублей, потраченные на билет, начисляется 1 миля. Дробные мили не начисляются.


        Ваша задача
        Создать приложение, рассчитывающее количество начисленных миль за купленный билет.
        Стоимость билета вы выбираете сами — сами заполняете переменную, в которой она будет храниться.
         */

        int ticketPrice = 1503;
        int bonusPrice = 20;
        int bonus = ticketPrice / bonusPrice;

        System.out.println("Количество начисленных бонусов за последнюю покупку " + bonus);
    }
}