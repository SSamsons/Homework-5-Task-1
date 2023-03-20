package ru.netology.services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MonthsServiceTest {

    @Test
    public void shouldCalcMonth() {
        MonthsService service = new MonthsService();

        int expected = 3;
        int actual = service.calcMoney(10_000, 3000, 20_000);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcMonthTwo() {
        MonthsService service = new MonthsService();

        int expected = 2;
        int actual = service.calcMoney(100_000, 60_000, 150_000);

        Assertions.assertEquals(expected, actual);
    }
}
