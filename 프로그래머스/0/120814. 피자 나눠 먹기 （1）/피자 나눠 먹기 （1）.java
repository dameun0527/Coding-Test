class Solution {
    public int solution(int n) {
        int pizza = n / 7;
        int r = n % 7;
        if (r == 0) 
            return pizza;
        else
            return pizza + 1;
    }
}