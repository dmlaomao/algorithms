//merge and sort
//dmlaomao
public class Msort {
    public void sort(int[] a, int s, int e) {
        int m = (e - s + 1)/2 + s;
        if (e - s > 1) { 
            sort(a, s, m-1);
            sort(a, m, e);
        }
        merge(a, s, e, m);
    } 
    
    private void merge(int[] a, int s, int e, int m) {
        int[] tmp = new int[e - s + 1];
        int cur = a[m];
        int index = 0;
        int i = s; int j = m;
        while (index < e - s + 1) {
            while (i < m) {
                if (a[i] <= cur) 
                    tmp[index++] = a[i++]; 
                else {
                    cur = a[i];
                    break;
                }
            }
            while (j <= e) {
                if (a[j] <= cur) 
                    tmp[index++] = a[j++]; 
                else {
                    cur = a[j];
                    break;
                }
            }
        }
        for (int k = s; k <= e; k++) 
            a[k] = tmp[k-s];
    }

    //test case
    public static void main(String[] args) {
        int[] a = {5, 4, 3, 6};
        new Msort().sort(a, 0, a.length - 1);
        for (int i : a)
            System.out.println(i);
    }
}
