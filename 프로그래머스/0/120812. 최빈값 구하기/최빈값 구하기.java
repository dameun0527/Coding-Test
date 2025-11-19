class Solution {
    public int solution(int[] array) {
        int[] freq = new int[1001];
        
        for (int x : array) {
            freq[x]++;
        }
        
        int mode = -1;
        int max = 0;
        boolean duplicate = false;
        
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > max) {
                max = freq[i];
                mode = i;
                duplicate = false;
            } else if (freq[i] == max && freq[i] != 0) {
                duplicate = true;
            }
        }
        return duplicate ? -1 : mode;
    }
}