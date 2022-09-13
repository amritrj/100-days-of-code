class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        HashMap<Integer, Integer> map= new HashMap<>();
        for(int i=lowLimit; i<=highLimit;i++){
            int sum=0;
            int val=i;
            while(val!=0){
                sum+=val%10;
                val=val/10;
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        int max=Integer.MIN_VALUE;
        for(int x: map.values()){
           max=Math.max(max,x); 
        }
        return max;
    }
}
        