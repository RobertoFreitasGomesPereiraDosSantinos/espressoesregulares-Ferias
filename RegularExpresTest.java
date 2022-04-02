package expressoesregulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpresTest {
    public static void main(String[] args) {
        String regex = "([a-z])+S(\\w)+";
        String text = "GabreroSantinoSous";
        Pattern patt = Pattern.compile(regex);
        Matcher matc = patt.matcher(text);
        while (matc.find()) {
            System.out.print(matc.group());
        }
    }
}
/*  \\d - tudo oq for numero
    \\D - tudo oq ñ for numero
    \\s - espaços em branco "\n, \r, \t e etc"
    \\S - tudo oq ñ for espaço em branco
    \\w - tudo oq for letras, numeros ou o _
    \\W - tudo oq ñ for letras, numeros ou o _
    []
    ? - zero ou uma
    * - zero ou mais
    + - uma ou mais
    {a, c} - de 'a' a 'c'
    ()
    | 
    ^  */
    