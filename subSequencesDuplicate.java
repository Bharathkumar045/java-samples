package recrussion;

import java.util.ArrayList;

public class subSequencesDuplicate {
  public static void main(String[] args) {
    int[] array={1,1,1,2,2};
    ArrayList<ArrayList<Integer>> result=subsequencesDuplicate(array);
     for(ArrayList<Integer> list:result)
    {
      System.out.println(list);
    }
  }

  public static ArrayList<ArrayList<Integer>> subsequencesDuplicate(int[] arr)
  {
    ArrayList<ArrayList<Integer>> outer=new ArrayList<>();
    outer.add(new ArrayList<>());
    int start=0;
    int end=0;
    for(int i=0;i<arr.length;i++)
    {
      start=0;
      if(i>0&&arr[i]==arr[i-1])
      {
        start=end;
      }
      end=outer.size();
      for(int j=start;j<end;j++)
      {
        ArrayList<Integer> inner =new ArrayList<>(outer.get(j));
        inner.add(arr[i]);
        outer.add(inner);
      }
    }
    return outer;
  }
}
/*
 * output:
[]
[1]
[1, 1]
[1, 1, 1]
[2]
[1, 2]
[1, 1, 2]
[1, 1, 1, 2]
[2, 2]
[1, 2, 2]
[1, 1, 2, 2]
[1, 1, 1, 2, 2]
 */


