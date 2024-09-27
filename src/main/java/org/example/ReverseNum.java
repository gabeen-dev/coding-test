package org.example;

import java.util.Arrays;

public class ReverseNum {
    public static void main(String[] args) {
        ReverseNum sol = new ReverseNum();
        int[] diff = sol.solution(12345);
        System.out.println(Arrays.toString(diff));
    }


    public int[] solution(long n) {
        // 숫자를 문자열로 생성
        String str = String.valueOf(n);
        // 뒤집은 숫자 배열을 저장할 배열 생성
        int[] answer = new int[str.length()];

        for (int i = 0; i < str.length(); i++) {
            //str.length()는 5/ 문자열의 자리는 4이기에 -1/ 순차적으로 출력 -i/ 문자형으로 출력하기에 아스키코드 숫자값에서 '0'값을 빼줌
            answer[i] = str.charAt(str.length()-1 -i)-'0';
        }
        return answer;
    }
}


