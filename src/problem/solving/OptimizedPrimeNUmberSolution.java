package problem.solving;

public class OptimizedPrimeNUmberSolution {
    public static void main(String[] args) {
        int counter = 0;
        for(int i=2; i<100; i++){
            if(i==2) {
                System.out.println(i);
            }else{
                if(isPrime(i)) {
                    counter++;
                    System.out.println(i);
                }else{
                    System.out.println("Non-Prime " + i);
                }
            }
        }
        System.out.println("Total Number of Prime Numbers so Far " + counter);
    }

    public static boolean isPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
