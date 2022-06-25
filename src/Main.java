public class Main {
    public static void main(String[] args) {

        int InitialCost = 34_957;
        int Pay = 590;
        int Bonus;
        if (Pay > 1000) {
            Bonus = Pay / 100;
        } else {
            Bonus = 0;
        }
        int Outcome = InitialCost + Pay + Bonus;
        System.out.println("На счете: " + InitialCost);
        System.out.println("Бонус: " + Bonus);

    }
}