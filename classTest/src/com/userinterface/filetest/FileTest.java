package com.userinterface.filetest;

import javax.xml.crypto.Data;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileTest {
    public static void main(String[] args) {
        // 文件常用操作
//        fileMethods();
//        fileInputStream01();
//        fileOutputStreamTest();
        fileCopy();
    }

    private static void fileMethods() {
        // File可以代表磁盘上的文件，也可以是目录文件夹
        // File代表的文件可以是不存在的，exists判断
        // 可以使用createNewFile创建文件，使用mkdir创建目录
        // 文件路径可以是绝对路径
        // 也可也是相对路径，根目录在当前工程的根目录
        // 打开本地文件(存在)
//        File file = new File("C:\\Users\\13570\\Desktop\\Class\\面向对象\\Code\\draw\\Entry.java");
        // 不存在
        File file = new File("text");
        System.out.println(file.exists()); //判断文件是否存在

        // 判断文件是否存在，不存在就创建
        if (!file.exists()){
            // 以目录形式创建出来
            file.mkdir();
            // 以文件的形式创建出来
            /*try {
                file.createNewFile();
            }catch (IOException e){
                throw new RuntimeException(e);
            }*/
        }
        File dirs = new File("a\\b\\c");
        if (!dirs.exists()){
            // 创建嵌套目录
            dirs.mkdirs();
        }
        // 获得绝对路径地址
        System.out.println(dirs.getAbsoluteFile());
        // 获得文件详细信息
        File file1 = new File("classTest\\src\\com\\userinterface\\filetest\\FileTest.java");
        System.out.println("文件名：" + file1.getName());
        System.out.println("是不是文件：" + file1.isFile());
        System.out.println("文件长度：" + file1.length());
        long time = file1.lastModified();
        Date date = new Date(time);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println("最后修改时间：" + format.format(date));
        // 查看文件夹下的所有内容 File[] listFiles()
        File file2 = new File("sLoop\\src\\com\\example");
        File[] files = file2.listFiles();
        assert files != null;
        for (File f:files) {
            //输出文件名
            System.out.println(f.getName());
        }
    }

    // 文件输入
    private static void fileInputStream01(){
        File file = new File("C:\\Users\\13570\\Desktop\\Class\\面向对象\\Code\\draw\\test.txt");
        FileInputStream in = null;
        try {
            in = new FileInputStream(file);
            /*System.out.println("可读字节有：" + in.available());
            System.out.println("读取一个字节：" + in.read());
            in.skip(11);
            System.out.println("剩余可读字节：" + in.available());*/
            byte [] buffer = new byte[10];
            int length;
            while ((length = in.read(buffer))!=-1){
                System.out.println(new String(buffer,0,length));
            }
        }catch (FileNotFoundException e){
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            if(in !=null){
                try {
                    in.close();
                }catch (IOException e){
                    throw new RuntimeException(e);
                }
            }
        }

    }
    // 文件输出
    private static void fileOutputStreamTest(){
        // 对于不存在的文件，首先会自动创建
        // 如果已经存在在这个文件，默认会从头覆盖原来的内容
        // 如果要追加内容，可以使用append模式
        FileOutputStream outputStream = null;
        try {
            outputStream = new FileOutputStream("text.txt");
            outputStream.write(100);
            String content = "谢谢您，把我保存下来！";
            outputStream.write(content.getBytes(StandardCharsets.UTF_8));
            outputStream.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void fileCopy(){
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            in = new FileInputStream("test.txt");
            out = new FileOutputStream("src\\test.txt");
            // 一般情况，循环读入，循环写出
            byte[] buffer = new byte[1024];
            int length = -1;
            while ((length = in.read(buffer))!=-1){
                out.write(buffer,0,length);
            }
        }catch (FileNotFoundException e){
            throw new RuntimeException(e);
        } catch (IOException a) {
            throw new RuntimeException(a);
        } finally {
            if (in != null){
                try {
                    in.close();
                }catch (IOException e){
                    throw new RuntimeException(e);
                }
            }
        }
    }

    private static void fileReadrAndWriter(){
        FileReader reader = null;
        try {
            reader = new FileReader("src\\com\\userinterface\\filetest\\FileTest.java");
            System.out.println((char)reader.read());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {

        }
    }
}
