package com.example.demo;

import org.junit.Test;
import org.mockito.Mock;

import java.util.List;

import static org.junit.Assert.*;

public class TestTest {
    @Mock
    private List mockList;

    @Test
    public void sayHellow() {
        mockList.add(1);
    }
}