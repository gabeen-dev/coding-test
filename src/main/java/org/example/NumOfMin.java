package org.example;

class NumOfMin {
    public static void main(String[] args) {
        NumOfMin sol = new NumOfMin();
        int diff = sol.solution(100,20);
        System.out.println(diff);
    }

    public int solution(int num1, int num2) {
        if (-50000 <= num1 && num1 <= 50000 && -50000 <= num2 && num2 <= 50000) {
            int answer = num1 - num2;
            return answer;
        } else {
            return 0;
        }
    }
}