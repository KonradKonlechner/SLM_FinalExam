package fhtw.final_exam.controller;

import fhtw.final_exam.service.DemoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;

@RestController
@RequestMapping("/api")
public class DemoController {

        private final DemoService demoService;

        public DemoController(DemoService demoService) {
            this.demoService = demoService;
        }
        @GetMapping("/time")
        public LocalTime getTime() {
            return demoService.getTime();
        }

}
