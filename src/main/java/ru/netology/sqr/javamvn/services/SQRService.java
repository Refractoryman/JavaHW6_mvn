package ru.netology.sqr.javamvn.services;

public class SQRService {

    public int calcQtSqRt(int minNumber, int maxNumber) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i <= maxNumber) {
                if (i * i >= minNumber) {
                    count++;
                }
            }
        }
        return count;

    }
}
