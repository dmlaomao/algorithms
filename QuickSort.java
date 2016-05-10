public class QuickSort {
    public void sort(int[] a) {
        recur(a, 0, a.length - 1);
    }

    private void recur(int[] a, int s, int e) {
        int index = s;
        int i = s;
        int j = e;
        while (i < j) {
            if ((a[j] >= a[index])&&(j != index)) {
                j--;
                continue;
            }
            if (a[j] < a[index]) {
                swap(a, index, j);
                index = j;
            }
            if (a[i] > a[index]) {
                swap(a, index, i);
                index = i;
            }
            if ((a[i] <= a[index])&&(i != index)) {
                i++;
                continue;
            }
        }
        if (index - s >= 2) 
            recur(a, s, index-1);
        if (e - index >= 2) 
            recur(a, index + 1, e);
    }

    private void swap(int[] a, int i, int j) {
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    } 

    public static void main(String[] args) {
        int[] a = {5,3,6,4,2,7,0};
        new QuickSort().sort(a);
        for (int i : a)
            System.out.println(i);
    }
}
