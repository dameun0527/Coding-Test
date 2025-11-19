class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        // 분모 통일하기
        int numer = numer1 * denom2 + numer2 * denom1;
        int denom = denom1 * denom2;
        
        // 최대공약수
        int g = gcd(numer, denom);
        
        // 약분
        numer /= g;
        denom /= g;
        
        return new int[]{numer, denom};
    
    }
    
    private int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }
}