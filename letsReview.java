//30 days of code - Let's Review

public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);
  
  String even = "";
  String odd = "";
  int n = scan.nextInt();
  while(n>0){
      String s = scan.next();
      char[] arr = s.toCharArray();
      for(int i =0;i<arr.length;i++){
          if(i%2==0)  even += arr[i];
          else odd += arr[i];
      }
      
      System.out.println(even+" "+odd);
      n--;
      even = "";
      odd = "";
  }
}
