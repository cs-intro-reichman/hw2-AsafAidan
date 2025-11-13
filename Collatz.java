public class Collatz {
    public static void main(String args[]) {
        int seed = Integer.parseInt(args[0]);
        String mode = args[1];
        int steps = 1;
        for (int i = 1; i <= seed; i++) {
            int currentTerm = i;
            steps = 1;
            if (mode.equals("v")) {
                System.out.print(currentTerm + " ");
            }
            do {
                if (currentTerm % 2 == 0) {
                    currentTerm /= 2;
                } else {
                    currentTerm = (currentTerm * 3) + 1;
                }
                steps++;

                if (mode.equals("v")) { 
                    System.out.print(currentTerm + " ");
                }
            } while (currentTerm != 1);
            if (mode.equals("v")) {
                System.out.println("(" + steps + ")");
            }
        }
        System.out.println("Every one of the first " + seed + " hailstone sequences reached 1.");

    }
}