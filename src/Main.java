import java.util.Scanner;

public class Main {

    public static int lcm (int num1, int num2) {


        //if any number is zero, the lcm is zero
        if (num1==0 || num2==0){return 0;}

        //ensuring the lcm is postive if any inputted numbers are negative
        int absoluteNum1 = Math.abs(num1);
        int absoluteNum2 = Math.abs(num2);

        int higherNum = Math.max(absoluteNum1,absoluteNum2);
        int lowerNum = Math.min(absoluteNum1,absoluteNum2);

        //Calculating the lcm
        int lcm = higherNum;

        while(lcm % lowerNum !=0) {

            lcm += higherNum;
        }
        return lcm;
    }


    public static int gcd(int num1, int num2) {

        //ensuring the gcd is postive if any inputted numbers are negative
        int absoluteNum1 = Math.abs(num1);
        int absoluteNum2 = Math.abs(num2);

        //calculating gcd
        while (absoluteNum1 != absoluteNum2) {
            if(absoluteNum1 > absoluteNum2)
                absoluteNum1 = absoluteNum1 - absoluteNum2;
            else
                absoluteNum2 = absoluteNum2 - absoluteNum1;
        }
        return absoluteNum2;

    }


    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Do you wish to calculate lcm or gcd? \n " +
                "'l' for LCM or 'g' for GCD: ");
        String value = sc.nextLine();

        //l selected for lcm
        switch (value) {
            case "l": {

                System.out.print("Please input the first number (e.g. 2 or -2): ");

                int num1 = sc.nextInt();

                System.out.print("Please input the second number (e.g. 2 or -2): ");

                int num2 = sc.nextInt();

                sc.close();


                int lcm = lcm(num1, num2);

                System.out.println("Your Least Common Multiple (LCM) is : " + lcm);

                break;
            }

            case "g": {

                System.out.print("Please input the first number (e.g. 2 or -2): ");

                int num1 = sc.nextInt();

                System.out.print("Please input the second number (e.g. 2 or -2): ");

                int num2 = sc.nextInt();

                sc.close();


                int gcd = gcd(num1, num2);

                System.out.println("Your Greatest Common Denominator (GCD) is : " + gcd);

                break;
            }

            default: {

                System.out.println("WRONG INPUT!!. Try again later");
            }
        }
    }
}
