import java.util.Scanner;
public class BMI
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);           
        System.out.println("Podaj swoje imię: ");
        String name = sc.nextLine();
        System.out.println("Podaj swoje nazwisko: ");
        String surname = sc.nextLine();
        System.out.println("Ile masz wzrostu(m): ");
        double h = sc.nextDouble();        
        System.out.println("Ile ważysz(kg): ");
        double w = sc.nextDouble();

        double BMI = (double)w/((h*h)/100)*100;

        System.out.print("Twoje BMI: "+BMI);
    }    
}