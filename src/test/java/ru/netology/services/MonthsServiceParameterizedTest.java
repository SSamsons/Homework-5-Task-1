package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class MonthsServiceParameterizedTest {

    @ParameterizedTest
    @CsvFileSource(files ="src/test/resources/month.csv")
    public void shouldCalcMonth(int expected, int income, int expence, int trashold) {
        MonthsService service = new MonthsService();

        int actual = service.calcMoney(income, expence, trashold);

        Assertions.assertEquals(expected, actual);
    }
}