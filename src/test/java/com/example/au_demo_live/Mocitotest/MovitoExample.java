package com.example.au_demo_live.Mocitotest;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MovitoExample {
    @Test
    public void testLinkedListGetElements(){
        final var list= mock(java.util.LinkedList.class);
        Mockito.when(list.size()).thenReturn(10);
        assertEquals(10,list.size());
    }
    @Test
    public void testLinkedListGetElement_ThrowException_testAnyString(){
        final var list=mock(java.util.LinkedList.class);
        when(list.add(anySt))
    }
}
