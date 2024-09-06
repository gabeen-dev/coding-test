package org.example;

public class NumTure {

    public static void main(String[] args) {
        NumTure sol = new NumTure();
        int diff = sol.solution(100,20);
        System.out.println(diff);
    }

    public int solution(int num1, int num2) {
        if (0<=num1 && num1<=10000 && 0<=num2 && num2<=10000 && num1 == num2){
            return 1;

        } else {
            return -1;
        }
    }

}
