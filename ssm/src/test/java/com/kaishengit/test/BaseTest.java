package com.kaishengit.test;

import com.kaishengit.Application;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Application.class)//(locations = "classpath:applicationContext.xml")
public class BaseTest {
}
