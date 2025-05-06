package sfDemo;

public class a1BasicSerchDemo3 {
    public static void main(String[] args) {

        /*
                    分块查找
            核心思想：
            块内无序，块间有序
            实现步骤：
            1.创建数组blockArr存放每一个块对象的信息
            2.先查找blockArr确定要查找的数据属于哪一块
            3.再单独遍历这一块数据即可
                */
        int[] arr = {16, 5, 9, 12, 21, 18,
                32, 23, 37, 26, 45, 34,
                50, 48, 61, 52, 73, 66};


        //1.创建数组blockArr存放每一个块对象的信息
        Block b1 = new Block(21, 0, 5);
        Block b2 = new Block(45, 6, 11);
        Block b3 = new Block(73, 12, 17);
        //创建数组
        Block[] blockArr = {b1, b2, b3};
        //2.先查找blockArr确定要查找的数据属于哪一块
        int number = 37;
        //
        int index = getIndex(blockArr,arr,number);

        System.out.println(index);


    }

    private static int getIndex(Block[] blockArr, int[] arr, int number) {
        //1.确定要查找的块
        int indexBlock = findIndexBlock(blockArr, number);
        if (indexBlock == -1){
            return -1;
        }
        //2.获取要查找的块
        int startIndex = blockArr[indexBlock].getStartIndex();
        int endIndex = blockArr[indexBlock].getEndIndex();

        //3.遍历
        for (int i = startIndex; i <= endIndex; i++) {
            if (arr[i] == number){
                return i;
            }
        }
        return -1;
    }
    public static int findIndexBlock(Block[] blockArr, int number) {
        for (int i = 0; i < blockArr.length; i++) {
            if (number <= blockArr[i].getMax()){
                return i;
            }
        }
        return -1;
    }

}

class Block {
    private int max;
    private int startIndex;
    private int endIndex;

    public Block() {
    }

    public Block(int max, int startIndex, int endIndex) {
        this.max = max;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    /**
     * 获取
     *
     * @return max
     */
    public int getMax() {
        return max;
    }

    /**
     * 设置
     *
     * @param max
     */
    public void setMax(int max) {
        this.max = max;
    }

    /**
     * 获取
     *
     * @return startIndex
     */
    public int getStartIndex() {
        return startIndex;
    }

    /**
     * 设置
     *
     * @param startIndex
     */
    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    /**
     * 获取
     *
     * @return endIndex
     */
    public int getEndIndex() {
        return endIndex;
    }

    /**
     * 设置
     *
     * @param endIndex
     */
    public void setEndIndex(int endIndex) {
        this.endIndex = endIndex;
    }

    public String toString() {
        return "Block{max = " + max + ", startIndex = " + startIndex + ", endIndex = " + endIndex + "}";
    }
}
