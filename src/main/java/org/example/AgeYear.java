package org.example;

public class AgeYear {
    public static void main(String[] args) {
        AgeYear sol = new AgeYear();
        int diff = sol.solution(32);
        System.out.println(diff);
    }
    public int solution(int age) {
        if( 0 <= age && age <= 120) {
            int answer = 2024 - age + 1;
            return answer;
        }else {
            return 0;
        }
    }
}
