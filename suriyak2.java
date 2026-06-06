import java.util.Scanner;

class Rank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int s = sc.nextInt();

        int regno[] = new int[s];
        int marks[][] = new int[s][5];
        double avg[] = new double[s];

        for (int i = 0; i < s; i++) {
            System.out.print("Enter Reg.No of Student " + (i + 1) + ": ");
            regno[i] = sc.nextInt();

            int total = 0;
            System.out.println("Enter 5 subject marks:");

            for (int j = 0; j < 5; j++) {
                marks[i][j] = sc.nextInt();
                total += marks[i][j];
            }

            avg[i] = total / 5.0;
        }

        for (int i = 0; i < s - 1; i++) {
            for (int j = i + 1; j < s; j++) {
                if (avg[i] < avg[j]) {

                    double tempAvg = avg[i];
                    avg[i] = avg[j];
                    avg[j] = tempAvg;

                    int tempReg = regno[i];
                    regno[i] = regno[j];
                    regno[j] = tempReg;
                }
            }
        }

        System.out.println("\nRank\tReg.No\tAverage");

        for (int i = 0; i < s; i++) {
            System.out.printf("%d\t%d\t%.2f\n",
                    (i + 1), regno[i], avg[i]);
        }
    }
}
