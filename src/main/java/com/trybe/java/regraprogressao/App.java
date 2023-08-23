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
    System.out.print("Digite a quantidade de atividades para cadastrar:");
    String quantidadeString = scanner.next();
    int quantidadeNum = Integer.parseInt(quantidadeString);
    for (int i = 1; i <= quantidadeNum; i++) {
      System.out.println("Digite o nome da atividade " + i + ":");
      String nomeAtividade = scanner.next();
      System.out.println("Digite o peso da atividade " + i + ":");
      String pesoAtividade = scanner.next();
    }
  }

}