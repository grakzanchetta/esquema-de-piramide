import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Tamanho da base da pirâmide?");
        int valor = myObj.nextInt();

        for (int i = 1; i <= valor; i++) {
            String linha = "";
            for (int j = 1; j <= i; j++) {
                linha += i;
            }
            System.out.println(linha);
        }

    }
}
