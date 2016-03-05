package com.Mave;


import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by student on 2016/03/01.
 */
public class TestMeth {

    private MyApp jessi = new MyApp();
    @Test
    public void testfloat()
    {
        Assert.assertEquals( 3.0f,jessi.floating(),0);
    }
    @Test
    public void testnum()
    {
        Assert.assertEquals(7,jessi.numbers());
    }
    @Test
    public void testobject()
    {
        Assert.assertTrue(jessi instanceof MyApp);
    }
    @Test
    public void testobjects1()
    {
        TestMeth meth =new TestMeth();

       Assert.assertEquals(jessi.objectEqual(),jessi);

    }
    @Test
    public void testchecktruth()
    {
        Assert.assertTrue("True",jessi.True(true));
    }
    @Test
    public void testcheckfalse()
    {
        Assert.assertFalse("False",jessi.FALSE(false));

    }
    @Test
    public void testnullness()
    {

        Assert.assertNull("Null",jessi.nullness(null));
    }
    @Test
    public void testnonnullness()
    {

        Assert.assertNotNull("Not Null",jessi.nullness("Luke"));

    }
    @Test
    public void testArray()
    {
        int[] nums = {1,2,3};
        Assert.assertArrayEquals("Equal", jessi.arraytest(), nums);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testFAIL()
    {

            jessi.name();


    }

    @Test(timeout=100)
    public void testTimeOut()
    {

        jessi.timeout();
        //Assert.assertSame(jessi.timeout(),"Hellofriend");

    }

    @Ignore
    public void testIgnor()
    {
        Assert.assertSame(jessi.timeout(),"Hellofriend");
    }



















}
