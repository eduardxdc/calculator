/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Visor {

    public Integer getOperacao(Scanner scanner) {
        System.out.println("Digite 1 para adição ,"
                + "2 para subtração,"
                + " 3 para divisão, 4 para  multiplicação");
        return scanner.nextInt();
    }

    public Integer getValor(Scanner scanner, String posicao) {
        System.out.println("Digite o "+posicao+" valor");
        return scanner.nextInt();
    }
//
//    public Integer getValor2(Scanner scanner) {
//          System.out.println("Digite o segundo valor");
//        return scanner.nextInt();
//    }
    
    public void mostraResultado(Integer resultado){
        System.out.println("O resultado é "+ resultado);
    }

}
