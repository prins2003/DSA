public static int power(int x,int n){
        if(x==0 && n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        if(n==0){
            return 1;
        }
        int smallAns = power(x,n-1);
        return x*smallAns;
    }
