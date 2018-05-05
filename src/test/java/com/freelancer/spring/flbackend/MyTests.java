package com.freelancer.spring.flbackend;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MyTests {
    @Autowired
    private TestComponent myComponent;

    @Test
    public void getProperties() throws Exception
    {
        Assert.assertEquals(myComponent.getName(), "mokuteno");
        Assert.assertEquals(myComponent.getId(), "666");
    }


}
