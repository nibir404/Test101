import java.util.Scanner;

public class Reply {
    public void Status(){
        int Yes;

        Scanner sc = new Scanner(System.in);
        Yes = sc.nextInt();

        if ( Yes==1 ){
            System.out.println("you press 'Yes' sir ");
        }
        else
            System.out.println("you press 'No' sir ");
    }


}
