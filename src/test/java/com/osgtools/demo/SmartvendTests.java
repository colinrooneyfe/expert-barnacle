package com.osgtools.demo;

import com.osgtools.demo.Smartvend;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SmartvendTests {

    @Test
    public void defaultNameTest() {
        Smartvend sv = new Smartvend();
        Assert.assertEquals("Expected Default now found",sv.getName(), "Vend01");
    }

}
