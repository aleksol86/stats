package ru.netology.stats;

public class Stats {
    public static void main(String[] args) {
        int stats[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsService statsService = new StatsService(stats);
        statsService.showMonthsQuantityWithSalesUnderAverage();
    }
}
