package ru.netology.sqr.javamvn.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {


    @Test
    public void calculateSqRt() {
        SQRService service = new SQRService();

        int expected = 3;
        int actual = service.calcQtSqRt(200, 300);

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void calculateSqRtMinimumBoundaries() {
        SQRService service = new SQRService();

        int expected = 1;
        int actual = service.calcQtSqRt(100, 100);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calculateSqRtMaximumBoundaries() {
        SQRService service = new SQRService();

        int expected = 90;
        int actual = service.calcQtSqRt(10, 100_000);

        Assertions.assertEquals(expected, actual);
    }


}
