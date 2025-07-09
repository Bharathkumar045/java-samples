package recrussion;
import java.util.*;

public class combination1 {
  public static void main(String[] args) {
    int[] array={1,2,3,4};
    int target=2;
    ArrayList<ArrayList<Integer>> result=combinationProblem(array,target);
    for(ArrayList<Integer> list:result)
    {
      System.out.println(list);
    }
  }

  public static ArrayList<ArrayList<Integer>> combinationProblem(int[] arr,int target)
  {
    ArrayList<ArrayList<Integer>> outer=new ArrayList<>();
    ArrayList<ArrayList<Integer>> answer=new ArrayList<>();
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
        int sum=0;
        for(int num:inner)
        {
          sum+=num;
        }
        if(sum==target)
        {
          answer.add(inner);
        }
      }
    }
    return answer;
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


