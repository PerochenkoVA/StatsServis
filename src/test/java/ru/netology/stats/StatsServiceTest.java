package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @org.junit.jupiter.api.Test
    void calculateSum() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;

        long actual = service.calculateSum(sales);
        assertEquals(expected , actual);
    }
    @org.junit.jupiter.api.Test
    void averageSales(){
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;

        long actual = service.avarageSales(sales);
        assertEquals(expected,actual);
    }
    @Test
    void numberMonthMaxSales (){
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;

        long actual = service.numberMonthMaxSales(sales);
        assertEquals(expected,actual);
    }

    @Test
    void numberMonthMinSales (){
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;

        long actual = service.numberMonthMinSales(sales);
        assertEquals(expected,actual);
    }
    @Test
    void shouldReturnMoreThanAvg (){
        long[] items = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsService service = new StatsService();
        long actual = service.monthCountMoreThenAvg(items);

        long expected = 5;
        assertEquals(expected,actual);
    }

    @Test
    void shouldReturnLessThanAvg (){
        long[] items = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsService service = new StatsService();
        long actual = service.monthCountLessThenAvg(items);

        long expected = 5;
        assertEquals(expected,actual);
    }
}



