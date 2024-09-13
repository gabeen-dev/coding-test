package org.example;

public class ArrangeSum {
    public static void main(String[] args) {
        ArrangeSum sol = new  ArrangeSum();
        double diff = sol.solution(new int[]{89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99});
        System.out.println(diff);


    }
        public double solution(int[] numbers) {
            double answer = 0;

            for (int i=0; i<numbers.length; i++) {
                if (0<= numbers[0] && numbers[0] <= 1000 && numbers.length <= 100) {
                    answer += numbers[i];
                }
            }
            return answer = answer/numbers.length;
        }

}
