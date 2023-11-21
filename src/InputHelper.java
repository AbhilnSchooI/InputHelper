import java.util.Scanner;

public class InputHelper {
    public static void main(String[] args) {
        //Test Methods

        Scanner scan = new Scanner(System.in);
        System.out.println(YNConfirm(scan, "enter Y or N"));
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

    //this method loops until a double is entered.
    public static double getDouble(Scanner in, String prompt){
        boolean done = false;
        double x = 0;

        System.out.println(prompt);
        do {
            if(in.hasNextDouble()){
                x = in.nextDouble();
                done = true;
            }else{
                System.out.println("You have entered an invalid Double. Please try again");
            }
            in.nextLine();
        } while (!done);

        return x;
    }

    //this returns a boolean if you want to continue which is true and false if not.
    public static boolean YNConfirm(Scanner in, String prompt){
        boolean done = false;
        boolean con = false;
        String check;
        System.out.println(prompt);

        do {
            check = in.nextLine();
            if(check.equalsIgnoreCase("Y")){
                con = true;
                done = true;
            } else if (check.equalsIgnoreCase("N")) {
                con = false;
                done = true;
            }else{
                System.out.println("You have entered an invalid input. Please try again");
            }
        } while (!done);
        return con;
    }





}