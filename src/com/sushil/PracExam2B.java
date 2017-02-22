package com.sushil;

public class PracExam2B {
    // Problem 1 - tracing of a given code, no new code

    // Problem 2
    public static void TOH(int n, String start, String end, String spare) {
        if (n == 1) {
            System.out.printf("Move disc 1 from peg %s to peg %s\n", start, end);
            return;
        }
        TOH(n - 1, start, spare, end);
        System.out.printf("Move disc %d from peg %s to peg %s\n", n, start, end);
        TOH(n - 1, spare, end, start);
    }

    // Problem 3
    public static int numWays(int amt, int k, int[] D) {
        if (amt < 0 || k <= 0) return 0;
        if (amt == 0) return 1;

        return numWays(amt - D[k], k, D) + numWays(amt, k - 1, D);
    }

    // Problem 4
    public static int numWaysLtd(int amt, int q, int n, int p) {
        if (amt < 0) return 0;
        if (amt == 0) return 1;

        return (q > 0 ? numWaysLtd(amt - 25, q - 1, n, p) : 0)
                + (n > 0 ? numWaysLtd(amt - 5, 0, n - 1, p) : 0)
                + (p > 0 ? numWaysLtd(amt - 1, 0, 0, p - 1) : 0);
    }

    // Problem 5
    public static int[] merge(int[] A, int low, int mid, int high) {
        int n = A.length;
        int[] B = new int[n];
        for (int i = 0; i < n; i++) B[i] = A[i];

        int i = low, j = mid + 1, k = low;
        while (i <= mid && j <= high) {
            if (B[i] <= B[j])
                A[k] = B[i++];
            else
                A[k] = B[j++];
            k++;
        }

        while (i <= mid) A[k++] = B[i++];
        while (j <= high) A[k++] = B[j++];

        return A;
    }

    // Problem 6
    public static void mergeSort(int[] A, int low, int high) {
        if (low == high) return;
        int mid = low + (high - low) / 2;
        mergeSort(A, low, mid);
        mergeSort(A, mid + 1, high);
        merge(A, low, mid, high);
    }

    // Problem 7
    public static int partitionMidPivot(int[] A, int low, int high) {
        int i = low, j = high, pivot = A[low + (high-low)/2];
        while (i <= j) {
            while (A[i] < pivot) i++;
            while (A[j] > pivot) j--;
            if (i <= j) {
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
                i++;
                j--;
            }
        }
        return i;
    }

    public static int partition(int A[], int low, int high) {
        int pivot = A[low], lastLarger = high + 1;
        for (int i = high; i > low; i--) {
            if (A[i] > pivot) {
                lastLarger--;
                int temp = A[lastLarger];
                A[lastLarger] = A[i];
                A[i] = temp;
            }
        }
        lastLarger--;
        int temp = A[lastLarger];
        A[lastLarger] = A[low];
        A[low] = temp;
        return lastLarger;
    }

    public static int partitionHighPivot(int arr[], int low, int high)    {
        int pivot = arr[high];
        int i = (low-1); // index of smaller element
        for (int j=low; j<=high-1; j++) {
            // If current element is smaller than or equal to pivot
            if (arr[j] <= pivot) {
                i++;
                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }

    // Problem 8
    public static void quickSort(int [] A, int low, int high) {
        if (low == high) return;
        int mid = partition(A, low, high);
        quickSort(A, low, mid);
        quickSort(A, mid + 1, high);
    }

}
