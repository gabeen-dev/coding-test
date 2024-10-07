package org.example;

import java.util.Arrays;

public class StringToNumber {

    public static void main(String[] args) {

        StringToNumber sol = new StringToNumber();
        int result = sol.solution(String.valueOf(-1234));
        System.out.println(result);
    }

    public int solution(String s) {

        int answer = Integer.parseInt(s);;
        return answer;
    }
}
