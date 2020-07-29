package com.example.demo;

import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DeviationTests {

    @Test
    void test_getStandardDeviation() {

        //given
        double expectedStandardDeviation = 3.559026084010437;

        double[] values = new double[] {23, 30, 22, 25};
        DescriptiveStatistics descriptiveStatistics = new DescriptiveStatistics();
        for (double v : values) {
            descriptiveStatistics.addValue(v);
        }

        //when
        double mean = descriptiveStatistics.getMean();
        double standardDeviation = descriptiveStatistics.getStandardDeviation(); //샘플 표준편차로 계산하는 듯

        //then
        assertEquals(expectedStandardDeviation, standardDeviation);
    }

    @Test
    void test_() {

        //given

        double[] values = new double[] {11000, 15000, 17000, 9000};
        DescriptiveStatistics descriptiveStatistics = new DescriptiveStatistics();
        for (double v : values) {
            descriptiveStatistics.addValue(v);
        }

        //when


        System.out.println("dd");


    }
}

