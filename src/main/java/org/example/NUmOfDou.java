package org.example;

public class NUmOfDou {
    public static void main(String[] args) {
        NUmOfDou sol = new NUmOfDou();
        int diff = sol.solution(5,67);
        System.out.println(diff);
    }

//        public int solution(int num1, int num2) {
//            if (0<= num1 && num1 <=100 && 0 <= num2 && num2 <=100) {
//                double num3 = (double) num1;
//                double num4 = (double) num2;
//
//                double answer = (num3/num4)*1000;
//                return (int)answer;
//
//            } else {
//                return 0;
//            }
//        }
        public int solution(int num1, int num2) {
            if (0 <= num1 && num1 <= 100 && 0 <= num2 && num2 <= 100) {
                return (int)((double) num1 / num2 * 1000);
            } else {
                return 0;
            }
        }
    }





