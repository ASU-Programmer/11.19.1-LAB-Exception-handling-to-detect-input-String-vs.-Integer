import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class NameAgeChecker {

        public static void main(String[] args) {
                
                Scanner sc = new Scanner(System.in);            
                ArrayList<String> names = new ArrayList<>();
                ArrayList<Integer> ages = new ArrayList<>();
                
                while(true) {
                         
                        String tempName = "";
                        int tempAge = 0;
                        try {
                                tempName = sc.next();
                                if(tempName.equals("-1"))
                                        break;
                                tempAge = sc.nextInt()+1;
                        } catch(InputMismatchException e) {
                                tempAge = 0;
                        }
                        names.add(tempName);
                        ages.add(tempAge);
                        sc.nextLine();
                }
                for(int i=0 ; i<names.size() ; i++) {
                   System.out.printf("%s %d\n", names.get(i), ages.get(i));
         } 
          sc.close();
   }
}
