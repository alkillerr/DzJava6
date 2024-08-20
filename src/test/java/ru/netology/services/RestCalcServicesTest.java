package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class RestCalcServicesTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/datamany.csv")
    public void test(int expected, int income, int expenses, int threshold) {
        RestCalcServices service = new RestCalcServices();
        int actual = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }

}
