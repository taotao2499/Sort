package a04quickSortDemo;

public class quickSortDemo {
    public static void main(String[] args) {
        int[] arr = {6,1,2,7,9,3,4,5,10,8};
        quickSort( arr,0,arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void quickSort(int[] arr,int l,int r){
        int start = l;
        int end = r;
        //递归的出口

        if (start>end){
            return;
        }
        //
        int baceNumber = arr[l];
        while (start !=end){
            //从后往前找比基准数小的数
            while (true){
                if  (end<=start || arr[end]<baceNumber){
                    break;
                }
                end--;
            }
            //从前往后找比基准数大的数
            while (true){
                if (end<=start || arr[start]>baceNumber){
                    break;
                }
                start++;
            }
            //把基准数放到中间位置
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }

        quickSort(arr, l, start - 1);
        quickSort(arr, start + 1, r);
    }
}
