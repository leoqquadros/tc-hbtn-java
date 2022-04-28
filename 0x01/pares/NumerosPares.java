public class NumerosPares {
    public static void main(String[] args) {
        for (int i=0; i<100; i++){
            if ( i %2 == 0) {
                if (i != 98)
                System.out.printf("%d, ", i);
                else System.out.printf("%d\n", i);
            }
        }
    }
}
