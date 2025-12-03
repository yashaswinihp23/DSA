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

// ------------------------------------------------------------------------------

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

// ------------------------------------------------------------------------------

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

// ------------------------------------------------------------------------------

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

// ------------------------------------------------------------------------------

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

// PATTERNS

// ------------------------------------------------------------------------------

// Number Triangle (Left Aligned Increasing Numbers)

class Pattern11 {
    public void printPattern11(int n11) {
        for (int i11 = 1; i11 <= n11; i11++) {
            for (int j11 = 1; j11 <= i11; j11++) {
                System.out.print(j11);
            }
            System.out.println();
        }
    }
}

// Number Triangle (Repeated Row Numbers)

class Pattern12 {
    public void printPattern12(int n12) {
        for (int i12 = 1; i12 <= n12; i12++) {
            for (int j12 = 1; j12 <= i12; j12++) {
                System.out.print(i12);
            }
            System.out.println();
        }
    }
}

// Reverse Number Triangle

class Pattern13 {
    public void printPattern13(int n13) {
        for (int i13 = n13; i13 >= 1; i13--) {
            for (int j13 = 1; j13 <= i13; j13++) {
                System.out.print(j13);
            }
            System.out.println();
        }
    }
}

// Reverse Star Triangle

class Pattern14 {
    public void printPattern14(int n14) {
        for (int i14 = n14; i14 >= 1; i14--) {
            for (int j14 = 1; j14 <= i14; j14++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

// Right-Aligned Star Triangle

class Pattern15 {
    public void printPattern15(int n15) {
        for (int i15 = 1; i15 <= n15; i15++) {
            for (int s15 = n15 - i15; s15 > 0; s15--) {
                System.out.print(" ");
            }
            for (int j15 = 1; j15 <= i15; j15++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

// ------------------------------------------------------------------------------

// Full Pyramid (Centered Stars)

class Pattern16 {
    public void printPattern16(int n16) {
        for (int i16 = 1; i16 <= n16; i16++) {
            for (int s16 = n16 - i16; s16 > 0; s16--) {
                System.out.print(" ");
            }
            for (int j16 = 1; j16 <= 2 * i16 - 1; j16++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

// ------------------------------------------------------------------------------

// Inverted Full Pyramid

class Pattern17 {
    public void printPattern17(int n17) {
        for (int i17 = n17; i17 >= 1; i17--) {
            for (int s17 = n17 - i17; s17 > 0; s17--) {
                System.out.print(" ");
            }
            for (int j17 = 1; j17 <= 2 * i17 - 1; j17++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

// ------------------------------------------------------------------------------

// Diamond Pattern

class Pattern18 {
    public void printPattern18(int n18) {

        for (int i18 = 1; i18 <= n18; i18++) {
            for (int s18 = n18 - i18; s18 > 0; s18--) {
                System.out.print(" ");
            }
            for (int j18 = 1; j18 <= 2 * i18 - 1; j18++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i18 = n18 - 1; i18 >= 1; i18--) {
            for (int s18 = n18 - i18; s18 > 0; s18--) {
                System.out.print(" ");
            }
            for (int j18 = 1; j18 <= 2 * i18 - 1; j18++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

// ------------------------------------------------------------------------------

// Number Pyramid

class Pattern19 {
    public void printPattern19(int n19) {
        for (int i19 = 1; i19 <= n19; i19++) {
            for (int s19 = n19 - i19; s19 > 0; s19--) {
                System.out.print(" ");
            }
            for (int j19 = 1; j19 <= i19; j19++) {
                System.out.print(j19);
            }
            for (int k19 = i19 - 1; k19 >= 1; k19--) {
                System.out.print(k19);
            }
            System.out.println();
        }
    }
}

// ------------------------------------------------------------------------------

// Hollow Square

class Pattern20 {
    public void printPattern20(int n20) {
        for (int i20 = 1; i20 <= n20; i20++) {
            for (int j20 = 1; j20 <= n20; j20++) {
                if (i20 == 1 || i20 == n20 || j20 == 1 || j20 == n20)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}

// ------------------------------------------------------------------------------

// Hollow Pyramid

class Pattern21 {
    public void printPattern21(int n21) {
        for (int i21 = 1; i21 <= n21; i21++) {
            for (int s21 = n21 - i21; s21 > 0; s21--) {
                System.out.print(" ");
            }
            for (int j21 = 1; j21 <= 2 * i21 - 1; j21++) {
                if (j21 == 1 || j21 == 2 * i21 - 1 || i21 == n21)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}

// ------------------------------------------------------------------------------

// Hollow Inverted Pyramid

class Pattern22 {
    public void printPattern22(int n22) {
        for (int i22 = n22; i22 >= 1; i22--) {
            for (int s22 = n22 - i22; s22 > 0; s22--) {
                System.out.print(" ");
            }
            for (int j22 = 1; j22 <= 2 * i22 - 1; j22++) {
                if (j22 == 1 || j22 == 2 * i22 - 1 || i22 == n22)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}


// ------------------------------------------------------------------------------

// Hollow Inverted Pyramid

class Pattern22 {
    public void printPattern22(int n22) {
        for (int i22 = n22; i22 >= 1; i22--) {
            for (int s22 = n22 - i22; s22 > 0; s22--) {
                System.out.print(" ");
            }
            for (int j22 = 1; j22 <= 2 * i22 - 1; j22++) {
                if (j22 == 1 || j22 == 2 * i22 - 1 || i22 == n22)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}

// ------------------------------------------------------------------------------

// Floyd’s Triangle

class Pattern26 {
    public void printPattern26(int n26) {
        int num26 = 1;
        for (int i26 = 1; i26 <= n26; i26++) {
            for (int j26 = 1; j26 <= i26; j26++) {
                System.out.print(num26++ + " ");
            }
            System.out.println();
        }
    }
}

// ------------------------------------------------------------------------------

// Inverted Number Triangle

class Pattern36 {
    public void printPattern36(int n36) {
        for (int i36 = n36; i36 >= 1; i36--) {
            for (int j36 = 1; j36 <= i36; j36++) {
                System.out.print(j36);
            }
            System.out.println();
        }
    }
}

// ------------------------------------------------------------------------------

// Continuous Increasing Number Triangle

class Pattern37 {
    public void printPattern37(int n37) {
        int num37 = 1;
        for (int i37 = 1; i37 <= n37; i37++) {
            for (int j37 = 1; j37 <= i37; j37++) {
                System.out.print(num37++ + " ");
            }
            System.out.println();
        }
    }
}
    
// ------------------------------------------------------------------------------

// Palindrome Number Triangle

class Pattern38 {
    public void printPattern38(int n38) {
        for (int i38 = 1; i38 <= n38; i38++) {
            for (int j38 = 1; j38 <= i38; j38++) System.out.print(j38);
            for (int k38 = i38 - 1; k38 >= 1; k38--) System.out.print(k38);
            System.out.println();
        }
    }
}

// ------------------------------------------------------------------------------

// Alphabet Triangle

class Pattern40 {
    public void printPattern40(int n40) {
        for (int i40 = 1; i40 <= n40; i40++) {
            for (int j40 = 0; j40 < i40; j40++) {
                System.out.print((char)('A' + j40));
            }
            System.out.println();
        }
    }
}

// ------------------------------------------------------------------------------

// Check if Array Is Sorted

class Solution15 {
    public boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) return false;
        }
        return true;
    }
}

// ------------------------------------------------------------------------------

// Count Digits of a Number

class Solution16 {
    public int countDigits(int n) {
        int c = 0;
        while (n > 0) {
            c++;
            n /= 10;
        }
        return c;
    }
}

// ------------------------------------------------------------------------------

// Sum of Digits

class Solution17 {
    public int digitSum(int n) {
        int s = 0;
        while (n > 0) {
            s += n % 10;
            n /= 10;
        }
        return s;
    }
}

// ------------------------------------------------------------------------------

// Reverse a Number

class Solution18 {
    public int reverse(int n) {
        int r = 0;
        while (n > 0) {
            r = r * 10 + (n % 10);
            n /= 10;
        }
        return r;
    }
}

// ------------------------------------------------------------------------------

// Count Even Numbers in Array

class Solution19 {
    public int countEven(int[] arr) {
        int c = 0;
        for (int x : arr) {
            if (x % 2 == 0) c++;
        }
        return c;
    }
}

// ------------------------------------------------------------------------------

// Find Maximum Value in Array

class Solution20 {
    public int maxValue(int[] arr) {
        int m = arr[0];
        for (int x : arr) m = Math.max(m, x);
        return m;
    }
}

// ------------------------------------------------------------------------------

// Reverse a String

class Solution21 {
    public String reverseString(String t) {
        char[] a = t.toCharArray();
        int i = 0, j = a.length - 1;
        while (i < j) {
            char c = a[i];
            a[i] = a[j];
            a[j] = c;
            i++;
            j--;
        }
        return new String(a);
    }
}

// ------------------------------------------------------------------------------

// Count Characters in a String

class Solution22 {
    public int[] freq(String s) {
        int[] f = new int[256];
        for (char c : s.toCharArray()) f[c]++;
        return f;
    }
}

// ------------------------------------------------------------------------------

// Check Palindrome String

class Solution23 {
    public boolean isPal(String x) {
        int i = 0, j = x.length() - 1;
        while (i < j) {
            if (x.charAt(i) != x.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}

// ------------------------------------------------------------------------------

// Print Right-Angle Triangle Pattern

class Solution24 {
    public void pattern(int n) {
        for (int i = 1; i <= n; i++) {
            StringBuilder b = new StringBuilder();
            for (int j = 1; j <= i; j++) b.append('*');
            System.out.println(b.toString());
        }
    }
}

// ------------------------------------------------------------------------------

// Count Words in a Sentence

class Solution25 {
    public int countWords(String s) {
        if (s.length() == 0) return 0;
        String[] p = s.trim().split("\\s+");
        return p.length;
    }
}

// ------------------------------------------------------------------------------

// HashMap — Count Frequencies

import java.util.*;

class Solution26 {
    public Map<Character, Integer> freqMap(String s) {
        Map<Character, Integer> m = new HashMap<>();
        for (char c : s.toCharArray()) {
            m.put(c, m.getOrDefault(c, 0) + 1);
        }
        return m;
    }
}

// ------------------------------------------------------------------------------

// Valid Anagram

import java.util.*;

class Solution27 {
    public boolean isAnagram(String a27, String b27) {
        if (a27.length() != b27.length()) return false;
        int[] f27 = new int[26];
        for (char c27 : a27.toCharArray()) f27[c27 - 'a']++;
        for (char d27 : b27.toCharArray()) f27[d27 - 'a']--;
        for (int x27 : f27) if (x27 != 0) return false;
        return true;
    }
}

// ------------------------------------------------------------------------------

// Move Zeroes

class Solution28 {
    public void moveZeroes(int[] z28) {
        int p28 = 0;
        for (int x28 : z28) if (x28 != 0) z28[p28++] = x28;
        while (p28 < z28.length) z28[p28++] = 0;
    }
}

// ------------------------------------------------------------------------------

// Merge Sorted Array

class Solution29 {
    public void merge(int[] a29, int m29, int[] b29, int n29) {
        int i29 = m29 - 1, j29 = n29 - 1, k29 = m29 + n29 - 1;
        while (j29 >= 0) {
            if (i29 >= 0 && a29[i29] > b29[j29]) a29[k29--] = a29[i29--];
            else a29[k29--] = b29[j29--];
        }
    }
}

// ------------------------------------------------------------------------------

// Intersection of Two Arrays (Unique)

import java.util.*;

class Solution30 {
    public int[] intersection(int[] a30, int[] b30) {
        Set<Integer> s30 = new HashSet<>();
        for (int x30 : a30) s30.add(x30);
        Set<Integer> r30 = new HashSet<>();
        for (int y30 : b30) if (s30.contains(y30)) r30.add(y30);
        int[] ans30 = new int[r30.size()];
        int i30 = 0;
        for (int v30 : r30) ans30[i30++] = v30;
        return ans30;
    }
}

// ------------------------------------------------------------------------------

// Two Pointer — Pair Sum Exists

import java.util.*;

class Solution31 {
    public boolean pairSum(int[] p31, int t31) {
        Arrays.sort(p31);
        int i31 = 0, j31 = p31.length - 1;
        while (i31 < j31) {
            int s31 = p31[i31] + p31[j31];
            if (s31 == t31) return true;
            if (s31 < t31) i31++;
            else j31--;
        }
        return false;
    }
}

// ------------------------------------------------------------------------------

// Remove Duplicates From Sorted Array

class Solution32 {
    public int removeDuplicates(int[] r32) {
        if (r32.length == 0) return 0;
        int p32 = 1;
        for (int i32 = 1; i32 < r32.length; i32++) {
            if (r32[i32] != r32[p32 - 1]) r32[p32++] = r32[i32];
        }
        return p32;
    }
}

// ------------------------------------------------------------------------------

// Contains Duplicate

import java.util.*;

class Solution33 {
    public boolean containsDuplicate(int[] d33) {
        Set<Integer> s33 = new HashSet<>();
        for (int x33 : d33) {
            if (s33.contains(x33)) return true;
            s33.add(x33);
        }
        return false;
    }
}

// ------------------------------------------------------------------------------

// Majority Element

class Solution34 {
    public int majorityElement(int[] a34) {
        int c34 = 0, v34 = 0;
        for (int x34 : a34) {
            if (c34 == 0) v34 = x34;
            c34 += (x34 == v34) ? 1 : -1;
        }
        return v34;
    }
}

// ------------------------------------------------------------------------------

class Solution34 {
    public int majorityElement(int[] a34) {
        int c34 = 0, v34 = 0;
        for (int x34 : a34) {
            if (c34 == 0) v34 = x34;
            c34 += (x34 == v34) ? 1 : -1;
        }
        return v34;
    }
}

// ------------------------------------------------------------------------------

// Max Consecutive Ones

class Solution35 {
    public int findMaxConsecutiveOnes(int[] b35) {
        int m35 = 0, c35 = 0;
        for (int x35 : b35) {
            if (x35 == 1) c35++;
            else c35 = 0;
            if (c35 > m35) m35 = c35;
        }
        return m35;
    }
}

// ------------------------------------------------------------------------------

// First Unique Character in String

class Solution36 {
    public int firstUniqChar(String s36) {
        int[] f36 = new int[26];
        for (char c36 : s36.toCharArray()) f36[c36 - 'a']++;
        for (int i36 = 0; i36 < s36.length(); i36++) {
            if (f36[s36.charAt(i36) - 'a'] == 1) return i36;
        }
        return -1;
    }
}

// ------------------------------------------------------------------------------

// Sliding Window – Max Sum of Subarray Size K

class Solution37 {
    public int maxWindow(int[] a37, int k37) {
        int s37 = 0;
        for (int i37 = 0; i37 < k37; i37++) s37 += a37[i37];
        int m37 = s37;
        for (int i37 = k37; i37 < a37.length; i37++) {
            s37 += a37[i37] - a37[i37 - k37];
            if (s37 > m37) m37 = s37;
        }
        return m37;
    }
}

// ------------------------------------------------------------------------------

// Prefix Sum – Subarray Sum Equals K

import java.util.*;

class Solution38 {
    public int subarraySum(int[] x38, int k38) {
        Map<Integer,Integer> m38 = new HashMap<>();
        m38.put(0,1);
        int s38 = 0, c38 = 0;
        for (int v38 : x38) {
            s38 += v38;
            if (m38.containsKey(s38 - k38)) c38 += m38.get(s38 - k38);
            m38.put(s38, m38.getOrDefault(s38,0)+1);
        }
        return c38;
    }
}

// ------------------------------------------------------------------------------

// Sliding Window – Longest Substring Without Repeating Characters

import java.util.*;

class Solution39 {
    public int lengthOfLongestSubstring(String s39) {
        Set<Character> set39 = new HashSet<>();
        int i39 = 0, j39 = 0, m39 = 0;
        while (j39 < s39.length()) {
            if (!set39.contains(s39.charAt(j39))) {
                set39.add(s39.charAt(j39++));
                m39 = Math.max(m39, j39 - i39);
            } else {
                set39.remove(s39.charAt(i39++));
            }
        }
        return m39;
    }
}

// ------------------------------------------------------------------------------

// Binary Search (Classic)

class Solution40 {
    public int binarySearch(int[] a40, int t40) {
        int l40 = 0, r40 = a40.length - 1;
        while (l40 <= r40) {
            int m40 = l40 + (r40 - l40) / 2;
            if (a40[m40] == t40) return m40;
            if (a40[m40] < t40) l40 = m40 + 1;
            else r40 = m40 - 1;
        }
        return -1;
    }
}

// ------------------------------------------------------------------------------

// Search in Rotated Sorted Array

class Solution41 {
    public int search(int[] a41, int t41) {
        int l41 = 0, r41 = a41.length - 1;
        while (l41 <= r41) {
            int m41 = l41 + (r41 - l41) / 2;
            if (a41[m41] == t41) return m41;
            if (a41[l41] <= a41[m41]) {
                if (t41 >= a41[l41] && t41 < a41[m41]) r41 = m41 - 1;
                else l41 = m41 + 1;
            } else {
                if (t41 > a41[m41] && t41 <= a41[r41]) l41 = m41 + 1;
                else r41 = m41 - 1;
            }
        }
        return -1;
    }
}

// ------------------------------------------------------------------------------

// Find Peak Element

class Solution42 {
    public int findPeak(int[] a42) {
        int l42 = 0, r42 = a42.length - 1;
        while (l42 < r42) {
            int m42 = l42 + (r42 - l42) / 2;
            if (a42[m42] > a42[m42 + 1]) r42 = m42;
            else l42 = m42 + 1;
        }
        return l42;
    }
}

// ------------------------------------------------------------------------------

// Valid Parentheses

import java.util.*;

class Solution43 {
    public boolean isValid(String s43) {
        Stack<Character> st43 = new Stack<>();
        for (char c43 : s43.toCharArray()) {
            if (c43 == '(' || c43 == '{' || c43 == '[') st43.push(c43);
            else {
                if (st43.isEmpty()) return false;
                char t43 = st43.pop();
                if (c43 == ')' && t43 != '(') return false;
                if (c43 == '}' && t43 != '{') return false;
                if (c43 == ']' && t43 != '[') return false;
            }
        }
        return st43.isEmpty();
    }
}

// ------------------------------------------------------------------------------

// Min Stack

import java.util.*;

class Solution44 {
    Stack<Integer> s44 = new Stack<>();
    Stack<Integer> m44 = new Stack<>();
    public void push(int x44) {
        s44.push(x44);
        if (m44.isEmpty() || x44 <= m44.peek()) m44.push(x44);
    }
    public void pop() {
        if (s44.peek().equals(m44.peek())) m44.pop();
        s44.pop();
    }
    public int top() {
        return s44.peek();
    }
    public int getMin() {
        return m44.peek();
    }
}

// ------------------------------------------------------------------------------

// Remove Adjacent Duplicates

class Solution45 {
    public String removeDup(String s45) {
        StringBuilder b45 = new StringBuilder();
        for (char c45 : s45.toCharArray()) {
            int n45 = b45.length();
            if (n45 > 0 && b45.charAt(n45 - 1) == c45) b45.deleteCharAt(n45 - 1);
            else b45.append(c45);
        }
        return b45.toString();
    }
}

// ------------------------------------------------------------------------------

// Sort Array By Parity

class Solution {
    public int[] sortArrayByParity(int[] a) {
        int l = 0, r = a.length - 1;
        while (l < r) {
            if (a[l] % 2 > a[r] % 2) {
                int t = a[l];
                a[l] = a[r];
                a[r] = t;
            }
            if (a[l] % 2 == 0) l++;
            if (a[r] % 2 == 1) r--;
        }
        return a;
    }
}

// ------------------------------------------------------------------------------

// Majority Element

class Solution {
    public int majorityElement(int[] a) {
        int x = 0, c = 0;
        for (int n : a) {
            if (c == 0) x = n;
            c += (n == x ? 1 : -1);
        }
        return x;
    }
}

// ------------------------------------------------------------------------------

// Find Pivot Index

class Solution {
    public int pivotIndex(int[] a) {
        int s = 0, l = 0;
        for (int v : a) s += v;
        for (int i = 0; i < a.length; i++) {
            if (l == s - l - a[i]) return i;
            l += a[i];
        }
        return -1;
    }
}

// ------------------------------------------------------------------------------
