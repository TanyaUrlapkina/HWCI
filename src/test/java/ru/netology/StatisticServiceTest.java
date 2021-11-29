package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticServiceTest {

    @Test
    void findMax() {
        StatisticService service = new StatisticService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 32, 12};
        long expected = 32;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
}