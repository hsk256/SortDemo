/**
 * Created by littlekang on 16/4/2.
 * 选择排序
 */
public class SelectSort {
    public static void sort(int[] arr) {
        if(arr==null || arr.length<2) {
            return ;
        }

        for(int i=0;i<arr.length-1;i++) {
            int min = i;
            for(int j=i+1;j<arr.length;j++) {
                if(arr[min]>arr[j]) {
                    min = j;
                }
            }
            if(min!=i) {
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
    }


}
