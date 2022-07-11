package ru.netology.stats;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class StatsServiceTest {
    @Test
    public void shouldGetMinSales() {
        StatsService service = new StatsService();

        long[] sales = { 1000, 2000, 3000, 4000, 5000, 6000, 0, 5000, 4000, 3000, 2000, 1000};

        int expected = 7;
        int actual = service.minSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetMaxSales() {
        StatsService service = new StatsService();

        long[] sales = { 1000, 2000, 3000, 4000, 5000, 6000, 0, 5000, 4000, 3000, 2000, 1000};

        int expected = 6;
        int actual = service.maxSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetSumSales() {
        StatsService service = new StatsService();

        long[] sales = { 1000, 2000, 3000, 4000, 5000, 6000, 0, 5000, 4000, 3000, 2000, 1000};

        long expected = 36000;
        long actual = service.sumSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetMidSales() {
        StatsService service = new StatsService();

        long[] sales = { 1000, 2000, 3000, 4000, 5000, 6000, 0, 5000, 4000, 3000, 2000, 1000};

        int expected = 3000;
        int actual = service.midSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetSalesBelowMiddle() {
        StatsService service = new StatsService();

        long[] sales = { 1000, 2000, 3000, 4000, 5000, 6000, 0, 5000, 4000, 3000, 2000, 1000};

        int expected = 5;
        int actual = service.salesBelowMiddle(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetSalesAboveMiddle() {
        StatsService service = new StatsService();

        long[] sales = { 1000, 2000, 3000, 4000, 5000, 6000, 0, 5000, 4000, 3000, 2000, 1000};

        int expected = 5;
        int actual = service.salesAboveMiddle(sales);

        Assertions.assertEquals(expected, actual);
    }

}
