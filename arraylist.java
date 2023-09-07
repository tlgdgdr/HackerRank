//ArrayList Solution from 30 days of code

public static void main(String[] args) {
  
  Scanner scan = new Scanner(System.in);
  int n = scan.nextInt();
  List<List<Integer>> list = new ArrayList<List<Integer>>();
  int i = 0;
  while(i<n){
      int d = scan.nextInt();
      List<Integer> innerList = new ArrayList<Integer>();
      for(int j=0;j<d;j++){
          int num = scan.nextInt();
          innerList.add(j,num);
      }
      list.add(i,innerList);
      i++;
  }
  
  int q = scan.nextInt();
  while(q>0){
      int x=scan.nextInt();
      int y=scan.nextInt();
      try{
          System.out.println(list.get(x-1).get(y-1));
      }catch(Exception e){
          System.out.println("ERROR!");
      }
      q--;
  }
}
  
  
        
        
    
        
        
    }
