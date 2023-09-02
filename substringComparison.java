//Substring Comparison

public static String getSmallestAndLargest(String s, int k) {
  
  String smallest = "";
  String largest = "";
  String lex = s.substring(0,k);
  smallest = lex;
  largest = lex;
  
  for(int i=0;i<s.length()-k+1;i++) { 
      lex = s.substring(i,i+k);
      if(lex.compareTo(largest)>0) largest = lex;
      else if(lex.compareTo(smallest)<0) smallest = lex;
  }
  
  return smallest + "\n" + largest;
}
