package com.perscholas.java_basics;

import java.util.Scanner;

public class JavaBasics {

    private static final double PI = 3.141592653589793238462643383279502884197;
    public static void main(String[] args) {
//        PA303_2_1();
        PA303_2_2();
    }

    private static void PA303_2_1() {
//● Write a program that declares two integer variables, assigns an integer to each, and
//        adds them together. Assign the sum to a variable. Print out the result.
        int int1 = 3, int2 = 5, intSum = int1+int2;
        System.out.println("The sum or '"+int1+"' + '"+int2+"' is '"+intSum+"'");
//● Write a program that declares two double variables, assigns a number to each, and
//        adds them together. Assign the sum to a variable. Print out the result.
        double double1 = 5.0, double2 = 7.0, doubleSum = double1+double2;
        System.out.println("The sum or '"+double1+"' + '"+double2+"' is '"+doubleSum+"'");
//● Write a program that declares an integer variable and a double variable, assigns
//        numbers to each, and adds them together. Assign the sum to a variable. Print out the
//        result. What variable type must the sum be?
        var sumIntDoub = int1+double1;
        System.out.println("After adding '"+int1+"' and '"+double1+"' together,"
                +" the result is '"+sumIntDoub+"', which is a double thanks to '"+double1+"'");
//● Write a program that declares two integer variables, assigns an integer to each, and
//        divides the larger number by the smaller number. Assign the result to a variable. Print
//        out the result. Now change the larger number to a decimal. What happens? What
//        corrections are needed?
        int intDiv = int2/int1;
        System.out.println("The result of '"+int2+"'/'"+int1+"' will be '"+intDiv+"',\n"
                +"which will truncate the decimal since integers don't store decimal values");
//● Write a program that declares two double variables, assigns a number to each, and
//        divides the larger by the smaller number. Assign the result to a variable. Print out the
//        result. Now, cast the result to an integer. Print out the result again.
        double doubleDiv = double2/double1;
        System.out.println("Conversely, '"+double2+"'/'"+double1+"' will be '"+doubleDiv+"',\n"
                +"and that value type casted as an integer is '"+(int) doubleDiv+"'");
//● Write a program that declares two integer variables, x and y, and assigns the number 5
//        to x and the number 6 to y. Declare a variable q and assign y/x to it and print q. Now,
//        cast y to a double and assign it to q. Print q again.
        int x = 5, y = 6;
        double q = y/x;
        System.out.println("Using x="+x+" and y="+y+", q = x/y = "+q+"; but also q = ((double) y)/x = "
                +((double) y)/x);
//● Write a program that declares a named constant and uses it in a calculation. Print the
//        result.
        System.out.println("Constant value PI = "+ PI);
//● Write a program where you create three variables that represent products at a cafe.
//        The products could be beverages like coffee, cappuccino, espresso, green tea, etc.
//        Assign prices to each product. Create two more variables called subtotal and totalSale
//        and complete an “order” for three items of the first product, four items of the second
//        product, and two items of the third product. Add them all together to calculate the
//        subtotal. Create a constant called SALES_TAX and add sales tax to the subtotal to
//        obtain the totalSale amount. Be sure to format the results to two decimal places.
        final double SALES_TAX = 0.08725;

        Product item1 = new Product("coffee", 2.50, 3);
        Product item2 = new Product("cappuccino", 5.50, 4);
        Product item3 = new Product("green tea", 3.50, 2);

        double subtotal = item1.price*item1.count + item2.price*item2.count + item3.price*item3.count;
        double totalSale = subtotal*(1+SALES_TAX);
        System.out.printf("The final sales is $%1.2f%n", totalSale);
    }

    private static void PA303_2_2() {
        // This section is completed on HackerRank.com.  I'll be pasting the code I submit there to here
        //  so that I can have a reference.

        // ********************
        // java Stdin and Stdout I
        // ********************
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        // ********************
        // java Stdin and Stdout II
        // ********************
        int i = scan.nextInt();
        // Write your code here.
        double d = scan.nextDouble();
        scan.nextLine(); // dummy nextLine to correct the '\n' scanner is sitting on.
        String s = scan.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
        scan.close();
    }
}

class Product {
    String name;
    double price;
    int count;
    Product(String name, double price, int count) {
        this.name = name;
        this.price = price;
        this.count = count;
    }
}
