
/**
 * Created by littlekang on 16/4/1.
 */
public class Main {
    public static void main(String[] args) {
        int len = 100000;
        int range = 300000;

        int[] mergeArr = generateArr(len,range);
        long start =  System.currentTimeMillis();
        MergeSort.mergeSort(mergeArr);
        long end = System.currentTimeMillis();
        System.out.println("归并排序时间:"+(end-start));
//        printArray(mergeArr);
        //快速排序
        int[] quickArr = generateArr(len,range);
        long start1=  System.currentTimeMillis();
        QuickSort.quickSort(quickArr);
        long end1 = System.currentTimeMillis();
        System.out.println("快速排序时间:"+(end1-start1));
//        printArray(quickArr);
//        冒泡排序
        int[] bubbleArr = generateArr(len,range);
        long start2=  System.currentTimeMillis();
        BubbleSort.bubbleSort(bubbleArr);
        long end2 = System.currentTimeMillis();
        System.out.println("冒泡排序时间:"+(end2-start2));
//        printArray(bubbleArr);

        int[] selectArr = generateArr(len,range);
        long start3=  System.currentTimeMillis();
        SelectSort.sort(selectArr);
        long end3 = System.currentTimeMillis();
        System.out.println("选择排序时间:"+(end3-start3));
        //printArray(selectArr);
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
