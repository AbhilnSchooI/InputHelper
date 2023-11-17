import java.util.Scanner;

public class InputHelper {
    public static void main(String[] args) {
        //Test Methods

        Scanner scan = new Scanner((System.in));
        System.out.println(getRangedInt(scan, 5,10, "enter a ranged int from 5-10"));
    }

    //this method loops until a valid int is received, returns int value.
    public static int getInt(Scanner in, String prompt) {
        boolean done = false;
        int x = 0;

        System.out.println(prompt);
        do {
            if(in.hasNextInt()){
                x = in.nextInt();
                done = true;
            }else{
                System.out.println("Invalid input. Please try again");
            }
            in.nextLine(); //clear buffer
        } while (!done);
        return x;
    }

    //this method loops until a valid ranged int is received, returns int value
    public static int getRangedInt(Scanner in, int min, int max, String prompt) {
        boolean done = false;
        int x = 0;

        System.out.println(prompt);
        do {
            if(in.hasNextInt()){
                x = in.nextInt();
                if(x <= max && x >= min){
                    done = true;
                }else{
                    System.out.println("Invalid range. Please try again");
                }
            }
            in.nextLine(); //clear buffer
        } while (!done);
        return x;
    }






}