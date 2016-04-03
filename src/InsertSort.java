/**
 * Created by littlekang on 16/4/3.
 * 插入排序
 */
public class InsertSort {
    public static void insertSort(int[] arr) {
        if(arr==null || arr.length<2) {
            return ;
        }
        int i,j;
        for(i=1;i<arr.length;i++) {
            int temp = arr[i];
            for(j=i-1;j>=0&&arr[j]>temp;j--) {
                arr[j+1] = arr[j];
            }
            arr[j+1] = temp;
        }
    }
}
