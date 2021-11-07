package com.alan.test.demo1.controller;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
 public class Test01ApplicationTests {
    @Autowired
    private TestController testController;
    @Test
    public void testTest(){
        testController.test();
    }
}
