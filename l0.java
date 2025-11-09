// ------------------------------------------------------------------------------

// If–Else (Even or Odd)

import java.util.*;

class ProgramTwo {
    public static void main(String[] args) {
        Scanner sc2 = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num2 = sc2.nextInt();
        if (num2 % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}

// ------------------------------------------------------------------------------

// Loops (1 to 10)

class ProgramThree {
    public static void main(String[] args) {
        for (int i3 = 1; i3 <= 10; i3++) {
            System.out.println(i3);
        }
    }
}

// ------------------------------------------------------------------------------

// Arrays (Print 5 numbers)

import java.util.*;

class ProgramFour {
    public static void main(String[] args) {
        int[] arr4 = new int[5];
        Scanner sc4 = new Scanner(System.in);
        for (int i4 = 0; i4 < 5; i4++) {
            arr4[i4] = sc4.nextInt();
        }
        for (int num4 : arr4) {
            System.out.print(num4 + " ");
        }
    }
}

// ------------------------------------------------------------------------------

// Functions (Add 2 numbers)

class ProgramFive {
    static int add5(int a5, int b5) {
        return a5 + b5;
    }
    public static void main(String[] args) {
        int sum5 = add5(10, 20);
        System.out.println(sum5);
    }
}

// ------------------------------------------------------------------------------

// Sum of N Numbers

import java.util.*;

class ProgramSix {
    public static void main(String[] args) {
        Scanner sc6 = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n6 = sc6.nextInt();
        int sum6 = 0;
        for (int i6 = 0; i6 < n6; i6++) {
            int num6 = sc6.nextInt();
            sum6 += num6;
        }
        System.out.println("Sum = " + sum6);
    }
}

// ------------------------------------------------------------------------------

// Factorial of a Number

import java.util.*;

class ProgramSeven {
    public static void main(String[] args) {
        Scanner sc7 = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n7 = sc7.nextInt();
        int fact7 = 1;
        for (int i7 = 1; i7 <= n7; i7++) {
            fact7 *= i7;
        }
        System.out.println("Factorial = " + fact7);
    }
}

// ------------------------------------------------------------------------------

// Find Maximum in an Array

import java.util.*;

class ProgramEight {
    public static void main(String[] args) {
        Scanner sc8 = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n8 = sc8.nextInt();
        int[] arr8 = new int[n8];
        for (int i8 = 0; i8 < n8; i8++) {
            arr8[i8] = sc8.nextInt();
        }
        int max8 = arr8[0];
        for (int i8 = 1; i8 < n8; i8++) {
            if (arr8[i8] > max8)
                max8 = arr8[i8];
        }
        System.out.println("Maximum value = " + max8);
    }
}

// ------------------------------------------------------------------------------

// Count Digits in a Number

import java.util.*;

class ProgramNine {
    public static void main(String[] args) {
        Scanner sc9 = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n9 = sc9.nextInt();
        int count9 = 0;
        while (n9 > 0) {
            n9 /= 10;
            count9++;
        }
        System.out.println("Number of digits = " + count9);
    }
}

// ------------------------------------------------------------------------------

// Reverse a String

import java.util.*;

class ProgramTen {
    public static void main(String[] args) {
        Scanner sc10 = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s10 = sc10.nextLine();
        String rev10 = "";
        for (int i10 = s10.length() - 1; i10 >= 0; i10--) {
            rev10 += s10.charAt(i10);
        }
        System.out.println("Reversed string: " + rev10);
    }
}

// ------------------------------------------------------------------------------

// Square of Stars

import java.util.*;

class ProgramEleven {
    public static void main(String[] args) {
        Scanner sc11 = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n11 = sc11.nextInt();
        for (int i11 = 0; i11 < n11; i11++) {
            for (int j11 = 0; j11 < n11; j11++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

// ------------------------------------------------------------------------------

// Right Triangle Pattern

import java.util.*;

class ProgramTwelve {
    public static void main(String[] args) {
        Scanner sc12 = new Scanner(System.in);
        System.out.print("Enter height: ");
        int n12 = sc12.nextInt();
        for (int i12 = 1; i12 <= n12; i12++) {
            for (int j12 = 1; j12 <= i12; j12++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

// ------------------------------------------------------------------------------

// Inverted Triangle

import java.util.*;

class ProgramThirteen {
    public static void main(String[] args) {
        Scanner sc13 = new Scanner(System.in);
        System.out.print("Enter height: ");
        int n13 = sc13.nextInt();
        for (int i13 = n13; i13 >= 1; i13--) {
            for (int j13 = 1; j13 <= i13; j13++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

// ------------------------------------------------------------------------------

// Number Triangle

import java.util.*;

class ProgramFourteen {
    public static void main(String[] args) {
        Scanner sc14 = new Scanner(System.in);
        System.out.print("Enter height: ");
        int n14 = sc14.nextInt();
        for (int i14 = 1; i14 <= n14; i14++) {
            for (int j14 = 1; j14 <= i14; j14++) {
                System.out.print(j14);
            }
            System.out.println();
        }
    }
}

// ------------------------------------------------------------------------------

// Pyramid of Stars

import java.util.*;

class ProgramFifteen {
    public static void main(String[] args) {
        Scanner sc15 = new Scanner(System.in);
        System.out.print("Enter height: ");
        int n15 = sc15.nextInt();
        for (int i15 = 1; i15 <= n15; i15++) {
            for (int s15 = 1; s15 <= n15 - i15; s15++) {
                System.out.print(" ");
            }
            for (int j15 = 1; j15 <= 2 * i15 - 1; j15++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

// ------------------------------------------------------------------------------

// Check Even or Odd

import java.util.*;

class ProgramSixteen {
    public static void main(String[] args) {
        Scanner sc16 = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n16 = sc16.nextInt();
        if (n16 % 2 == 0)
            System.out.println("Even number");
        else
            System.out.println("Odd number");
    }
}

// ------------------------------------------------------------------------------

// Check Prime Number

import java.util.*;

class ProgramSeventeen {
    public static void main(String[] args) {
        Scanner sc17 = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n17 = sc17.nextInt();
        boolean isPrime17 = true;

        if (n17 <= 1) isPrime17 = false;
        else {
            for (int i17 = 2; i17 <= Math.sqrt(n17); i17++) {
                if (n17 % i17 == 0) {
                    isPrime17 = false;
                    break;
                }
            }
        }

        if (isPrime17)
            System.out.println("Prime number");
        else
            System.out.println("Not prime");
    }
}

// ------------------------------------------------------------------------------

// Fibonacci Series

import java.util.*;

class ProgramEighteen {
    public static void main(String[] args) {
        Scanner sc18 = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n18 = sc18.nextInt();
        int a18 = 0, b18 = 1;
        System.out.print(a18 + " " + b18 + " ");
        for (int i18 = 2; i18 < n18; i18++) {
            int c18 = a18 + b18;
            System.out.print(c18 + " ");
            a18 = b18;
            b18 = c18;
        }
    }
}

// ------------------------------------------------------------------------------

// Linear Search
    
import java.util.*;

class ProgramNineteen {
    public static void main(String[] args) {
        Scanner sc19 = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n19 = sc19.nextInt();
        int[] arr19 = new int[n19];
        System.out.println("Enter elements:");
        for (int i19 = 0; i19 < n19; i19++) arr19[i19] = sc19.nextInt();

        System.out.print("Enter target: ");
        int target19 = sc19.nextInt();
        boolean found19 = false;

        for (int i19 = 0; i19 < n19; i19++) {
            if (arr19[i19] == target19) {
                System.out.println("Found at index " + i19);
                found19 = true;
                break;
            }
        }
        if (!found19) System.out.println("Not found");
    }
}

// ------------------------------------------------------------------------------

// Bubble Sort
    
import java.util.*;

class ProgramTwenty {
    public static void main(String[] args) {
        Scanner sc20 = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n20 = sc20.nextInt();
        int[] arr20 = new int[n20];
        for (int i20 = 0; i20 < n20; i20++) arr20[i20] = sc20.nextInt();

        for (int i20 = 0; i20 < n20 - 1; i20++) {
            for (int j20 = 0; j20 < n20 - i20 - 1; j20++) {
                if (arr20[j20] > arr20[j20 + 1]) {
                    int temp20 = arr20[j20];
                    arr20[j20] = arr20[j20 + 1];
                    arr20[j20 + 1] = temp20;
                }
            }
        }

        System.out.println("Sorted array:");
        for (int num20 : arr20)
            System.out.print(num20 + " ");
    }
}

// ------------------------------------------------------------------------------
