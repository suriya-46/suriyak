import java.util.Scanner;

public class suriyak4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of passengers: ");
        int n = sc.nextInt();

        int totalAmount = 0;

        for (int i = 1; i <= n; i++) {

            System.out.println("\nPassenger " + i);

            System.out.print("Enter boarding stop: ");
            int start = sc.nextInt();

            System.out.print("Enter destination stop: ");
            int end = sc.nextInt();

            int fare = (end - start) * 5;
            totalAmount += fare;

            System.out.println("Boarded at Stop : " + start);
            System.out.println("Dropped at Stop : " + end);
            System.out.println("Ticket Amount : Rs." + fare);
        }

        System.out.println("\nTotal Passengers : " + n);
        System.out.println("Total Collection : Rs." + totalAmount);
    }
}