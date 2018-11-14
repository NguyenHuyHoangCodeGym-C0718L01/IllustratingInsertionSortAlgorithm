package com.company;

public class InsertionSortByStep {
    static int[] list = {4, 3, 2, 10, 12, 1, 5, 6};

    static void sort(int arr[])
    {
        int n = arr.length;
        for (int i=1; i<n; ++i)
        {
            System.out.println("Vòng lặp: "+i);
            System.out.println("Gán key = giá trị hiện tại");
            int key = arr[i];
            System.out.println("Giảm i 1 đơn vị");
            int j = i-1;

            System.out.println("Di chuyển các phần tử thuộc mảng từ 0 đến "+(i-1)+" mà lớn hơn key: "+key+" tới vị trí đằng trước vị trị hiện tại của chúng");
            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j>=0 && arr[j] > key)
            {
                System.out.println("Khi nào j >= 0 và phần tử"+arr[j]+">"+key+" thì gán giá trị phần tử arr[j+1] thành arr[j]="+arr[j] );
                arr[j+1] = arr[j];
                j = j-1;
                System.out.println("Giảm j 1 đơn vị, j="+j);
            }
            arr[j+1] = key;
        }
    }

    /* A utility function to print array of size n*/
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    // Driver method
    public static void main(String args[])
    {
        System.out.println("List before sort: ");
        printArray(list);

        sort(list);

        System.out.println("List after sort: ");
        printArray(list);
    }
}
