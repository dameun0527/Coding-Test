class Solution {
    public int solution(int n) {
        for (int k = 1; k <= n; k++) {
            if ((6 * k) % n == 0) return k;
        } return -1;
    }
}