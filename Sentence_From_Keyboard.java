import java.util.*;
public class Sentence_From_Keyboard
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Wpisz Hasło: ");
        System.out.println("- - - - - - - - - -");
        final String WriteSentenceAZ = "haslo";
        String passwordAZ = sc.nextLine();
        if(WriteSentenceAZ.equals(passwordAZ)){
            System.out.println("Wprowadziłeś dobre hasło B).");        
        }else{
            System.out.println("Wprowadziłeś złe hasło X_X.");
        }        
    }

    //Ostatnio próbuje wprowadzać angielski do kodu, później będzie łatwiej no i ogólnie musze więcej poćwiczyć bo słabo mi idzie.
    //Adrian Ziebowski
}