// Counting Sort 

public static List<Integer> countingSort(List<Integer> arr) {
    
    List<Integer> count = new ArrayList<Integer>(Collections.nCopies(100, 0));
    int val=0;
    for(int i=0;i<arr.size();i++){
        val = arr.get(i);
        count.set(val, count.get(val)+1);
    }
    return count;

}
