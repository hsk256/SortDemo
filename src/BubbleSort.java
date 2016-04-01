/**
 * Created by littlekang on 16/4/1.
 * 冒泡排序
 */
public class BubbleSort {

    public static void bubbleSort(int[] arr) {
        if(arr==null || arr.length<2) {
            return ;
        }
        boolean flag = true;
        for(int i=0;i<arr.length-1 && flag;i++) {
            flag = false;
            for(int j=arr.length-1;j>i;j--) {
                if(arr[j]<arr[j-1]) {
                    swap(arr,j,j-1);
                    flag = true;
                }
            }
        }
    }
    public static void swap(int[] arr,int i,int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
