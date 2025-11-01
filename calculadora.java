import java.sql.SQLOutput;
import java.util.Scanner;

public class calculadora {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        Double valorum, valordois;
        String operacao;

        System.out.println("Digite o primeiro valor: ");
        valorum = scanner.nextDouble();

        System.out.println("Digite a operação ( +, -, /, *): ");
        operacao = scanner.next();

        System.out.println("Digite o segundo valor: ");
        valordois = scanner.nextDouble();

        System.out.println("Resultado: " + realizarCalculo(valorum, valordois, operacao));
    }
    public static Double realizarCalculo(Double valorum, Double valordois, String operacao){
Double respostacalculo = 0.0;

        switch (operacao){
            case "+":
respostacalculo = valorum + valordois;
break;
            case "-":
                respostacalculo = valorum - valordois;
                break;
            case"*":
                respostacalculo = valorum * valordois;
                break;
            case "/":
                respostacalculo = valorum / valordois;
                break;

            default:
                System.out.println("Operação inválida");
        }
        return respostacalculo;
    }
    }
