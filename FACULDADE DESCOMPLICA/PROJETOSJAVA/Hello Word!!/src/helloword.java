import br.com.paulo.model.classeDeTeste;

public class helloword {
    public static int calcularValores(int nun1, int nun2) {
        return nun1 + nun2;
    }

    public static void main(String[] args) {
        classeDeTeste calculo = new classeDeTeste();
        int result = calculo.calcularValores(10, 6);
        System.out.println("O resultado é:" + result);
    }
}
