class Solution {
    public boolean isPalindrome(int x) {
        int n= x;
        if(x<0){
            n=-n;
        }
        int sum =0;
        while(n!=0){
            int a= n%10;
            sum=sum*10+a;
            n=n/10;
        }
        if (x==sum){
            return true;
        }
        else{
            return false;
        }
    }
}