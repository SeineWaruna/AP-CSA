class Scratch {
        void sort ( int arr[]){
            int n = arr.length;

            //One by one move boundary of unsorted subarray
            for (int i=0; i < n -1; i++) {
                // Find the minimum element in unsorted array
                int min_idx =i;
                for (int j= i+1; j < n; j++)
                    if (arr[j] < arr[min_idx])
                        min_idx = j;
                // Swap the found minimum element with first element
                int temp = arr[min_idx];
                arr[min_idx] = arr[i];
                arr[i] = temp;
            }
        }
        // Print out the array
        void printArray (int arr[]) {
            int n = arr.length;
            for (int i=0; i<n; i++)
                System.out.print(arr[i] + " ");
            System.out.println();
        }

        // Driver code to test above code
        public static void main(String[] args) {
            Scratch ob; // Create Object
            ob = new Scratch(); // Object Initiation >> Call Class Template >> Call Class Default Constructor
            int arr[] = {100,65,74,12,24};
            ob.sort(arr);
            ob.printArray(arr);
        }
    }
