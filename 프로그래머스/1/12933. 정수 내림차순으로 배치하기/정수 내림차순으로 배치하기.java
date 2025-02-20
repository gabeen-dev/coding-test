import java.util.Arrays;

class Solution {
    public long solution(long n) {
        
        // 1. 정수를 문자열로 변환
        String str = Long.toString(n);
        
        // 2. 문자열을 문자 배열로 변환
        char[] digits = str.toCharArray();    
        
        // 3. 문자 배열을 오름차순으로 정렬
        Arrays.sort(digits);

        // 4. 내림차순으로 변환하기 위해 StringBuilder로 반전
        StringBuilder sb = new StringBuilder(new String(digits));
        sb.reverse();  // reverse로 내림차순 정렬
        
        // 5. 최종적으로 정수로 변환하여 반환
        return Long.parseLong(sb.toString());
    }
}


         //n 을 한자리씩 출력
            //형변환? Long.toString -> char[]로 한번더 변환(string은 불변하기에) v
            //아님 List<Integer>로? -> 한자리씩 저정을 어떻게?
         //을 내림차순으로 정렬
            //sort(오름차순정렬)을 내림차순으로 Stringbuilder -reverse
         //String형을 정수로 변환Long.parseLong
