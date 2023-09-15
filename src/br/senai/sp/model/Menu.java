package br.senai.sp.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {

    Scanner teclado = new Scanner(System.in);
    List<Produto> listProduto = new ArrayList<>();
    Produto produto = new Produto();
    public void exibirMenu(){

        boolean continuar = true;

        while (continuar) {

            System.out.println("Digite a opção para seguirmos: \n" +
                    "1- Adicionar Produto\n" +
                    "2- Listar Produtos\n" +
                    "3- Sair\n" +
                    "Opção: "
            );

            int opcaoUsuario = teclado.nextInt();
            teclado.nextLine();

            switch (opcaoUsuario) {

                case 1:
                    Produto produto = new Produto();
                    produto.adicionarProduto();
                    adicionarProduto(produto);
                    System.out.println(listProduto.size());
                    break;
                case 2:
                    listarProdutos();
                    break;
                case 3:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

    }
    public void adicionarProduto(Produto produto){
        listProduto.add(produto);
        produto = new Produto();
    }

    public void listarProdutos(){
        for (Produto produto: listProduto){
            System.out.println("Nome do produto: " + produto.nome);
            System.out.println("Preço do produto: R$" + produto.preco);
            System.out.println("Quantidade em estoque: " + produto.quantidadeEstoque);
        }
    }

}
