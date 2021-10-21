import java.util.Scanner;

public class MutiplicationTables {
    private static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        while (true) {
            System.out.println(
                "Please tell the number whies table you want to be printed"
            );
            System.out.println("Printing the table in normal order\n");
            int num = input.nextInt();
             for (int i=0;i<=12;i++) {
             System.out.printf("%d X %d = %d\n",num,i,num*i);
             }
             System.out.println("Printing the table in reverse order\n");

            for (int i=12;i>=0;i--) {
                System.out.printf("%d X %d = %d\n",num,i,num*i);
            }

        }
    }
    
}
