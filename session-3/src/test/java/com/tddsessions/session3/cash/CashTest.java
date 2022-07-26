package com.tddsessions.session3.cash;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashTest {

    @Test
    void should_returnTotal_WhenCashIsAdded() {
        //Arrange
        var cash = new Cash(3);
        //Act
        cash.plus(4);
        //Assert
        assertEquals(7, cash.total());
    }

    @Test
    void should_returnTrue_WhenSufficientCashIsPresentToBeDeducted() {
        //Arrange
        var cash = new Cash(8);
        //Act
        var result = cash.minus(5);
        //Assert
        assertTrue(result);
    }

    @Test
    void should_returnTotal_WhenCashIsDeducted() {
        //Arrange
        var cash = new Cash(8);
        //Act
        cash.minus(5);
        //Assert
        assertEquals(3, cash.total());
    }

    @Test
    void should_returnFalse_WhenInsufficientCashIsPresentToBeDeducted() {
        //Arrange
        var cash = new Cash(1);
        //Act
        var result = cash.minus(6);
        //Assert
        assertFalse(result);
        assertEquals(1, cash.total());
    }

    @Test
    void should_returnSameCashAmount_WhenInsufficientCashIsPresentToBeDeducted() {
        //Arrange
        var cash = new Cash(1);
        //Act
        var result = cash.minus(6);
        //Assert
        assertEquals(1, cash.total());
    }
}