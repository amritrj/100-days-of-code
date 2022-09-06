class Solution {
    public int subtractProductAndSum(int n) {
        int s=0;
        int p=1;
        int a=0;
        while (n>0){
            int x=n%10;
            s=s+x;
            p=p*x;
            n=n/10;
        }
        a=p-s;
        return a;
        
    }
}