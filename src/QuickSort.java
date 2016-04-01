/**
 * Created by littlekang on 16/4/1.
 * 快速排序
 */
public class QuickSort {

    public static void quickSort(int[] arr) {
        if(arr==null || arr.length<2) {
            return ;
        }
        process(arr,0,arr.length-1);
    }
/**********************方式一实现***************************/
    public static void process(int[] arr,int left,int right) {
        if(left<right) {
            int mid = partition(arr,left,right);
            process(arr,left,mid);
            process(arr,mid+1,right);
        }
    }

    /**
     * 返回一次划分后数轴元素的位置
     * @param arr
     * @param left
     * @param right
     * @return
     */
    public static int partition(int[] arr,int left,int right) {
        int pivot = arr[left];
        int l = left; //头指针
        int r = right; //尾指针
        if(left<right) {
            while(l<r) {
                while(l<r && pivot<=arr[r]) {
                    r--;
                }
                if(l<r) {
                    arr[l] = arr[r];
                }
                while(l<r && pivot>=arr[l]) {
                    l++;
                }
                if(l<r) {
                    arr[r] = arr[l];
                }
            }
            arr[l] = pivot;
        }
        return l;
    }
}
