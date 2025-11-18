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

// Function to Add Two Numbers

import java.util.*;

class ProgramTwentyOne {
    static int add21(int a21, int b21) {
        return a21 + b21;
    }

    public static void main(String[] args) {
        Scanner sc21 = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int x21 = sc21.nextInt();
        int y21 = sc21.nextInt();
        System.out.println("Sum = " + add21(x21, y21));
    }
}

// Check Prime using Function

import java.util.*;

class ProgramTwentyTwo {
    static boolean isPrime22(int n22) {
        if (n22 <= 1) return false;
        for (int i22 = 2; i22 <= Math.sqrt(n22); i22++) {
            if (n22 % i22 == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc22 = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num22 = sc22.nextInt();
        if (isPrime22(num22))
            System.out.println("Prime");
        else
            System.out.println("Not Prime");
    }
}

️// Factorial using Recursion

import java.util.*;

class ProgramTwentyThree {
    static int fact23(int n23) {
        if (n23 == 0 || n23 == 1) return 1;
        return n23 * fact23(n23 - 1);
    }

    public static void main(String[] args) {
        Scanner sc23 = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num23 = sc23.nextInt();
        System.out.println("Factorial = " + fact23(num23));
    }
}

// Sum of Digits using Recursion

import java.util.*;

class ProgramTwentyFour {
    static int sumDigits24(int n24) {
        if (n24 == 0) return 0;
        return (n24 % 10) + sumDigits24(n24 / 10);
    }

    public static void main(String[] args) {
        Scanner sc24 = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num24 = sc24.nextInt();
        System.out.println("Sum of digits = " + sumDigits24(num24));
    }
}

// Basic OOP — Class & Object

class Student25 {
    String name25;
    int age25;

    void display25() {
        System.out.println("Name: " + name25 + ", Age: " + age25);
    }
}

class ProgramTwentyFive {
    public static void main(String[] args) {
        Student25 s25 = new Student25();
        s25.name25 = "Raju";
        s25.age25 = 20;
        s25.display25();
    }
}

// ------------------------------------------------------------------------------

//Constructor Example

class Car26 {
    String brand26;
    int year26;

    Car26() {
        brand26 = "Unknown";
        year26 = 0;
    }

    Car26(String b26, int y26) {
        brand26 = b26;
        year26 = y26;
    }

    void display26() {
        System.out.println(brand26 + " - " + year26);
    }
}

class ProgramTwentySix {
    public static void main(String[] args) {
        Car26 c261 = new Car26();
        Car26 c262 = new Car26("Toyota", 2022);
        c261.display26();
        c262.display26();
    }
}

️// Inheritance

class Animal27 {
    void sound27() {
        System.out.println("Animal makes sound");
    }
}

class Dog27 extends Animal27 {
    void sound27() {
        System.out.println("Dog barks");
    }
}

class ProgramTwentySeven {
    public static void main(String[] args) {
        Dog27 d27 = new Dog27();
        d27.sound27();
    }
}

️// Method Overriding (Polymorphism)

class Shape28 {
    void draw28() {
        System.out.println("Drawing shape");
    }
}

class Circle28 extends Shape28 {
    void draw28() {
        System.out.println("Drawing circle");
    }
}

class Square28 extends Shape28 {
    void draw28() {
        System.out.println("Drawing square");
    }
}

class ProgramTwentyEight {
    public static void main(String[] args) {
        Shape28 s28;
        s28 = new Circle28();
        s28.draw28();
        s28 = new Square28();
        s28.draw28();
    }
}

// Encapsulation

class BankAccount29 {
    private double balance29;

    public void deposit29(double amount29) {
        balance29 += amount29;
    }

    public void withdraw29(double amount29) {
        if (amount29 <= balance29)
            balance29 -= amount29;
        else
            System.out.println("Insufficient balance");
    }

    public double getBalance29() {
        return balance29;
    }
}

class ProgramTwentyNine {
    public static void main(String[] args) {
        BankAccount29 acc29 = new BankAccount29();
        acc29.deposit29(1000);
        acc29.withdraw29(200);
        System.out.println("Current Balance: " + acc29.getBalance29());
    }
}

// Abstraction

abstract class Vehicle30 {
    abstract void start30();
    void stop30() {
        System.out.println("Vehicle stopped");
    }
}

class Bike30 extends Vehicle30 {
    void start30() {
        System.out.println("Bike started");
    }
}

class ProgramThirty {
    public static void main(String[] args) {
        Vehicle30 v30 = new Bike30();
        v30.start30();
        v30.stop30();
    }
}

// ------------------------------------------------------------------------------

// Find Minimum in Array

import java.util.*;

class ProgramThirtyOne {
    public static void main(String[] args) {
        Scanner sc31 = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n31 = sc31.nextInt();
        int[] arr31 = new int[n31];
        System.out.println("Enter elements:");
        for (int i31 = 0; i31 < n31; i31++)
            arr31[i31] = sc31.nextInt();

        int min31 = arr31[0];
        for (int num31 : arr31)
            if (num31 < min31)
                min31 = num31;

        System.out.println("Minimum element: " + min31);
    }
}

// ------------------------------------------------------------------------------

// Count Frequency of Elements (Using HashMap)

import java.util.*;

class ProgramThirtyTwo {
    public static void main(String[] args) {
        Scanner sc32 = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n32 = sc32.nextInt();
        int[] arr32 = new int[n32];
        for (int i32 = 0; i32 < n32; i32++)
            arr32[i32] = sc32.nextInt();

        Map<Integer, Integer> freq32 = new HashMap<>();
        for (int num32 : arr32)
            freq32.put(num32, freq32.getOrDefault(num32, 0) + 1);

        for (Map.Entry<Integer, Integer> e32 : freq32.entrySet())
            System.out.println(e32.getKey() + " -> " + e32.getValue());
    }
}

// ------------------------------------------------------------------------------

// Check Palindrome String

import java.util.*;

class ProgramThirtyFour {
    public static void main(String[] args) {
        Scanner sc34 = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str34 = sc34.nextLine();

        int l34 = 0, r34 = str34.length() - 1;
        boolean isPal34 = true;
        while (l34 < r34) {
            if (str34.charAt(l34) != str34.charAt(r34)) {
                isPal34 = false;
                break;
            }
            l34++;
            r34--;
        }

        if (isPal34)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}

// ------------------------------------------------------------------------------

// Binary Search

import java.util.*;

class ProgramThirtyFive {
    public static void main(String[] args) {
        Scanner sc35 = new Scanner(System.in);
        System.out.print("Enter sorted array size: ");
        int n35 = sc35.nextInt();
        int[] arr35 = new int[n35];
        for (int i35 = 0; i35 < n35; i35++)
            arr35[i35] = sc35.nextInt();

        System.out.print("Enter target element: ");
        int target35 = sc35.nextInt();

        int left35 = 0, right35 = n35 - 1, result35 = -1;
        while (left35 <= right35) {
            int mid35 = left35 + (right35 - left35) / 2;
            if (arr35[mid35] == target35) {
                result35 = mid35;
                break;
            } else if (arr35[mid35] < target35)
                left35 = mid35 + 1;
            else
                right35 = mid35 - 1;
        }

        if (result35 != -1)
            System.out.println("Element found at index " + result35);
        else
            System.out.println("Element not found");
    }
}

// ------------------------------------------------------------------------------

// Selection Sort

import java.util.*;

class ProgramThirtySix {
    public static void main(String[] args) {
        Scanner sc36 = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n36 = sc36.nextInt();
        int[] arr36 = new int[n36];

        for (int i36 = 0; i36 < n36; i36++)
            arr36[i36] = sc36.nextInt();

        for (int i36 = 0; i36 < n36 - 1; i36++) {
            int minIndex36 = i36;
            for (int j36 = i36 + 1; j36 < n36; j36++) {
                if (arr36[j36] < arr36[minIndex36])
                    minIndex36 = j36;
            }
            int temp36 = arr36[i36];
            arr36[i36] = arr36[minIndex36];
            arr36[minIndex36] = temp36;
        }

        for (int x36 : arr36)
            System.out.print(x36 + " ");
    }
}

// Insertion Sort

import java.util.*;

class ProgramThirtySeven {
    public static void main(String[] args) {
        Scanner sc37 = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n37 = sc37.nextInt();
        int[] arr37 = new int[n37];

        for (int i37 = 0; i37 < n37; i37++)
            arr37[i37] = sc37.nextInt();

        for (int i37 = 1; i37 < n37; i37++) {
            int key37 = arr37[i37];
            int j37 = i37 - 1;
            while (j37 >= 0 && arr37[j37] > key37) {
                arr37[j37 + 1] = arr37[j37];
                j37--;
            }
            arr37[j37 + 1] = key37;
        }

        for (int num37 : arr37)
            System.out.print(num37 + " ");
    }
}

// Matrix Input + Print

import java.util.*;

class ProgramThirtyEight {
    public static void main(String[] args) {
        Scanner sc38 = new Scanner(System.in);
        System.out.print("Rows: ");
        int r38 = sc38.nextInt();
        System.out.print("Cols: ");
        int c38 = sc38.nextInt();

        int[][] mat38 = new int[r38][c38];

        for (int i38 = 0; i38 < r38; i38++)
            for (int j38 = 0; j38 < c38; j38++)
                mat38[i38][j38] = sc38.nextInt();

        for (int i38 = 0; i38 < r38; i38++) {
            for (int j38 = 0; j38 < c38; j38++)
                System.out.print(mat38[i38][j38] + " ");
            System.out.println();
        }
    }
}

// Transpose of Matrix

import java.util.*;

class ProgramThirtyNine {
    public static void main(String[] args) {
        Scanner sc39 = new Scanner(System.in);
        System.out.print("Rows: ");
        int r39 = sc39.nextInt();
        System.out.print("Cols: ");
        int c39 = sc39.nextInt();

        int[][] mat39 = new int[r39][c39];

        for (int i39 = 0; i39 < r39; i39++)
            for (int j39 = 0; j39 < c39; j39++)
                mat39[i39][j39] = sc39.nextInt();

        int[][] trans39 = new int[c39][r39];
        for (int i39 = 0; i39 < r39; i39++)
            for (int j39 = 0; j39 < c39; j39++)
                trans39[j39][i39] = mat39[i39][j39];

        for (int i39 = 0; i39 < c39; i39++) {
            for (int j39 = 0; j39 < r39; j39++)
                System.out.print(trans39[i39][j39] + " ");
            System.out.println();
        }
    }
}

// ------------------------------------------------------------------------------

// Reverse Words in a String

import java.util.*;

class ProgramForty {
    public static void main(String[] args) {
        Scanner sc40 = new Scanner(System.in);
        String str40 = sc40.nextLine();

        String[] parts40 = str40.split(" ");
        int left40 = 0, right40 = parts40.length - 1;

        while (left40 < right40) {
            String temp40 = parts40[left40];
            parts40[left40] = parts40[right40];
            parts40[right40] = temp40;

            left40++;
            right40--;
        }

        System.out.println(String.join(" ", parts40));
    }
}

// ------------------------------------------------------------------------------
