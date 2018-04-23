/**
 * Created by Zalexon on 4/15/2018.
 */
import java.util.*;
public class Trynode {
    public static void main(String args[]){
        System.out.println("Login or Sign Up?");

    }

    public String getPassword() {
        return setPassword();
    }

    public String setPassword(){
        Scanner SC = new Scanner(System.in);
        System.out.println("Set Password");
        String password = SC.next();
        return password;
    }
}
