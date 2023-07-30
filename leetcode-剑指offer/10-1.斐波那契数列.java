class Solution {
    public int fib(int n) {
        if (0 == n) return 0;
        if (1 == n) return 1;
        int first = 0;
        int second = 1;
        int loop = n - 1;
        while (loop > 0) {
            --loop;
            int temp = (first + second) % (int) (1e9 + 7);
            first = second;
            second = temp;
        }

        return second;
    }
}