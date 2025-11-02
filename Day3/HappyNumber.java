class Solution {
    public int squares(int a) {
        int sum = 0;
        while (a != 0) {
            int b = a % 10;
            sum += b * b;
            a /= 10;
        }
        return sum;
    }

    public boolean isHappy(int n) {
        while (n != 1 && n != 4) {
            n = squares(n);
        }
        return n == 1;
    }
}
