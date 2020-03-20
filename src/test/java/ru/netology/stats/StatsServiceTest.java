package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StatisticsServiceTest {
    int stats[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    int expectedSum = 180;
    int expectedAverage = 15;
    int expectedMonthOfMaxSales = 8;
    int expectedMonthOfMinimumSales = 9;
    int expectedMonthsQuantityWithSalesUnderAverage = 5;
    int expectedMonthsQuantityWithSalesAboveAverage = 5;

    @Test
    public void calculateSumOfSales() {
        StatsService statsService = new StatsService(stats);
        int actual = statsService.calculateSumOfSales();
        assertEquals(expectedSum, actual);
        assertEquals(expectedSum, new StatsService(stats).calculateSumOfSales());
    }

    @Test
    public void calculateSalesAverage() {
        StatsService statsService = new StatsService(stats);
        int actual = statsService.calculateSalesAverage();
        assertEquals(expectedAverage, actual);
    }

    @Test
    public void showMonthOfMaxSales() {
        StatsService statsService = new StatsService(stats);
        int actual = statsService.showMonthOfMaxSales();
        assertEquals(expectedMonthOfMaxSales, actual);
    }

    @Test
    void showMonthOfMinimumSales() {
        StatsService statsService = new StatsService(stats);
        int actual = statsService.showMonthOfMinimumSales();
        assertEquals(expectedMonthOfMinimumSales, actual);
    }

    @Test
    void showMonthsQuantityWithSalesUnderAverage() { //количество меньше среднего
        StatsService statsService = new StatsService(stats);
        int actual = statsService.showMonthsQuantityWithSalesUnderAverage();
        assertEquals(expectedMonthsQuantityWithSalesUnderAverage, actual);
    }

    @Test
    public void showMonthsQuantityWithSalesAboveAverage() {
        StatsService statsService = new StatsService(stats);
        int actual = statsService.showMonthsQuantityWithSalesAboveAverage();
        assertEquals(expectedMonthsQuantityWithSalesAboveAverage, actual);
    }
}
