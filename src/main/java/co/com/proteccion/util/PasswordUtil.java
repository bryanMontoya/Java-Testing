package co.com.proteccion.util;

public class PasswordUtil {

    public enum SecurityLevel{
        WEAK, MEDIUM, STRONG
    }
    public static SecurityLevel assesPassword(String password){
        if (password.length()<8){
            return SecurityLevel.WEAK;
        }
        //Regex "[a-zA-Z]+" Contiene letras de la A a la Z mayusculas o minusculas y el + significa varias veces.
        if (password.matches("[a-zA-Z]+")){
            return SecurityLevel.WEAK;
        }

        if (password.matches("[a-zA-Z0-9]+")){
            return SecurityLevel.MEDIUM;
        }

        return SecurityLevel.STRONG;
    }
}
