package AC;
import java.util.Scanner;

public class quiz {
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
       
       // if else conditions  
        // if(button==1){
        //     System.out.println("hello");
        // }
        // else if(button==2){
        //     System.out.println("Namaste");
        // }
        // else if(button==3){
        //     System.out.println("bonjour");
        // }
        // else{
        //     System.out.println("invalid button");
        // }


    // switch statements
    
    switch(button){
        case 1: System.out.println("hello");
        break;
        case 2: System.out.println("Namaste");
        break;
        case 3: System.out.println("bonjour");
        break;
        default : System.out.println("invalid  button");
    }

    

    }
}
