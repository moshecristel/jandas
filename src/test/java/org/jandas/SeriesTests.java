package org.jandas;

import org.junit.Test;

import static org.junit.Assert.*;

public class SeriesTests {

    @Test
    public void testGetName() {
        Series series = new Series("series1");

        assertEquals("series1", series.getName());
    }

}