// ICO PROJECT
// SIMPLE CASHER SYSTEM
package RandomClass;
import java.util.Scanner;

public class ICOProject {
    public static void main(String[] args) {
        // MAIN METHOD
        // PRODUCT ARRAY SHOULD BE STATED HERE AND PASS ONTO OTHER METHODS

        //-----------------PRODUCT DATA------------------------ faisal space


        //-----------------PRODUCT DATA------------------------

        greetings(prodid,prodname,price);
        while(true){
            query();
        }
        
    }

    public static void greetings(int[] prodid, String[] prodname, double[] price){
        System.out.println("/////////////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\n");
        System.out.println("            Welcome to Casher System                 ");
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\//////////////////////////\n");

        System.out.println("Here are the products we sell:");
        System.out.println("Product ID    Product Name    Price");
        System.out.println("------------------------------------");
        for (int i = 0 ; i < prodid.length ; i++){
            System.out.printf("%-10d    %-12s    %-.25f", prodid[i],prodname[i],price[i]);
    }

    public static double totalPrice(List<Double> prices){ 
        double totalPrice = 0.0; 
        for(double price:prices){ 
            totalPrice+=price; 
        } 
        return totalPrice; 
    } //Taufiq 

    
}
