import java.util.ArrayList;
import java.util.Scanner;

public class reDo {
    public static void main(String[] args) {
        int count=1 ;
        String temp;
        String str[]=new String[count];
        ArrayList<String> dictionary = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter 10 words");
        for (int i = 1; i <= 3; i++) {

            System.out.println("enter word #" + i + ":");
            String userInput = scanner.nextLine();
            dictionary.add(userInput);
            for(int j=i+1;j<count;j++){
                if (str[i].compareTo(str[j])>0)
                {
                    temp=str[i];
                    str[i]=str[j];
                    str[j]=temp;
                }
            }
        }
        {
            System.out.println("original order: "+dictionary);
            System.out.println("sorted: ");
            for (int i=0;i<=count-1;i++){
                System.out.println(str[i]+ ",");
            }
        }
    }
}