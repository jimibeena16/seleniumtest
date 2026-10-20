package seleniumdemo2;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


import com.training.listeners.*;

@Listeners(TestListener.class)

public class ListenerDemoTest {

    @Test
    public void loginTest() {

        System.out.println("Executing Login Test");

        Assert.assertTrue(true);
    }

  }