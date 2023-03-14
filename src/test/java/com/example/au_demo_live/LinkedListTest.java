package com.example.au_demo_live;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class LinkedListTest {
//    @Test
@ParameterizedTest
    @DisplayName("index =-1 --> Exception to be thown ")
    @ValueSource(ints = {-1, 3, 5, -3, 15, Integer.MIN_VALUE})
    void testGetElement_shouldThrowExceptiononNegetiveIndex(int negativeIndex){
        final var list=new LinkedList<Integer>();
        assertThrows(RuntimeException.class,()->list.getelement(negativeIndex));
    }
    @Test
    @DisplayName("If Index in less than than sixe of linkedList it should return")
    void testGetElement_shouldReturnValueOnValidIndex(){
        final var list=new LinkedList<Integer>();
        list.addElement(10);
        assertEquals(10,list.getelement(0));
    }

    @Test
    @DisplayName("Given index is greater than the size of LinkedList it should return null")
    void testGetElement_shouldThroeExceptionOnInvalideIndex(){
        final var list=new LinkedList<Integer>();
        list.addElement(10);
        list.addElement(23);
        final var exception=assertThrows(RuntimeException.class,()->list.getelement(2)) ;
//        assertEquals("size greater",exception.getMessage());

    }
    @Test
    @DisplayName("no null value")
    void testAddElement_shouldThrowExceptionInNullIsAdded(){
        final var list=new LinkedList<Integer>();
        final var exception=assertThrows(NullPointerException.class,()->list.addElement(null));
        assertEquals("cannot add null",exception.getMessage());
    }
    @Test
    @DisplayName("length is equal")
    void testAddElement_shouldIncreaseTheLength(){
        final var list=new LinkedList<Integer>();
        list.addElement(10);
        list.addElement(20);
        int currLen= list.getLength();
        list.addElement(30);
        assertEquals((currLen+1),list.getLength());

    }


}
