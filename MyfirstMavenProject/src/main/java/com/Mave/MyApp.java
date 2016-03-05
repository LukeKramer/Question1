package com.Mave;

import org.junit.Assert;

/**
 * Created by student on 2016/03/01.
 */
public class MyApp
{

    public float floating()
    {
        return 3.0f;
    }

    public int numbers()
    {
        return 7;
    }

    public MyApp objectEqual(){ return this;}

    public boolean True(boolean a){

        return a;

    }

    public boolean FALSE(boolean a)
    {

        return a;
    }

    public String nullness (String a) {

        return a;
    }

    public int[] arraytest()
    {
        int[] num = {1,2,3};
        return num;
    }

    public void name() throws IndexOutOfBoundsException
    {
            int[] a = new int[]{1};
            a[4] = 2;
            Assert.fail();
    }

    public String timeout()
    {
        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Hellofriend";
    }
}
