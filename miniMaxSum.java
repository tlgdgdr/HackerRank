//Mini-Max Sum

public static void miniMaxSum(List<Integer> arr) {
        
        Collections.sort(arr);
        long sum=0;
        for(int i : arr) {
            sum += i;
        }
        long max = sum - arr.get(0);
        long min = sum - arr.get(4);
        System.out.println(min+" "+max);
        
}
