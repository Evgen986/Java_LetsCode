package org.example.MaximumEnemyFortsThatCanBeCaptured_2511;

import java.io.*;
import java.util.Arrays;

public class TaskForts {
    public static void main(String[] args) {
        int [] fort = {-1,-1,0,1,0,0,1,-1,1,0};
        System.out.println(captureForts(fort));
        readInFile(fort);
    }
    public static int captureForts(int[] forts) {
        int count = -1;
        int maxCount = 0;
        for (int i = 0; i < forts.length; i++) {
            if (count == -1 & forts[i] == 1){
                count++;
            } else if (forts[i] == 1 & count > -1) {
                count = 0;
            }
            if (count >= 0 & forts[i] == 0){
                count++;
            }

            if (forts[i] == -1){
                if (maxCount < count){
                    maxCount = count;
                }
                count = -1;
            }
        }
        count = -1;
        for (int i = forts.length-1; i >= 0; i--) {
            if (count == -1 & forts[i] == 1){
                count++;
            } else if (forts[i] == 1 & count > -1) {
                count = 0;
            }
            if (count >= 0 & forts[i] == 0){
                count++;
            }
            if (forts[i] == -1){
                if (maxCount < count){
                    maxCount = count;
                }
                count = -1;
            }
        }
        return maxCount;
    }
    public static void readInFile(int [] array) {
        File file = new File("test.txt");
        try{
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file, true);
            PrintWriter pw = new PrintWriter(fw);
            pw.println(Arrays.toString(array));
            pw.close();
        } catch (IOException e){
            System.out.println("Ошибка в работе с файлом: " + e);
        }
    }
//    public static int [] readInFile(){
//        File file = new File("test.txt");
//        try {
//            FileReader fr = new FileReader(file);
//            BufferedReader br = new BufferedReader(fr);
//            String [] array = br.readLine().replace("[", "").replace("]", "")
//                    .split(" ");
//            int [] arr = new int[array.length];
//            for (int i = 0; i < arr.length; i++) {
//
//            }
//        } catch (FileNotFoundException e) {
//            System.out.println("Файл не найден: " + e);
//        } catch (IOException e) {
//            System.out.println("Не удалось считать из файла: " + e);
//        }
//        return arr;
    }
//}
