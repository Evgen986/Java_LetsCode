package org.example.MaximumEnemyFortsThatCanBeCaptured_2511;

public class TaskForts {
    public static void main(String[] args) {
        int [] fort = {-1,-1,0,1,0,0,1,-1,1,0};
        System.out.println(captureForts(fort));
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
}
