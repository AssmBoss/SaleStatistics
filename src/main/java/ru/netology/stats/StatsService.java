package ru.netology.stats;

public class StatsService {

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month++;
        }
        return minMonth + 1;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month++;
        }
        return maxMonth + 1;
    }

    public long sumSales (long[] sales) {
        long summa = 0;
        for (long sale : sales) {
            summa = summa + sale;
        }
        return summa;
    }

    public int midSales (long[] sales) {
        long middle = sumSales(sales)/sales.length;
        return (int) middle;
    }

    public int salesBelowMiddle(long[] sales) {
        int counter = 0;
        for (long sale : sales) {
            if (sale < midSales(sales)) {
                counter++;
            }
        }
        return counter;
    }

    public int salesAboveMiddle(long[] sales) {
        int counter = 0;
        for (long sale : sales) {
            if (sale > midSales(sales)) {
                counter++;
            }
        }
        return counter;
    }

}
