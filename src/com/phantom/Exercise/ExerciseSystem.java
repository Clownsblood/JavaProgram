package com.phantom.Exercise;

import java.io.*;

public class ExerciseSystem {
    public static void main(String[] args) {
//        String filePath = "../quwstion.txt";
//        try{
//            BufferedReader br = new BufferedReader(new FileReader(filePath));
//        }catch (IOException e){
//            e.printStackTrace(); // 处理IO异常
//        }
        new WriteToFileExample().sout();
    }
}
class WriteToFileExample {
    public void sout() {
        String filePath = "output.txt"; // 文件路径
        String content = "这是要写入文件的内容。\n这是第二行内容。";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            bw.write(content); // 写入内容
            bw.newLine(); // 添加换行符
        } catch (IOException e) {
            e.printStackTrace(); // 处理IO异常
        }
    }
}