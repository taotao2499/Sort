package BubbleDemo;

public class BubbleDemo1 {
    public static void main(String[] args) {

        //冒泡排序
        //核心：
        //每次比较两个相邻的元素，如果前面的数比后面的数大，交换这两个数
        //经过一轮比较后，能够保证最大的数排在最后面
        //重复以上的过程，直到整个数组有序排列
        //需求：定义一个方法利用冒泡排序，实现从小到大排序
        //数据如下：{24,69,80,57,13}
        int[] arr = {24,69,80,57,13};

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        printArr(arr);
    }

    private static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
