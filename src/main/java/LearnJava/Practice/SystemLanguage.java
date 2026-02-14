package LearnJava.Practice;
import java.util.Locale;

public class SystemLanguage {
    static void main(){
        String Idioma = Locale.getDefault().getLanguage();
        System.out.println("O idioma do seu sistema é: " + Idioma);
    }
}
