import java.sql.Array;
import java.util.ArrayList;

public class SelectionSort {


int min=-1;

public void selectionSort(int list [], int key)
{
    for(int count=0;count<list.length;count++)
    {
        min=count;
        for(int index=count;index<list.length;index++)
        {
            if(list[index]<list[min])
            {
                min=index;
            }
            int temp=list[min];
            list[min]=index;
            index=temp;
        }
    }
}

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

}

