package com.perscholas.java_basics;

import java.util.Random;
import java.util.Scanner;

public class JavaBasics {

    private static final double PI = 3.141592653589793238462643383279502884197;
    public static void main(String[] args) {
        PA_303_2_1();
        PA_303_2_2();
        PA_303_2_3();
    }

    private static void PA_303_2_1() {
        System.out.println("**************************************************\n"
                +"PA 303.2.1 - Core Java - Variables\n"
                +"**************************************************");
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
        System.out.printf("The final sales is $%1.2f%n%n", totalSale);
    }

    private static void PA_303_2_2() {
        System.out.println("**************************************************\n"
                +"PA 303.2.2 - Core Java - Scanner Class\n"
                +"**************************************************");
        // This section is completed on HackerRank.com.  I'll be pasting the code I submit there to here
        //  so that I can have a reference.

        // ********************
        // java Stdin and Stdout I
        // ********************
        String fixedInput = "42\n100\n125\n42\n3.1415\nWelcome to HackerRank's Java tutorials!\n";
        Scanner scan =
//                new Scanner(System.in);
                new Scanner(fixedInput);
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
        System.out.println();
    }

    private static void PA_303_2_3() {
        System.out.println("**************************************************\n"
                +"PA 303.2.3 - Operators and Numbers\n"
                +"**************************************************");

//        1. Write a program that declares an integer a variable x, assigns the value 2 to it, and
//        prints out the binary string version of the number ( Integer.toBinaryString(x) ). Now,
//        use the left shift operator (<<) to shift by 1 and assign the result to x. Before printing
//        the results, write a comment with the predicted decimal value and binary string. Now,
//        print out x in decimal form and in binary notation.
//        Perform the preceding exercise with the following values:
//                    a. 9
//                    b. 17
//                    c. 88
        System.out.print("1. ");
        int[] xPart1 = {2, 9, 17, 88};
        for (int i=0; i < xPart1.length; i++){
            System.out.print("\tx: "+Integer.toBinaryString(xPart1[i])+"; x <<= 1 = ");
            xPart1[i] <<= 1; // x == {4, 18, 34, 176}
            System.out.println(Integer.toBinaryString(xPart1[i])+" ("+xPart1[i]+")");
        }
//        2. Write a program that declares a variable x, and assigns 150 to it, and prints out the
//        binary string version of the number. Now use the right shift operator (>>) to shift by 2
//        and assign the result to x. Write a comment indicating what you anticipate the
//        decimal and binary values to be. Now print the value of x and the binary string.
//        Perform the preceding exercise with the following values:
//                    a. 225
//                    b. 1555
//                    c. 32456
        System.out.print("\n2. ");
        int[] xPart2 = {150, 225, 1555, 32456};
        // the binary values: { 1001 0110,
        //                      1110 0001,
        //                 0110 0001 0011,
        //            0111 1110 1100 1000 }
        for (int i=0; i < xPart2.length; i++){
            System.out.print("\tx: "+Integer.toBinaryString(xPart2[i])+"; x >>= 2 = ");
            xPart2[i] >>= 2;
            // the new binary values: {   10 0101,
            //                            11 1000,
            //                       01 1000 0100,
            //                  01 1111 1011 0010 }
            System.out.println(Integer.toBinaryString(xPart2[i])+" ("+xPart2[i]+")");
        }
//        3. Write a program that declares three int variables: x, y, and z. Assign 7 to x and 17 to y.
//        Write a comment that indicates what you predict will be the result of the bitwise and
//        operation on x and y. Now use the bitwise AND (&) operator to derive the decimal and
//        binary values, and assign the result to z.
        System.out.print("\n3. ");
        int x=7 /*0111*/, y=17 /*1 0001*/, z= x & y; /* 0 0001 */
        System.out.printf("x & y = z: %d (%s)", z, Integer.toBinaryString(z));
//        4. Now, with the preceding values, use the bitwise and operator to calculate the “or”
//        value between x and y. As before, write a comment that indicates what you predict
//        the values to be before printing them out.
        System.out.print("\n4. ");
        z= x | y; /* 1 0111 */
        System.out.printf("x | y = z: %d (%s)", z, Integer.toBinaryString(z) );
//        5. Write a program that declares an integer variable, assigns a number, and uses a
//        postfix increment operator to increase the value. Print the value before and after the
//        increment operator.
        System.out.print("\n5. ");
        int step = 2;
        System.out.print("\tStep started as '"+(step++)+"' and is now '"+step+"'");
//        6. Write a program that demonstrates at least three ways to increment a variable by 1
//        and does this multiple times. Assign a value to an integer variable, print it, increment
//        by 1, print it again, increment by 1, and then print it again.
        System.out.print("\n6. ");
        int moreSteps = new Random().nextInt(1000);
        System.out.println("\tNew using :'"+moreSteps+"'");
        System.out.println("\t\tAddition assignment:\tx+=1\t-> "+(moreSteps+=1));
        System.out.println("\t\tIncrement (pre/post):\t++x \t-> "+(++moreSteps));
        moreSteps = moreSteps + 1;
        System.out.println("\t\tBasic self-assignment:\tx=x+1\t-> "+moreSteps);
//        7. Write a program that declares two integer variables: x, and y, and then assigns 5 to x
//        and 8 to y. Create another variable sum and assign the value of ++x added to y, and
//        print the result. Notice the value of the sum (should be 14). Now change the
//        increment operator to postfix (x++) and re-run the program. Notice what the value of
//        the sum is. The first configuration incremented x, and then calculated the sum, while
//        the second configuration calculated the sum, and then incremented x.
        System.out.print("\n7. ");
        x = 5; y = 8;
        int sum = ++x + y;
        System.out.println("\tsum = ++x + y = '"+sum+"' (14, matches: "+(sum==14)+")");
        sum = x++ + y;
        System.out.println("\tsum = x++ + y = '"+sum+"' (14, matches: "+(sum==14)+")");
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
