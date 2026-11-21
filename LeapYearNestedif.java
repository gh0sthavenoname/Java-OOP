public class LeapYearNestedIf {
public static void main(String[] args) {
int year = 2022;

if (year % 4 == 0) {
        if (year % 100 == 0) {
            if (year % 400 == 0) {
                System.out.println("Високосный год");
            } else {
                System.out.println("Невисокосный год");
            }
        } else {
            System.out.println("Високосный год");
        }
    } else {
        System.out.println("Невисокосный год");
    }
}
}
    