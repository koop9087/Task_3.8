import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        StringBuilder stringBuilder = new StringBuilder(line);
        if(stringBuilder.reverse().toString().equals(line)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
