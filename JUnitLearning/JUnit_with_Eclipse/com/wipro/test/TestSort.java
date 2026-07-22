package com.wipro.test;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

import com.wipro.task.DailyTasks;

public class TestSort {

    @Test
    public void testSortValues() {

        DailyTasks obj = new DailyTasks();

        int input[] = {5,2,8,1};

        int expected[] = {1,2,5,8};

        int actual[] = obj.sortValues(input);

        assertArrayEquals(expected, actual);
    }
}