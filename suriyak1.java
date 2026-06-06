import java.util.Scanner;
public class suriyak1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the name: ");
        String name = sc.nextLine().toUpperCase();

        System.out.print("Enter size: ");
        int size = sc.nextInt();
        int mid = size / 2;

        System.out.println();

        for (int i = 0; i < size; i++) {
            for (int k = 0; k < name.length(); k++) {
                char ch = name.charAt(k);
                printCharRow(ch, i, size, mid);
                System.out.print("  "); 
            }
            System.out.println();
        }
    }
    public static void printCharRow(char ch, int i, int size, int mid) {
        for (int j = 0; j < size; j++) {
            boolean isPattern = false;

            switch (ch) {
                case 'A':
                    isPattern = ((j == 0 || j == size - 1) && i > 0) || i == mid || (i == 0 && j > 0 && j < size - 1);
                    break;
                case 'B':
                    isPattern = j == 0 || (i == 0 || i == mid || i == size - 1) && j < size - 1 || (j == size - 1 && i != 0 && i != mid && i != size - 1);
                    break;
                case 'C':
                    isPattern = (j == 0 && i > 0 && i < size - 1) || ((i == 0 || i == size - 1) && j > 0);
                    break;
                case 'D':
                    isPattern = j == 0 || ((i == 0 || i == size - 1) && j < size - 1) || (j == size - 1 && i > 0 && i < size - 1);
                    break;
                case 'E':
                    isPattern = j == 0 || i == 0 || i == mid || i == size - 1;
                    break;
                case 'F':
                    isPattern = j == 0 || i == 0 || i == mid;
                    break;
                case 'G':
                    isPattern = (j == 0 && i > 0 && i < size - 1) || ((i == 0 || i == size - 1) && j > 0) || (i >= mid && j == size - 1) || (i == mid && j >= mid);
                    break;
                case 'H':
                    isPattern = j == 0 || j == size - 1 || i == mid;
                    break;
                case 'I':
                    isPattern = i == 0 || i == size - 1 || j == mid;
                    break;
                case 'J':
                    isPattern = i == 0 || (j == mid && i < size - 1) || (i == size - 1 && j < mid && j > 0) || (i == size - 1 - 1 && j == 0 && i >= mid);
                    break;
                case 'K':
                    isPattern = j == 0 || (i < mid && j == size - 1 - i) || (i >= mid && j == i);
                    break;
                case 'L':
                    isPattern = j == 0 || i == size - 1;
                    break;
                case 'M':
                    isPattern = j == 0 || j == size - 1 || (i <= mid && (j == i || j == size - 1 - i));
                    break;
                case 'N':
                    isPattern = j == 0 || j == size - 1 || j == i;
                    break;
                case 'O':
                    isPattern = (j == 0 && i > 0 && i < size - 1) || (j == size - 1 && i > 0 && i < size - 1) || ((i == 0 || i == size - 1) && j > 0 && j < size - 1);
                    break;
                case 'P':
                    isPattern = j == 0 || (i == 0 || i == mid) && j < size - 1 || (j == size - 1 && i > 0 && i < mid);
                    break;
                case 'Q':
                    isPattern = ((j == 0 || j == size - 2) && i > 0 && i < size - 2) || ((i == 0 || i == size - 2) && j > 0 && j < size - 2) || (i >= mid && j == i);
                    break;
                case 'R':
                    isPattern = j == 0 || (i == 0 || i == mid) && j < size - 1 || (j == size - 1 && i > 0 && i < mid) || (i > mid && j == i);
                    break;
                case 'S':
                    isPattern = i == 0 || i == mid || i == size - 1 || (i < mid && j == 0) || (i > mid && j == size - 1);
                    break;
                case 'T':
                    isPattern = i == 0 || j == mid;
                    break;
                case 'U':
                    isPattern = ((j == 0 || j == size - 1) && i < size - 1) || (i == size - 1 && j > 0 && j < size - 1);
                    break;
                case 'V':
                    isPattern = (i < mid && (j == 0 || j == size - 1)) || (i >= mid && (j == i - mid || j == size - 1 - (i - mid)));
                    break;
                case 'W':
                    isPattern = j == 0 || j == size - 1 || (i >= mid && (j == i || j == size - 1 - i));
                    break;
                case 'X':
                    isPattern = j == i || j == size - 1 - i;
                    break;
                case 'Y':
                    isPattern = (i < mid && (j == i || j == size - 1 - i)) || (i >= mid && j == mid);
                    break;
                case 'Z':
                    isPattern = i == 0 || i == size - 1 || j == size - 1 - i;
                    break;
                case '.':
                    isPattern = (i == size - 1 && j == mid);
                    break;
                default:
                    isPattern = false;
                    break;
            }

            if (isPattern) {
                System.out.print("#");
            } else {
                System.out.print(" ");
            }
        }
    }
}
