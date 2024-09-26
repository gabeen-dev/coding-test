package org.example;

public class SeqGen {
    public static void main(String[] args) {
        SeqGen sol = new SeqGen();
        long[] diff = sol.solution(2,5);

        for (long num : diff) {
            System.out.print(num + " ");
        }
    }

        public long[] solution(int x, int n) {
            long[] answer = new long[n]; // 배열 크기 초기화

            //answer[i] 인덱스값필요하기에 int i = 0
            for(int i = 0; i < n; i++) {// 인덱스 길이가 n-1
                answer[i] = (long) x * (i+1);// 문제 제한값 때문에 설정
            }
            return answer;
        }
}
