package a03insertDemo;

public class insertDemo {
    public static void main(String[] args) {

        int[] arr = {101, 34, 119, 1, 23, 89,54,26,93,17,77,31,44,55,20};
        //调用插入排序
        //1.找到无序的那一组数组的开始索引
        int startIndex = -1;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] > arr[i + 1]){
                startIndex = i + 1;
                break;
            }
        }
        //2.把这个数插入到前面有序的数组中
        for (int i = startIndex; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[j] < arr[j - 1]){
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }
        printArr(arr);
        //3.重复以上的过程，直到整个数组有序排列
    }
    private static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
