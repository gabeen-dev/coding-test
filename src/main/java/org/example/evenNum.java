package org.example;

public class evenNum {
    public static void main(String[] args) {
        evenNum sol = new evenNum();
        int diff = sol.solution(10);
        System.out.println(diff);
    }

        public int solution(int n) {
            int answer =0;
            for(int i=1; i<=n; i++){
                if (i %2 == 0){
                    answer += i;
                }
            }
            return answer;
        }
}