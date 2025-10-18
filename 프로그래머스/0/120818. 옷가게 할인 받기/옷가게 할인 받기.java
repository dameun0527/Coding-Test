class Solution {
    public int solution(int price) {
        int total = 0;
        if (price < 100000) {
            total = price;
        } else if (price >= 100000 && price < 300000) {
            total = (int) Math.floor(price * 0.95);
        } else if (price >= 300000 && price < 500000) {
            total = (int) Math.floor(price * 0.9);
        } else if (price >= 500000) {
            total = (int) Math.floor(price * 0.8);
        }
        return total;
    }
}