import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args){

        Scanner next = new Scanner(System.in);
        System.out.println("Enter any string you want to know");
        String str = next.next();

        System.out.println("The text you entered is: "+str);

    }
}
