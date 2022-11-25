package co.com.proteccion.util;

import org.junit.Assert;
import org.junit.Test;


public class PasswordUtilTest {


    @Test
    public void weakPassLess8(){
        Assert.assertEquals(PasswordUtil.SecurityLevel.WEAK ,PasswordUtil.assesPassword("123abv"));
    }

    @Test
    public void weakPassOnlyLetters(){
        Assert.assertEquals(PasswordUtil.SecurityLevel.WEAK ,PasswordUtil.assesPassword("abcdefghijklm"));
    }

    @Test
    public void mediemLettersAndNums(){
        Assert.assertEquals(PasswordUtil.SecurityLevel.MEDIUM ,PasswordUtil.assesPassword("abcd1234"));
    }

    @Test
    public void Strong(){
        Assert.assertEquals(PasswordUtil.SecurityLevel.STRONG ,PasswordUtil.assesPassword("abcd1234##_"));
    }


}