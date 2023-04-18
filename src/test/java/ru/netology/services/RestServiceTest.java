package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.services.RestService;

public class RestServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/Rest.csv")

    public void testRestService(int expected, int income, int expences, int threshold) {

        RestService service = new RestService();
        int actual = service.calculate(income, expences, threshold);
        Assertions.assertEquals(expected, actual);

    }


}
