package chemger.java;

import java.util.Scanner;

public class Hangover {

    private static int MinimumRequirement(float c) {
        float sum = 0;
        int minimumRequirement = 0;
        while (sum < c) {
            minimumRequirement++;
            sum += 1 / minimumRequirement;
        }
        return minimumRequirement;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        float f = 0.00f;
        while ((scanner.nextFloat())!=0) {
            f = scanner.nextFloat();
            i = MinimumRequirement(f);
            System.out.println(i + "card(s)");
        }

    }
}
