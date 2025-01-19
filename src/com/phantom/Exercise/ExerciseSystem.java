package com.phantom.Exercise;
import java.io.*;

public class ExerciseSystem {
    public static void main(String[] args) {
        String filePath = "question.txt";
        try (FileReader fr = new FileReader(filePath);
             BufferedReader br = new BufferedReader(fr)) {
            int character;
            while ((character = br.read()) != -1) {
                System.out.print((char) character); // 打印每一个字符
            }
        } catch (IOException e) {
            e.printStackTrace(); // 处理IO异常
        }

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
