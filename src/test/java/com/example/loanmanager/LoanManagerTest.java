package com.example.loanmanager;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LoanManagerTest {

    @Test
    void shouldReturnApplicationName() {
        LoanManager app = new LoanManager();

        assertEquals("Loan Manager", app.getApplicationName());
    }
}