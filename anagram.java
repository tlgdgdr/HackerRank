// Anagram

static boolean isAnagram(String a, String b) {

  boolean isAnagram = false;
  
  if(a.length()!= b.length()) isAnagram = false;
  
  char[] x = a.toLowerCase().toCharArray();
  char[] y = b.toLowerCase().toCharArray();
  java.util.Arrays.sort(x);
  java.util.Arrays.sort(y);
  a = new String(x);
  b = new String(y);
  
  if(a.equals(b)) isAnagram=true;
  
  return isAnagram;
  
}
