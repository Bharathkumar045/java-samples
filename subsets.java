package recrussion;

import java.util.ArrayList;

public class subsets {
   //it is actually a ubSequence problem
  public static void main(String[] args) {
    int[] arr={1,2,3};
    ArrayList<ArrayList<Integer>> ans=subsequences(arr);
    for(ArrayList<Integer> list:ans)
    {
      System.out.println(list);
    }

  }

  public static ArrayList<ArrayList<Integer>> subsequences(int[] arr)
  {
    ArrayList<ArrayList<Integer>> outer=new ArrayList<>();
    outer.add(new ArrayList<>());
    for(int num:arr)
    {
      int n=outer.size();
      for(int i=0;i<n;i++)
      {
        ArrayList<Integer> inner =new ArrayList<>(outer.get(i));
        inner.add(num);
        outer.add(inner);
      }
    }
    return outer;
  }
}


/*
output:
[]
[1]
[2]
[1, 2]
[3]
[1, 3]
[2, 3]
[1, 2, 3]
 */