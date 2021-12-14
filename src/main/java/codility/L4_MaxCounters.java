class Solution {
    public int[] solution(int N, int[] A) {
        int []counters = new int[N+1];
        int []toReturn = new int[N];
        int max = 0;
        int maxCount = 0;

        for(int i=0; i<A.length; i++){
            if(A[i] <= N){
                counters[A[i]]++;
                if(counters[A[i]] > max)
                    max = counters[A[i]];
            } else {
                if(max > 0){
                    maxCount += max;
                    max = 0;
                    counters = new int[N+1];
                }
            }
        }

        for(int i=1; i<N+1; i++){
            toReturn[i-1] = counters[i]+maxCount;
        }
        return toReturn;
    }
}