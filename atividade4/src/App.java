import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner a = new Scanner(System.in);
        float b1;
        float b2;
        float b3;
        float b4;
        System.out.printf("Nota do 1° bimestre: ");
        b1 = a.nextFloat();
        System.out.printf("Nota do 2° bimestre: ");
        b2 = a.nextFloat();
        System.out.printf("Nota do 3° bimestre: ");
        b3 = a.nextFloat();
        System.out.printf("Nota do 4° bimestre: ");
        b4 = a.nextFloat();
        System.out.println("A média de nota dos 4 bimestres é: " + ((b1+b2+b3+b4)/4));
    }
}
