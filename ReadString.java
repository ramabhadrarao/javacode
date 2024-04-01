import java.util.Scanner;

public class ReadString {
    public static void main (String []args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Your Name");
        String myname=input.nextLine();
        System.out.println("My Name is:"+myname);

    }
}