public class InsertionSort {

    public void insertionSort(int [] array)
    {

        for(int count=1;count<array.length;count++)
        {
            int num=array[count];
            int num2=count;
            while(array[num2-1]>num && num>0 )
            {
                array[num2]=array[num2+1];
                num2--;
            }

            array[num2]=num;
        }
    }
}
