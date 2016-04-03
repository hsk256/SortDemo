/**
 * Created by littlekang on 16/4/3.
 * 希尔排序
 */
public class ShellSort {
    public static void shellSort(int[] arr) {
        if(arr==null || arr.length<2) {
            return;
        }

        int j;
        int gap = arr.length;
        do {
            gap = gap/3+1;
            for(int i=gap;i<arr.length;i++) {
                int temp = arr[i];
                for(j=i-gap;j>=0&&arr[j]>temp;j-=gap) {
                    arr[j+gap] = arr[j];
                }
                arr[j+gap] = temp;
            }

        }while(gap>1);
    }
}
