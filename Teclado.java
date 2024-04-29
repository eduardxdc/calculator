import java.util.Scanner;

public class Teclado {
    
    private Visor visor = new Visor();
    private Processador calculo;

    private int valor1 = 0;
    private int valor2 = 0;

    public void iniciaCalculadora(){

        Scanner scanner = new Scanner(System.in);

        int operacao = 0;
        
        operacao = visor.getOperacao(scanner);

        calculo = new Processador();

        int resultadoVisor = 0;

        switch(operacao){
            case 1:
            // pedir os valores para a adição;
            getValores(scanner);
            resultadoVisor = calculo.adicao(valor1, valor2);
            visor.mostraResultado(resultadoVisor);
            break;

            case 2:
            // pedir os valores para a subtração;
            getValores(scanner);
            resultadoVisor = calculo.subtracao(valor1, valor2);
            visor.mostraResultado(resultadoVisor);
            break;

            case 3:
            // pedir os valores para a divisão;
            getValores(scanner);
            resultadoVisor = calculo.divisao(valor1, valor2);
            visor.mostraResultado(resultadoVisor);
            break;

            case 4:
            // pedir os valores para a multiplicação;
            getValores(scanner);
            resultadoVisor = calculo.multiplicacao(valor1, valor2);
            visor.mostraResultado(resultadoVisor);
            break;
        }

        scanner.close();
    }

    public void getValores(Scanner scanner) {
        valor1 = visor.getValor(scanner, "primeiro");
        valor2 = visor.getValor(scanner, "segundo");
    }
}
