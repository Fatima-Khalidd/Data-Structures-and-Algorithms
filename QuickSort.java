 public class QuickSort {

        // Main function to sort the array using quicksort
        public static void quickSort(int[] array, int low, int high) {
            if (low < high) {

                int pivotIndex = partition(array, low, high);


                quickSort(array, low, pivotIndex - 1);  // Left subarray
                quickSort(array, pivotIndex + 1, high); // Right subarray
            }
        }

        // Function to partition the array
        private static int partition(int[] array, int low, int high) {

            int pivot = array[high];


            int smallerElementIndex = low - 1;


            for (int i = low; i < high; i++) {

                if (array[i] <= pivot) {

                    smallerElementIndex++;


                    swap(array, smallerElementIndex, i);
                }
            }


            swap(array, smallerElementIndex + 1, high);

            return smallerElementIndex + 1;
        }

        //  function to swap two elements in the array
        private static void swap(int[] array, int i, int j) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }

        //  function to print the array
        public static void printArray(int[] array) {
            for (int num : array) {
                System.out.print(num + " ");
            }
            System.out.println();
        }


    }


