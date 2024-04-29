import java.util.Scanner;

public class Visor {
   
    public Integer getOperacao(Scanner scanner){
        System.out.println("Selecione sua operação: \n1: Adição, 2: Subtração, 3: Divisão, 4: Multiplicação.");
        return scanner.nextInt();
    }

    public Integer getValor(Scanner scanner, String posicao){
        System.out.println("Digite o "+posicao+" valor: ");
        return scanner.nextInt();
    }

    /*
    public Integer getValor2(Scanner scanner){
        System.out.println("Digite o segundo valor: ");
        return scanner.nextInt();
    }*/

    public void mostraResultado(Integer resultado){
        System.out.println("O resultado é: "+ resultado);
    }
}
