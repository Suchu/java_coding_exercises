package com.techreturners.exercise004;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Exercise004 {
    public final long gigaSecond = 1000000000;
    public final LocalDateTime birthDateTime;

    public Exercise004(LocalDate date) {
        birthDateTime = date.atStartOfDay();
    }

    public Exercise004(LocalDateTime dateTime) {
        birthDateTime = dateTime;
    }

    public LocalDateTime getDateTime() {
        return birthDateTime.plusSeconds(gigaSecond);
    }
}
