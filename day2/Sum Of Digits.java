class Solution {
    static int sumOfDigits(int n) {
        // code here
        int a =n;
        int c=0;
        while(a >0){
            c=c+a%10;
            a=a/10;
    }
    return c;
}
}