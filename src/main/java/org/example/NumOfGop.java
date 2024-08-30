package org.example;

public class NumOfGop {
    public static void main(String[] args) {
        NumOfGop sol = new NumOfGop();
        int diff = sol.solution(100,20);
        System.out.println(diff);
    }
    public int solution(int num1, int num2) {
        if(0<=num1 && num1<=100 && 0<=num2 && num2<=100){
            int answer = num1*num2;
            return answer;
        } else{
            return 0;
        }
    }
}
