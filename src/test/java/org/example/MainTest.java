package org.example;

import junit.framework.TestCase;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest extends TestCase {

    public void testAdded() {
        Main main=new Main();
        assertEquals(10,main.added(4,6));

    }
}