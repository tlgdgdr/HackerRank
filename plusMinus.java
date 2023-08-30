//Plus Minus

public static void plusMinus(List<Integer> arr) {
    
        float pos = 0f;
        float neg = 0f;
        float zero = 0f;
        for(int i : arr) {
            if(i>0) pos++;
            else if(i<0) neg++;
            else zero++;
        }
        float pRatio = pos/arr.size();
        float nRatio = neg/arr.size();
        float zRatio = zero/arr.size();
        System.out.printf("%.6f\n",pRatio);
        System.out.printf("%.6f\n",nRatio);
        System.out.printf("%.6f",zRatio);
}
