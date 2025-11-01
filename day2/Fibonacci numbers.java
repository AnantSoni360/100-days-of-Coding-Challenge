class Solution {
    public int fibo(int a){
        int d =0;
        int e =1;
        int f =0;
        for(int i =1;i<a;i++){
            f = d +e ;
            d=e;
            e=f;
        }
        return f;
    }
    public int fib(int n) {
        int c=n;
        if (c==1){
            return 1;
        }
        else{int x=fibo(c);
        return x;}
    }

}