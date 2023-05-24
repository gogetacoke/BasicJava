package com.classroom.array1;

public class Array1 {
    public static void main(String[] args) {
    /*    System.out.println("请输入任意一组数字，以空格分割");
        System.out.print("请输入：");
        Scanner sc = new Scanner(System.in);
        String numString = sc.nextLine();
        numString.trim().split(" ");
        System.out.println(numString);*/



        /*
            二维数组
         */
        // 根据提供的二维数组计算出最小值
//        int num[] [] = new int[3][4];
        int num [] [] = {{3,4},{5,6,-7,6},{8,9,10,15,-1}};
        int min = num[0][0];
        int _x = 0,_y = 0;
        for (int i = 0;i < num.length; i++) {
//            System.out.println(Arrays.toString(num[i]));
            for(int j = 0; j<num[i].length; j++){
                if(num[i][j] < min){
                    min = num[i][j];
                    _x = i;
                    _y = j;
                }
            }
        }
        System.out.printf("数组num的最小值是[%d][%d]=[%d]",_x,_y,min);
    }
}
