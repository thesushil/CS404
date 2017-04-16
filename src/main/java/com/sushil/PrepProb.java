package com.sushil;

import java.util.ArrayList;
import java.util.Scanner;

public class PrepProb {

    public static int indexOfHighestRowSum(int[][] A) {
        int numRows = A.length;
        int numColumns = A[0].length;
        int sum, maxSum = 0, maxSumRow = 0;
        for (int i = 0; i < numRows; i++) {
            sum = 0;
            for (int j = 0; j < numColumns; j++) sum += A[i][j];
            if (sum > maxSum) {
                maxSum = sum;
                maxSumRow = i;
            }
        }
        return maxSumRow;
    }

    public static char[] repeatChars(int[] freq, char[] text) {
        char[] repeatedText = new char[sumOfElements(freq)];
        int textIndex = 0;
        int length = freq.length;
        for (int i = 0; i < length; i++) {
            for (int n = 0; n < freq[i]; n++) repeatedText[textIndex++] = text[i];
        }
        return repeatedText;
    }

    public static int sumOfElements(int[] A) {
        int length = A.length;
        int sum = 0;
        for (int i = 0; i < length; i++) sum += A[i];
        return sum;
    }

    public static void main1(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] last3 = new int[3];
        int i = 0;
        while (true) {
            System.out.print("Enter an integer: ");
            last3[i++] = in.nextInt();
            if (i == 3) i = 0;
            if (last3[0] == last3[1] && last3[1] == last3[2]) break;
        }
        System.out.print("Same entered 3 in a row.");
    }

    public static boolean appearsConsecutively(int[] A, int[] B) {
        int lengthA = A.length;
        int lengthB = B.length;
        for (int i = 0; i < lengthB; i++) {
            if (B[i] != A[0]) continue;
            int j = 1;
            for (; j < lengthA; j++) if ((i + j) >= lengthB || B[i + j] != A[j]) break;
            if (j == lengthA) return true;
        }
        return false;
    }

    public static boolean hasRowWithAllValuesTheSame(int[][] B, int n) {
        for (int r1 = 0; r1 < n; r1++) {
            for (int r2 = r1 + 1; r2 < n; r2++) {
                int j = 0;
                for (; j < n; j++) if (B[r1][j] != B[r2][j]) break;
                if (j == n) return true;
            }
        }
        return false;
    }

    public static boolean allUnique(int[] A) {
        int n = A.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (A[i] == A[j]) return false;
            }
        }
        return true;
    }

    public static boolean allUnique_2D(int[][] B) {
        int n = B.length;
        for (int i1 = 0; i1 < n; i1++) {
            for (int j1 = 0; j1 < n; j1++) {
                for (int i2 = 0; i2 < n; i2++) {
                    for (int j2 = 0; j2 < n; j2++) {
                        if (B[i1][j1] == B[i2][j2] && !(i1 == i2 && j1 == j2)) return false;
                    }
                }
            }
        }
        return true;
    }

    public static void main2(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int m = in.nextInt();

        if (k < m) {
            for (int i = k; i <= m; i++) System.out.printf(" %d", i);
        } else {
            for (int i = k; i >= m; i--) System.out.printf(" %d", i);
        }
    }

    public static boolean hasTwoIdenticalRows(int n, int[][] B) {
        for (int i1 = 0; i1 < n; i1++) {
            for (int i2 = i1 + 1; i2 < n; i2++) {
                int j = 0;
                for (; j < n; j++) {
                    if (B[i1][j] != B[i2][j]) break;
                }
                if (j == n) return true;
            }
        }

        return false;
    }

    public static void main3(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = in.nextInt();
        System.out.print("Enter b: ");
        int b = in.nextInt();

        int pow = 1;
        for (int i = 1; i <= b; i++) pow *= a;

        System.out.printf("%d to the power %d is %d.", a, b, pow);
    }

    public static int howManyInCommon(int[] A, int[] B) {
        int aLen = A.length, bLen = B.length;
        int count = 0;
        for (int i = 0; i < aLen; i++) {
            for (int j = 0; j < bLen; j++) {
                if (A[i] == B[j]) count++;
            }
        }
        return count;
    }

    public static int firstValueThreeInARow(int[] myArray) {
        int n = myArray.length;
        int count = 1;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (myArray[i] == myArray[j]) {
                    if (++count == 3) return myArray[i];
                } else count = 1;
            }
        }
        return -1;
    }

    public static int indexOfFirstPair(int[] myArray) {
        int n = myArray.length;
        for (int i = 0; i < n - 1; i++) {
            if ((i == 0 || myArray[i] != myArray[i - 1])
                    && myArray[i] == myArray[i + 1]
                    && (i == n - 2 || myArray[i] != myArray[i + 2])) {
                return i;
            }
        }
        return -1;
    }

    public static int rangeProduct(int a, int b) {
        int product = 1;
        for (int i = a; i <= b; i++) product *= i;
        return product;
    }

    public static void main4(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> distinctOnes = new ArrayList<>();

        int previous = -1;
        while (true) {
            System.out.print("Enter an int: ");
            int a = in.nextInt();
            if (a == previous) break;
            addIfNew(distinctOnes, a);
            previous = a;
        }

        int n = distinctOnes.size();
        System.out.printf("You entered %d %s.", n, (n > 1 ? "values" : "value"));
    }

    private static void addIfNew(ArrayList<Integer> myArray, int a) {
        int n = myArray.size();
        for (int i = 0; i < n; i++)
            if (myArray.get(i).equals(a)) return;

        myArray.add(a);
    }

    public static void main5(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int amount = in.nextInt(), quarter, nickel, penny;
        quarter = amount / 25;
        int a = amount % 25;
        nickel = a / 5;
        penny = a % 5;

        String formatStr = "To make %d cents, you need:\n%d quarters\n%d nickels\n%d pennies.";
        System.out.printf(formatStr, amount, quarter, nickel, penny);
    }

    public static void howManyEnteredBeforeSeenBoth(int a, int b) {
        Scanner in = new Scanner(System.in);
        int count = 0;
        boolean aWait = true, bWait = true;
        while (aWait || bWait) {
            System.out.print("Enter an integer: ");
            int num = in.nextInt();
            if (num == a) aWait = false;
            else if (num == b) bWait = false;
            count++;
        }
        String formatStr = "You had to enter %d integers\nbefore typing both %d and %d.";
        System.out.printf(formatStr, count, a, b);
    }

    public static int mostFrequentValue(int[] myArray) {
        int n = myArray.length;
        int highestFrequency = 1;
        int mostFrequent = myArray[0];
        for (int i = 0; i < n; i++) {
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (myArray[i] == myArray[j]) count++;
            }
            if (count > highestFrequency) {
                highestFrequency = count;
                mostFrequent = myArray[i];
            }
        }
        return mostFrequent;
    }

    public static int longestRun(int[] myArray) {
        int n = myArray.length;
        int highestFrequency = 1;
        for (int i = 0; i < n; i++) {
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (myArray[i] == myArray[j]) count++;
            }
            if (count > highestFrequency) {
                highestFrequency = count;
            }
        }
        return highestFrequency;
    }

    public static void main6(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int currentVal = in.nextInt();
        int prevVal = currentVal, count = 1;
        while (true) {
            System.out.print("Enter an integer: ");
            currentVal = in.nextInt();
            count++;
            if (currentVal < prevVal) break;
            prevVal = currentVal;
        }

        String formatStr = "You entered %d integers.\nThe last one entered was %d\nand the one before that was %d.";
        System.out.printf(formatStr, count, currentVal, prevVal);
    }

    public static int goingWhichWay(int[] myArray) {
        int order = 333;
        if (myArray[0] < myArray[1]) order = 111;
        else if (myArray[0] > myArray[1]) order = 222;
        else {
            System.out.print("NEITHER");
            return 333;
        }

        int n = myArray.length;
        for (int i = 2; i < n; i++) {
            if (order == 111 && myArray[i] <= myArray[i - 1]) {
                order = 333;
                break;
            } else if (order == 222 && myArray[i] >= myArray[i - 1]) {
                order = 333;
                break;
            }
        }

        if (order == 111) System.out.print("UP");
        else if (order == 222) System.out.print("DOWN");
        else System.out.print("NEITHER");

        return order;
    }

    public static boolean isSumOfTwoDistinctSquares(int n) {
        int half = n / 2;
        for (int i = half; i >= 0; i--)
            for (int j = 0; j < half; j++) {
                if (n == i * i + j * j && i != j) return true;
            }
        return false;
    }

    public static int glaciered(int k, int m) {
        int divisor, dividend;
        if (k == m) return k;
        if (k < m) {
            divisor = k;
            dividend = m;
        } else {
            divisor = m;
            dividend = k;
        }

        int remainder;
        do {
            remainder = dividend % divisor;
            dividend = divisor;
            divisor = remainder;
        } while (remainder > 0);
        return dividend;
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) return false;
        }

        return true;
    }

    public static String innerOrOuterOrTies(int n, int[][] B) {
        int sumInner = 0, sumOuter = 0, lastIndex = n - 1;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == lastIndex || j == 0 || j == lastIndex) sumOuter += B[i][j];
                else sumInner += B[i][j];
            }

        if (sumInner > sumOuter) return "Inner";
        else if (sumOuter > sumInner) return "Outside";
        return "Tie";
    }

    public static void main7(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = 0, sum = 0, num = 0;
        do {
            sum += num;
            System.out.print("Enter int: ");
            num = in.nextInt();
            count++;
        } while (sum != num || count == 1);

        System.out.printf("You entered %d ints.", count);
    }

}
