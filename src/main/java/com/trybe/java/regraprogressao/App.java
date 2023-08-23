package com.trybe.java.regraprogressao;

import java.util.Scanner;


/**
 * App.
 */
public class App {

  /**
   * Metodo main.
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite a quantidade de atividades para cadastrar: ");
    int quantidade = scanner.nextInt();
    scanner.nextLine(); // Limpa o buffer após a leitura do número

    String[] nomesAtividades = new String[quantidade];
    int[] pesosAtividades = new int[quantidade];
    int[] notasObtidas = new int[quantidade];

    for (int i = 0; i < quantidade; i++) {
      System.out.print("Digite o nome da atividade " + (i + 1) + ": ");
      nomesAtividades[i] = scanner.nextLine();

      System.out.print("Digite o peso da atividade " + (i + 1) + ": ");
      pesosAtividades[i] = scanner.nextInt();
      scanner.nextLine(); // Limpa o buffer após a leitura do número

      System.out.print("Digite a nota obtida para " + nomesAtividades[i] + ": ");
      notasObtidas[i] = scanner.nextInt();
      scanner.nextLine(); // Limpa o buffer após a leitura do número
    }

    System.out.println("Resultados das atividades:");

    for (int i = 0; i < quantidade; i++) {
      System.out.println("Atividade " + (i + 1) + ": " + nomesAtividades[i]);
      System.out.println("Peso: " + pesosAtividades[i]);
      System.out.println("Nota obtida: " + notasObtidas[i]);
    }

    scanner.close();
  }

}