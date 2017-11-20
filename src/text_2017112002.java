import java.util.Scanner;

public class text_2017112002 {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        int length = str.length();
        int sum = 0;
        for (int i=0;i<length;i++)
        sum = sum + (str.charAt(i) - '0');
        System.out.println(sum);
    }
}
