package co.com.proteccion.util;

import org.junit.Assert;
import org.junit.Test;

public class StringUtilTest {
    @Test
    public void testRepeatoOnce(){
        Assert.assertEquals("hola", StringUtil.repeat("hola",1));
    }

    @Test
    public void testRepeatTwice(){
        Assert.assertEquals("holahola", StringUtil.repeat("hola",2));
    }

    @Test
    public void testRepeatZero(){
        Assert.assertEquals("", StringUtil.repeat("hola",0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRepeatNegative(){
        //Se espera que se lance una ecepcion.
        StringUtil.repeat("hola",-1);
    }
}