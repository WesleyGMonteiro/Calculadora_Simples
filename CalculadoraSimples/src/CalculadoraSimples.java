import java.util.Scanner;

public class CalculadoraSimples {
    public static float entradaDados() {
        System.out.println("*-* Entrada de Dados *-*");
        Scanner input = new Scanner(System.in);
        System.out.println("Número: ");
        float n = input.nextFloat();
        return n;
    }
    public static int menu(){
        System.out.println("*- MENU -*");
        Scanner input = new Scanner(System.in);
        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Divisão");
        System.out.println("4 - Multiplicação");
        System.out.println("Opção: ");
        int op = input.nextInt();
        return op;
    }
    public static float adicao(float n1, float n2){
        System.out.println("*- Adição -*");
        return n1 + n2;    
    }
    public static float subtracao(float n1, float n2){
        System.out.println("*- Subtração -*");
        return n1 - n2;
    }
    public static float multiplicacao(float n1, float n2){
        System.out.println("*- Multiplicação -*");
        return n1 * n2;
    }
    public static float divisao(float n1, float n2){
        System.out.println("*- Divisão -*");
        return n1 / n2;
    }
    public static void imprimirResultado(float r){
        System.out.println("*- Imprimir Resultado -*");
        System.out.println("Resultado: " + r);
    }
    public static float controlador(float n1, float n2, int op){
        System.out.println("*- Controlador -*");
        float resultado;
        switch (op){
            case 1:
                resultado = adicao(n1, n2);
                break;
            case 2:
                resultado = subtracao(n1, n2);
                break;
            case 3:
                resultado = divisao(n1, n2);
                break;
            case 4:
                resultado = multiplicacao(n1, n2);
                break;
            default:
                resultado = 0;
                break;
        }
        return resultado;
    }
    public static void main(String[] args) {
        int op = menu();
        float n1 = entradaDados();
        float n2 = entradaDados();
        float resultado = controlador(n1, n2, op);
        imprimirResultado(resultado);
    }
}
