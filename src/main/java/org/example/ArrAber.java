package org.example;

public class ArrAber {
    public static void main(String[] args) {
        ArrAber sol = new ArrAber();
        double diff = sol.solution(new int[]{3, 2, 7, 4,});
        System.out.println(diff);
    }


        public double solution(int[] arr) {

            double answer = 0;

            for (int i = 0; i < arr.length; i++) {

                answer += arr[i];

               // answer += i;
            }
            return answer/arr.length;
        }
}



