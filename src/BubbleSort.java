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
        for(int i=0;i<arr.length && flag;i++) {
            flag = false;
            for(int j=i+1;j<arr.length;j++) {
                if(arr[j]<arr[i]) {
                    swap(arr,j,i);
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
