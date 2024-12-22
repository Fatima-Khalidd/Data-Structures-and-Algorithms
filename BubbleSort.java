public class BubbleSort {

    public void bubbleSort(int [] array)
    {

        for(int count=array.length;count>=0;count--)
        {
            for(int index=0;index<count;index++)
            {
                if(array[index]<array[index+1])
                {
                    int temp=array[index];
                    array[index]=array[index+1];
                    array[index+1]=temp;
                }
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
