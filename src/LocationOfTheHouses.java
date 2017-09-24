import java.util.Scanner;

public class LocationOfTheHouses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the ground area: ");
        int e = scanner.nextInt();
        System.out.println("Enter the width of the ground area: ");
        int f = scanner.nextInt();
        System.out.println("Enter the length of the first house: ");
        int a = getSize(e, f);
        if (a == 0) {
            return;
        }
        System.out.println("Enter the width of the first house: ");
        int b = getSize(e, f);
        if (b == 0) {
            return;
        }
        System.out.println("Enter the length of the second house: ");
        int c = getSize(e, f);
        if (c == 0) {
            return;
        }
        if (e > f) {
            if  (((c + a > e) && (c > f)) && ((c + b > e) && (c > f))) {
                System.out.println("The houses will not fit on the ground area!");
                return;
            }
        } else {
            if (((c + a > f) && (c > e)) && ((c + b > f) && (c > e))) {
                System.out.println("The houses will not fit on the ground area!");
                return;
            }
        }
        System.out.println("Enter the width of the second house: ");
        int d = getSize(e, f);
        if (d == 0) {
            return;
        }
        if (e > f) {
            if ((((a + c > e) || (c > f)) && ((d + a > e) || (d > f))) || (((b + c > e) || (c > f)) && ((d + b > e) || (d > f)))) {
                System.out.println("The houses will not fit on the ground area!");
                return;
            }
        } else {
            if ((((a + c > f) || (c > e)) && ((d + a > f) || (d > e))) || (((b + c > f) || (c > e)) && ((d + b > f) || (d > e)))) {
                System.out.println("The houses will not fit on the ground area!");
                return;
            }
        }
        System.out.println("FIT!!!");
    }

    public static int getSize (int e, int f) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        if ((size > e && size > f) || size < 0) {
            System.out.println("The houses will not fit on the ground area!");
            return 0;
        }
        return size;
    }
}
