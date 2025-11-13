public class CalcPi {
    public static void main(String [] args) { 
        System.out.println("pi according to Java: " + Math.PI);
        int numOfTerms = Integer.parseInt(args[0]);
        double sum = 0.0;
        for (int i = 1; i <= numOfTerms; i++){
            double denominator = 2 * i - 1;
            if (i %2 !=0) {
                sum += (1.0 / denominator);  
            } else {
                sum -= (1.0 / denominator); 
            }
        }  
        System.out.println("pi, approximated:     " + sum * 4);
    }
}