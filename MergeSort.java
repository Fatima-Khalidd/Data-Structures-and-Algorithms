

    public class MergeSort {

        // Main function to sort the array using merge sort
        public static void mergeSort(int[] array, int left, int right) {
            if (left < right) {
                // Find the middle point
                int mid = left + (right - left) / 2;


                mergeSort(array, left, mid);
                mergeSort(array, mid + 1, right);

                // Merge the sorted halves
                merge(array, left, mid, right);
            }
        }

        // Function to merge two halves of the array
        public static void merge(int[] array, int left, int mid, int right) {

            int leftSize = mid - left + 1;
            int rightSize = right - mid;


            int[] leftSubarray = new int[leftSize];
            int[] rightSubarray = new int[rightSize];


            System.arraycopy(array, left, leftSubarray, 0, leftSize);
            System.arraycopy(array, mid + 1, rightSubarray, 0, rightSize);

            int i = 0, j = 0, k = left;

            // Compare elements and merge them in sorted order
            while (i < leftSize && j < rightSize) {
                if (leftSubarray[i] <= rightSubarray[j]) {
                    array[k] = leftSubarray[i];
                    i++;
                } else {
                    array[k] = rightSubarray[j];
                    j++;
                }
                k++;
            }


            while (i < leftSize) {
                array[k] = leftSubarray[i];
                i++;
                k++;
            }


            while (j < rightSize) {
                array[k] = rightSubarray[j];
                j++;
                k++;
            }
        }

        // function to print the array
        public static void printArray(int[] array) {
            for (int num : array) {
                System.out.print(num + " ");
            }
            System.out.println();
        }



    }


