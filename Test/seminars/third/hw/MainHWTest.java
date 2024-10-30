package seminars.third.hw;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainHWTest{
    // HW 3.1. Нужно покрыть тестами метод на 100%
    // Метод проверяет, является ли целое число записанное в переменную n, чётным (true) либо нечётным (false).
    @Test
    void ifNotShouldReturnFalse(){
        assertFalse(MainHW.evenOddNumber(5));
    }
    @Test
    void ifYesShouldReturnTrue(){
        assertTrue(MainHW.evenOddNumber(4));
    }

    // HW 3.2. Нужно написать метод который проверяет, попадает ли переданное число в интервал (25;100) и возвращает true, если попадает и false - если нет,
    // покрыть тестами метод на 100%
    @Test
    void ifNotInIntervalShouldReturnFalse(){
        assertFalse(MainHW.numberInInterval(5));
        assertFalse(MainHW.numberInInterval(25));
        assertFalse(MainHW.numberInInterval(100));
        assertFalse(MainHW.numberInInterval(101));
    }
    @Test
    void ifInIntervalShouldReturnTrue(){
        assertTrue(MainHW.numberInInterval(26));
        assertTrue(MainHW.numberInInterval(99));
    }

}
