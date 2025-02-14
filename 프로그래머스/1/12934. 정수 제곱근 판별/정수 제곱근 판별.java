class Solution {
    public long solution(long n) {
        long answer = 0;
        
        if (1 <= n && n <= 50000000000000L) {
            long i = 1;
            while (i*i < n) {
                i++;
            }   
             if (i* i != n)  {
                 return -1;
                 
             } else{
                 i++;
                 return i*i;
             }
        }
        return -1;
    }
}