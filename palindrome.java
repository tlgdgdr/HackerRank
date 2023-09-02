//Palindrome

public static void main(String[] args) {
  
  Scanner sc=new Scanner(System.in);
  String A=sc.next();
  char[] arr = A.toCharArray();
  boolean isPal = true;
  for(int i = 0; i<=arr.length/2; i++){
      if(arr[i]!=arr[arr.length-i-1]) isPal = false;
  }
  if(isPal) System.out.println("Yes");
  else System.out.println("No");
  
}
