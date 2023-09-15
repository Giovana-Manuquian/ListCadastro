package br.senai.sp.model;

import java.util.Scanner;

public class Produto {
    Scanner teclado = new Scanner(System.in);
    String nome;
    double preco;
    int quantidadeEstoque;

    public void adicionarProduto() {
        System.out.print("Nome do produto: ");
        nome = teclado.nextLine();
        System.out.print("Preço: ");
        preco = teclado.nextDouble();
        System.out.print("Quantidade em estoque: ");
        quantidadeEstoque = teclado.nextInt();
    }
}
