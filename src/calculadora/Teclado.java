package calculadora;

import java.util.HashMap;
import java.util.Scanner;

public class Teclado {

    private Visor visor = new Visor();
    private ProcessarCalculo calculo;
    private int valor1 = 0;
    private int valor2 = 0;

    public void iniciaCalculadora() {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            int operacao = visor.getOperacao(scanner);

            calculo = new ProcessarCalculo();

            int resultadoVisor = 0;

            HashMap<Integer, Integer> escolhaOperacoes = new HashMap<Integer, Integer>();
            getValores(scanner);
            escolhaOperacoes.put(1, calculo.adicao(valor1, valor2));
            escolhaOperacoes.put(2, calculo.subtracao(valor1, valor2));
            escolhaOperacoes.put(3, calculo.divisao(valor1, valor2));
            escolhaOperacoes.put(4, calculo.multiplicacao(valor1, valor2));

            if (escolhaOperacoes.containsKey(operacao)) {
                resultadoVisor = escolhaOperacoes.get(operacao);
                visor.mostraResultado(resultadoVisor);
                break;
            } else {
                System.out.println("Operação inválida.");
            }
        }


    }


    public void getValores(Scanner scanner) {
        valor1 = visor.getValor(scanner, "primeiro");
        valor2 = visor.getValor(scanner, "segundo");
    }

    // Interface funcional para representar uma operação

}
