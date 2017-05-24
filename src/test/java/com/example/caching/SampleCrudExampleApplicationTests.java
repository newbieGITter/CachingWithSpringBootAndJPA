package com.example.caching;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;

import com.example.caching.demo.SampleCrudExampleApplication;

import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SampleCrudExampleApplication.class)
@WebAppConfiguration
public class SampleCrudExampleApplicationTests {

	@Test
	public void contextLoads() {
	}

}
