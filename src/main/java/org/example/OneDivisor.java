package org.example;

public class OneDivisor {
    public static void main(String[] args) {
        OneDivisor sol = new OneDivisor();
        int diff = sol.solution(10);
        System.out.println(diff);
    }

        public int solution(int n) {
            int answer = 0;
            if(3 <= n && n <= 1000000) {
                for(int x = 1; x < n; x++){
                   if (n % x == 1) {
                      return x;
                   }
                }
            }
            return answer;
        }
}


