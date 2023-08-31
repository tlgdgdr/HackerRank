//Lonely Integer

public static int lonelyinteger(List<Integer> a) {
  int unique=a.get(0);
  for(int i : a) {
      if(Collections.frequency(a,i)==1)
          unique = i;
  }
  return unique;
}
