/**
 * Created by littlekang on 16/4/11.
 * 堆排序
 */
public class HeapSort {
    public static void heapSort(int[] arr) {
        int n = arr.length;
        for(int i=n/2;i>=0;i--) {
            heapAdjust(arr,i,n);
        }

        for(int i=n-1;i>0;i--) {
            swap(arr,0,i);
            heapAdjust(arr,0,i);
        }
    }

    public static void heapAdjust(int[] arr,int index,int n) {
        int temp = arr[index];
        int childLeft=0;
        for(;2*index+1<n;index=childLeft) {
            childLeft = 2*index+1;
            if(childLeft!=n-1 && arr[childLeft]<arr[childLeft+1]) {
                childLeft++;
            }
            if(temp>arr[childLeft]) {
                break;
            }
            arr[index] = arr[childLeft];
            index = childLeft;
        }
        arr[index] = temp;
    }

    public static void swap(int[] arr,int a,int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
