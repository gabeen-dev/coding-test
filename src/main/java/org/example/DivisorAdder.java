package org.example;

public class DivisorAdder {
    public static void main(String[] args) {
        DivisorAdder sol = new DivisorAdder();
        int diff = sol.solution(12);
        System.out.println(diff);
    }

    public int solution(int n) {
        int answer = 0;
        for (int i =1; i<= n; i++){
            if (n%i == 0){
                answer += i;
            }
        }
        return answer;
    }
}
