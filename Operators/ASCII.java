//Write a Java Program to print the ASCII value of a character.
import java.util.Scanner;
public class ASCII {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        char ch = sc.next().charAt(0);
        int ascii=(int)ch;
        System.out.print(ascii);
    }
}
//Write a Java Program to print the character for the given ASCII value.
import java.util.Scanner;
public class ASCII {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int ascii=sc.nextInt();
        char ch=(char)ascii;
        System.out.print(ch);
    }
}