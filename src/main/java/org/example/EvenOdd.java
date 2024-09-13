package org.example;

public class EvenOdd {
    public static void main(String[] args) {
        EvenOdd sol = new EvenOdd();
        String diff = sol.solution(99);
        System.out.println(diff);

    }

        public String solution(int num) {
            String answer1 = "Even";
            String answer2 = "Odd";

            if (num%2 == 0){
                return answer1;
            }else {
                return answer2;
            }
        }


}
