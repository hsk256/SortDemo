import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by littlekang on 16/4/1.
 */
public class Main {
    public static void main(String[] args) {
        int len = 10;
        int range = 30;
        long start =  System.currentTimeMillis();
        int[] mergeArr = generateArr(len,range);
        MergeSort.mergeSort(mergeArr);
        long end = System.currentTimeMillis();
        System.out.println("归并排序时间:"+(end-start));
        printArray(mergeArr);

    }

    public static int[] generateArr(int len,int range) {
        if(len<1) {
            return null;
        }
        int[] arr = new int[len];
        for(int i=0;i<len;i++) {
            arr[i] = (int) (Math.random()*range);
        }
        return arr;
    }

    public static void printArray(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
