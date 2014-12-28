package spoj;

public class MergeSort {

    /*int arr[] = new int[1000];
    int aux[] = new int[1000];
    int top;

    MergeSort() {
        top = -1;
    }
    */

    public void merge(int a[], int aux[], int l, int m, int h) {
        int i, j, k;

        for(k=l; k<=h; k++) {
            aux[k] = a[k];
        }

        i = l;
        j = m+1;
        for(k=l; k<=h; k++) {
            if(i>m) {
                a[k] = aux[j++];
            } else if(j>h) {
                a[k] = aux[i++];
            } else if(aux[i] < aux[j]) {
                a[k] = aux[i++];
            } else {
                a[k] = aux[j++];
            }
        }

    }

    public void sort(int a[], int aux[], int l, int h) {
        if(l>=h) {
            return;
        }
        int m;
        m = l + (h-l)/2;
        sort(a, aux, l, m);
        sort(a, aux, m+1, h);
        merge(a, aux, l, m, h);
    }
}
