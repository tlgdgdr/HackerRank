//Diagonal Difference

public static int diagonalDifference(List<List<Integer>> arr) {

    //00,11,22,33,...,nn + 0n,1n-1,2n-2,nn-n
    int sumLeft =0;
    int sumRight=0;
    int n = arr.size();
    
    for(int i=0;i<n;i++) {
        sumLeft += arr.get(i).get(i);
        sumRight += arr.get(i).get(n-i-1);
    }
    
    return Math.abs(sumLeft-sumRight);
    
}
