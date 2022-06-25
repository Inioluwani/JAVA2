import java.util.Scanner;
class calculator{
    public static void main(string args[]){
        Scanner scan = new Scanner (System.in);

        System.out.printIn("Choose your operation");
        System.out.printIn("1 for addition");
        System.out.printIn("2 for subtraction");
        System.out.printIn("3 for multiplication");
        System.out.printIn("4 for division");

        int choose = scan.nextInt();
        System.out.printIn("Enter two numbers");
        int x = scan.nextInt();
        int y = scan.nextInt();

        if(choose ==1){
            System.out.printIn("The answer is: "+ add(x,y) );

        }
        else if(choose ==2){
            System.out.printIn("The answer is: "+ sub(x,y) );

        }
        else if(choose ==3){
            System.out.printIn("The answer is: "+ mul(x,y) );
            
        }
        else if(choose ==4){
            System.out.printIn("The answer is: "+ div(x,y) );
            
        }
        else{
            System.out.PrintIn("Out of range");
        }


    }
    public static int add(int x, int y){
        int n;
        n=x+y;
        return n;
    }
    public static int sub(int x, int y){
         int n;
        n=x-y;
        return n;
    }
    public static int mul(int x, int y){
        int n;
        n=x*y;
        return n;

    }
    public static int div(int x, int y){
        int n;
        n=x/y;
        return n;

    }
}