package org.example;

import java.util.ArrayList;

public class NumarrPlus {
    public static void main(String[] args) {
        org.example.NumarrPlus sol = new org.example.NumarrPlus();
        int diff = sol.solution(1234);
        System.out.println(diff);
    }

        public int solution(int n) {
        // 1. 숫자를 문자열로 변환한 후 문자 배열로 변환
        String numberString = Integer.toString(n);
        char[] digitsArray = numberString.toCharArray(); // 각 자릿수를 문자 배열로 저장


            int sum =0;

        // 2. 배열을 순회하면서 각 문자(char)를 정수(int)로 변환하고 더하기
        for(char digit : digitsArray) {
            sum += Character.getNumericValue(digit); // 각 문자를 숫자로 변환
        }
        return sum;
        }

}
