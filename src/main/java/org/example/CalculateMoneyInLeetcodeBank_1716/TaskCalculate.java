package org.example.CalculateMoneyInLeetcodeBank_1716;

public class TaskCalculate {
    public static void main(String[] args) {
        System.out.println(totalMoney(20));
    }
    public static int totalMoney(int n) {
        int sum = 0;
        int payment = 1;
        int coef = 1;
        for (int i = 1; i <= n; i++){
            System.out.println("До суммирования: " + sum);
            System.out.println("Взнос = " + payment);
            sum += payment;
            payment++;
            System.out.println("После суммирования: " + sum);
            if (i % 7 == 0){
                coef++;
                payment = coef;
            }
        }
        return sum;
    }
}
