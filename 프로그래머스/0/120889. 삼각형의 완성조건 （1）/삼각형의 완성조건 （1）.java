class Solution {
    public int solution(int[] sides) {
        int sum = sides[0] + sides[1] + sides[2];
        int max = Math.max(sides[0], Math.max(sides[1], sides[2]));
        
        int result = sum - max;
        
        if (result > max) {
            return 1;
        } else return 2;
    }
}