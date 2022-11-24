package co.com.proteccion.util;

public class StringUtilTest {
    public static void main(String[] args) {

        assertEquals(StringUtil.repeat("hola",3), "holaholahola");

    }

    private static void assertEquals(String actual, String expected) {
        if(!actual.equals(expected)){
            throw new RuntimeException("Actual is different to expected");
        }
    }
}