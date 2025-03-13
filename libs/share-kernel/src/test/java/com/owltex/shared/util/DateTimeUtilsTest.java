package com.owltex.shared.util;

import org.junit.jupiter.api.Test;

import java.time.Instant;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DateTimeUtilsTest {
    @Test
    void testFormatInstant() {
        Instant instant = Instant.parse("2021-01-01T00:00:00Z");
        String formatted = DateTimeUtils.formatInstant(instant);
        assertEquals("2021-01-01 07:00:00", formatted);
    }
}