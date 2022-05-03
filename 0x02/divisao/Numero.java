package divisao;
public class Numero {
    public static void dividir(int a, int b) {
        int resultado = 0;
        try {
            resultado = (a / b);

        } catch (Exception ArithmeticException) {
            System.out.println("Nao eh possivel dividir por zero");
        } finally {
            System.out.printf("%d / %d = %d\n", a, b, resultado );
        }
    }
}
