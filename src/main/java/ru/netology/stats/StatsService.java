package ru.netology.stats;

import java.util.Arrays;

public class StatsService {
    // Сумма всех продаж
    public long calculateSum(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    // Средняя сумма продаж в месяц
    public long avarageSales(long[] sales) {
        long averageSales = calculateSum(sales) / sales.length;
        return averageSales;
    }

    // Номер месяца, в котором был пик продаж (осуществлены продажи на максимальную сумму)
    public long numberMonthMaxSales(long[] items) {
        long max = getMax(items);
        int mounth = 1;
        int numberMonthMaxSales = 0;
        for (long item : items) {
            if (item == max) {
                numberMonthMaxSales = mounth;
            }
            mounth++;
        }

        return numberMonthMaxSales;

    }

    public long getMax(long[] items) {
        long max = items[0];
        for (long item : items) {
            if (item > max) {
                max = item;
            }
        }
        return max;
    }
//Номер месяца, в котором был минимум продаж (осуществлены продажи на минимальную сумму)*

    public long numberMonthMinSales(long[] items) {
        long min = getMin(items);
        int mounth = 1;
        int numberMonthMinSales = 0;

        for (long item : items) {
            if (item == min) {
                numberMonthMinSales = mounth;
            }
            mounth++;
        }

        return numberMonthMinSales;
    }

    public long getMin(long[] items) {
        long min = items[0];
        for (long item : items) {
            if (item < min) {
                min = item;
            }
        }
        return min;
    }
//Кол-во месяцев, в которых продажи были ниже среднего (см. п.2)
    public long monthCountMoreThenAvg(long[] items) {
        long avg = avarageSales(items);
        int count = 0;
        for (long item : items) {
            if (item > avg) {
                count++;
            }
        }
        return count;
    }
//Кол-во месяцев, в которых продажи были выше среднего (см. п.2)
    public long monthCountLessThenAvg(long[] items) {
        long avg = avarageSales(items);
        int count = 0;
        for (long item : items) {
            if (item < avg) {
                count++;
            }
        }
        return count;

    }
}




