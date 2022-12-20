public class Main {
    public static void main(String[] args) {
        int price = 25_000; // стоимость билета в рублях
        int mile = 20; // стоимость одной мили в рублях
        int bonus = price / mile; // итоговая сумма начисленных миль

        System.out.println("Начислено миль:" + bonus);
    }
}
