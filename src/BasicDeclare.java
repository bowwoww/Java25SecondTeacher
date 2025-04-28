import java.util.ArrayList;

public class BasicDeclare {
    public static void main(String[] args) throws Exception {
        /* 基本型別介紹
         * int:     整數, 範圍: -2,147,483,648 ~ 2,147,483,647
         *
         * byte:    整數, 範圍: -128 ~ 127
         *
         * long:    整數, 範圍: -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807
         *
         * float:   32位元浮點數, 需要加上F
         *
         * double:  64位元浮點數, 預設型別
         *
         * char:    字元, 1個字元, 單引號
         *
         * String:  文字, 多個字元, 雙引號
         *
         * boolean: 布林, true/false
         */
        // int age = 25;
        // System.out.println(age);

        // float weight1 = 49.4F;
        // System.out.println(weight1);

        // double weight2 = 49.49;
        // System.out.println(weight2);
        
        // char c1 = 'Y';
        // System.out.println(c1);

        // String name = "Edward";
        // System.out.println(name);

        // boolean isStudent = true; // false
        // System.out.println(isStudent);
        int a = 10;
        float b = 20.5F; // 這裡加上 F, 代表 float 型別
        double sum;
        sum = a + b; // 這裡 sum 是 double 型別, 因為 b 是 float 型別, 所以會自動轉型
        System.out.println(a + b); // 30.5
        System.out.println(sum); // 30.5
        String str = "Hello World!"; // 字串
        System.out.println(str + sum); // Hello World!

        int[] array = {1, 2, 3, 4, 5};
        ArrayList<Integer> array2 = new ArrayList<>();
        array2.add(1);
        array2.add(2);
        array2.add(3);
        array2.remove(1); // 刪除 index 1 的元素
        /*
         * 陣列(Array)宣告
         * 陣列的長度是固定的, 不能改變
         * 陣列的長度是從0開始計算
         */
        // int[] bingo = {7, 22, 89, 55, 33, 99};
        // System.out.println(bingo[5]);
        // System.out.println(bingo[2]);

        // String[] students = {"A1", "A2", "A3"};
        // System.out.println(students[1]);

    }
}
