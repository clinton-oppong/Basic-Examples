public class Main {
    public static void main(String[] args) {
        //test cases
        printConversion(75.114);
        printConversion(10.25);
        printConversion(-5.6);
        printConversion(25.42);

        System.out.println("\n");

        //test cases
        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(-1024);
        printMegaBytesAndKiloBytes(5000);
        printMegaBytesAndKiloBytes(3180);

        System.out.println("\n");

        //test cases
        shouldWakeUp(true, 1);
        shouldWakeUp(false, 2);
        shouldWakeUp(true, 8);
        shouldWakeUp(true, 23);

        System.out.println("\n");

        //test case
        printDayOfTheWeek(-1);
        printDayOfTheWeek(4);
        printDayOfTheWeek(3);
        printDayOfTheWeek(1);

        System.out.println("\n");

        //test case
        //program returns the sum of the odd numbers between a given range or -1 if the input is invalid
        System.out.println(sumOdd(1, 100));
        System.out.println(sumOdd(-1, 100));
        System.out.println(sumOdd(100, 100));
        System.out.println(sumOdd(100, -100));
        System.out.println(sumOdd(100, 1000));
        System.out.println(sumOdd(10, 5));

        System.out.println("\n");

        System.out.println(" the sum of digits is " + sumDigit(125));
        System.out.println(" the sum of digits is " + sumDigit(-111));

        System.out.println("\n");

        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(112212));

    }

    public static long toMilesPerHours(double kilometerPerHour) {
        if (kilometerPerHour < 0) {
            return -1;
        }
        long MilePerHour = Math.round(kilometerPerHour / 1.609);
        return MilePerHour;
    }

    public static void printConversion(double kilometerPerHour) {
        if (kilometerPerHour < 0) {
            System.out.println("invalid");
        } else {
            long MilePerHour = toMilesPerHours(kilometerPerHour);
            System.out.println(kilometerPerHour + " km/h = " + MilePerHour + " m/hr");

        }
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("invalid");
        } else {
            int answer = (kiloBytes / 1024);
            int remainingKiloBytes = (kiloBytes % 1024);
            System.out.println(kiloBytes + " KB = " + answer + " MB and " +
                    remainingKiloBytes + " KB");
        }
    }

    //#TODO INEFFICIENT
    //#TODO: make it better when you get the time
    public static boolean shouldWakeUp(boolean wakeup, int HourOfDay) {
        if (HourOfDay < 0 || HourOfDay > 23) {
            System.out.println("false");
            return false;
        } else if (!wakeup) {
            System.out.println("false");
            return false;
        } else if (HourOfDay >= 8 && HourOfDay <= 22) {
            System.out.println("false");
            return false;
        } else
            System.out.println("true");
        return true;
    }

    //TODO: STUDY IS TOOK LONGER THAN EXPECTED
    public static boolean IsLeapYear(int year) {
        boolean leap = true;
        if (year <= 1 || year >= 9999) {
            return false;
        }
        if (year % 4 == 0) {

            if (year % 100 == 0) {

                if (year % 400 == 0)

                    return leap = true;
                else
                    return false;
            } else
                return true;
        } else {
            return false;
        }

    }

//# TODO: this work but  I can do way better!!
    public static int getDaysinMonths(int month, int year) {

        boolean leapYear = IsLeapYear(year);

        if (month < 1 || month > 12) {
            return -1;
        } else if ((month == 2) && (leapYear == true)) {
            return 29;
        } else if (leapYear == false){
            switch (month){
                case 2:
                    //System.out.println("28");
                    return 28;
                default:
                    //System.out.println("31");
                    return 31;
            }
        }
        return month;
    }

    public static boolean checker(int first, int second, int sum) {
        if ((first + second) == sum) {
            return true;
        }
        return false;
    }

    public static boolean hasTeen(int first, int second, int sum) {
        if ((13 <= first && first <= 19) || (13 <= second && second <= 19) || (13 <= sum && sum <= 19)) {
            return true;
        }
        return false;
    }

    public static boolean isTeen(int age) {
        if (13 <= age && age <= 19) {
            return true;
        }
        return false;
    }

//# DAY OF THE WEEK CHALLENGE
    public static void printDayOfTheWeek( int day){
        switch (day){
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wensenday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("invalid");
        }
    }

    public static boolean isOdd(int n) {
        if ((n % 2 != 0) && (n > 0)) {
            return true;
        }
        return false;
    }

    public static int sumOdd(int start, int end) {
        int sum1 = 0;
        if (start > 0 && end > 0 && end >= start) {
            for (int i = start; i <= end; i++) {

                if (isOdd(i)) {
                    sum1 += i;
                }
            }
            return sum1;
        } else {
            return -1;
        }
    }

//# TODO: learn how to complete a for loop statement
/*        int sumOfTheOddNumbers = 0;
        if (start > 0 && end > 0 && end >= start) {
            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    sumOfTheOddNumbers = sumOfTheOddNumbers + i;
                }
            }
            return sumOfTheOddNumbers;
        } else {
            return -1;
        }
    }
*/


    public static int sumDigit(int number){
        if (number < 0 || number <= 10) {
            return -1;
        }

        int sum = 0;

        while (number > 0){
            int digit = number % 10; //it extracts the least-significat number
            sum += digit;

            number /= 10; // number = number / 10;

        }

        return sum;

    }
// todo: try and understand and do it again
//    public static boolean isPalindrome(int number) {
//        int reverseNum = 0;
//        int temp = number;
//        while (number != 0) {
//            int lastDigit = number % 10;
//            reverseNum = reverseNum * 10 + lastDigit;
//            number = number / 10;
//        }
//        if (reverseNum == temp) {
//            return true;
//        }
//        return false;
//    }

// this worked
    public static boolean isPalindrome(int n){
        int r, sum = 0, temp;
        temp = n;
        while (n>0){
            r = n % 10;
            sum = (sum * 10) + r;
            n = n/ 10;
        }
        if (n < 0)
            return true;

        if (temp == sum)
            return true;
        else
            return false;
    }

    public static int sumFirstAndLastDigit(int n) {
        int last = n % 10;
        int totalVal = 0;
        int sum = 0;

        if (n < 0)
            return  -1;

        while (n != 0) {
            int first = n % 10;
            n /= 10;
            sum = first + last;
        }

        return sum;


    }

    public static int getEvenDigitSum(int number) {

        int total = 0;

        if(number >= 0) {

            while (number != 0){
                int even = number % 10;

                if (even % 2 == 0) {
                    total += even;
                }

                number /= 10;
            }

            return total;
        }

        return -1;
    }

    public static boolean hasSharedDigit(int first, int last) {
        if ((-99 >= first) || (10 >= first))
            return false;
        while (first <= 10) {
            int firstNum = first % 10;
            int flastNum = first % 10;
            int lFirstNum = last % 10;
            int lastNum = last % 10;
            first /= 10;
            last /= 10;
            if ((lastNum == firstNum) || (flastNum == lFirstNum)) {
                return true;
            }

        }
        return false;
    }
}


