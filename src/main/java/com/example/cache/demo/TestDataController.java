package com.example.cache.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestDataController {
    
    private TestDataService testDataService;
    
    @Autowired
    public TestDataController(TestDataService testDataService) {
        this.testDataService = testDataService;
    }
    
    @RequestMapping(value = "test")
    public String getEmail() {
        return testDataService.getEmail("test.me");
    }
}
