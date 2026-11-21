public class SquareRoot { 
 static double squareRoot(double a) {
    double x = 1;
    double oldX;

    do {
        oldX = x;
        x = (x + a / x) / 2;
    } while (oldX != x);

    return x;
}

public static void main(String[] args) {
    double a = 2021;
    double x = squareRoot(a);

    System.out.println(x);
    System.out.println(x * x);
}
}