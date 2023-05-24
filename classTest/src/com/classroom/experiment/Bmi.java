package com.classroom.experiment;

import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {
        // 获取用户输入：体重、身高
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("请输入身高体重，为您计算出您的BIM值");
            System.out.println("请输入您的身高（m）：");
            float height = scanner.nextFloat();
            System.out.println("请输入您的体重（kg）：");
            int weight = scanner.nextInt();
            // BIM计算
            float bim= weight / (height * height);
            // 根据计算的BIM划分级别
            if (bim<18.5){
                System.out.printf("您的bim指数为：%.1f\n",bim);
                System.out.println("您的体质偏瘦，疾病几率低，请注意饮食作息规律！");
            }else if (bim>18.5 | bim<23.9 ){
                System.out.printf("您的bim指数为：%.1f\n",bim);
                System.out.println("您的体质属于正常，请保持饮食作息规律！");
            }else if (bim >= 24){
                System.out.printf("您的bim指数为：%.1f\n",bim);
                System.out.println("您的体质超重，请注意饮食作息规律！");
            }else if (bim>24 | bim <27.9){
                System.out.printf("您的bim指数为：%.1f\n",bim);
                System.out.println("您的体质偏胖，其他疾病危险性增加，请注意饮食作息规律！");
            }else if (bim >=28){
                System.out.printf("您的bim指数为：%.1f\n",bim);
                System.out.println("您的体质偏肥胖，其他疾病危险性中度增加，请注意饮食作息规律！");
            }else if(bim >=30){
                System.out.printf("您的bim指数为：%.1f\n",bim);
                System.out.println("您的体质重度肥胖，其他疾病危险性严重增加，请注意饮食作息规律！");
            }else {
                System.out.printf("您的bim指数为：%.1f\n",bim);
                System.out.println("您的体质极重度肥胖，其他疾病危险性非常严重增加，请注意饮食作息规律！");
            }
        }
        // 捕获输入异常信息
        catch (Exception e){
            System.out.println("计算的bim信息有误，请检查后重新输入！！");
        }
    }
}
