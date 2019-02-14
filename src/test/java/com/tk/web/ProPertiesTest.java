package com.tk.web;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.tk.util.NeoProperties;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProPertiesTest {

	
	@Autowired
    private NeoProperties neoProperties;


    @Test
    public void getHello() throws Exception {
    	System.out.println(neoProperties.getTitle());
        Assert.assertEquals(neoProperties.getTitle(), "Thakur");
        Assert.assertEquals(neoProperties.getDescription(), "Kondasani");
    }

}