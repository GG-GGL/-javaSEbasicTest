//数组合并 并按升序顺序排列
import java.util.Arrays;
public class ArrayMerge{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int[] arrayA = {1,7,9,11,13,15,17,19};
	int[] arrayB = {2,4,6,8,10};
	arrayA = Arrays.copyOf(arrayA,arrayA.length+arrayB.length);
	int[] arrayC = new int[arrayA.length+arrayB.length];
	System.arraycopy(arrayB, 0, arrayA, 8, 5);
	arrayC = arrayA;
	for(int i = 0; i<arrayC.length-1;i++)
    {
          for(int j = i+1;j < arrayC.length;j++)
        {
              if(arrayC[i]>arrayC[j])
              {
               int num = arrayC[j];
               arrayC[j] = arrayC[i];
               arrayC[i] = num;
              }             

        }
    }
	System.out.println(Arrays.toString(arrayC));
	}
}