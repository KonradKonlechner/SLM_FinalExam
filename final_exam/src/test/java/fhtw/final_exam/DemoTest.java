package fhtw.final_exam;

import fhtw.final_exam.service.DemoService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalTime;

@SpringBootTest
public class DemoTest {

    @Autowired
    private DemoService demoService;

    @Test
    public void testGetTime() {
        // Arrange, Act, Assert

        LocalTime result = demoService.getTime();

        assertTrue(result.isBefore(LocalTime.now()) || result.equals(LocalTime.now()));
    }

}
