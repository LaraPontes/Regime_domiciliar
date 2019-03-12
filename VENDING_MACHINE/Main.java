package VendingMachine;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   String comando = null;
           String nome = null;
           double preco = 0.0;
           int qtd,qtdEspiral,qtdMaximaProduto,id;
           Scanner ler = new Scanner(System.in);

           System.out.println("Digite o número de espirais e a quantidade maxima de produto");

           qtdEspiral = ler.nextInt();
           qtdMaximaProduto = ler.nextInt();
            VendingMachine maquina = new VendingMachine(qtdEspiral, qtdMaximaProduto);

            ler.nextLine();
           do{
               System.out.println("Digite um dos comandos: mostrar, remover, comprar, inserir produto, fim");
               //recebe o comando do usuario
               comando = ler.nextLine();
               //verifica se e um comando valido
                if(!comando.equals("mostrar")&&!comando.equals("remover")&&!comando.equals("comprar")&&
                  !comando.equals("fim")&&!comando.equals("inserir produto")){

                   System.out.println("Comando errado. Tente Novamente");
               }

               if(comando.equals("mostrar")){
                   maquina.mostrar();
               }

               if(comando.equals("inserir produto")){
                   //crio um objeto produto e recebo do usuario o preco e a quantidade
                   Produto produto = new Produto();
                   System.out.println("Digite o Nome");

                   nome = ler.nextLine();

                   System.out.println("Digite o preco do produto");
                   preco = ler.nextDouble();
                   
                   System.out.println("Digite a quantidade do produto");
                   qtd = ler.nextInt();
                   

                   System.out.println("Digite o saldo total");
                   maquina.setSaldo(ler.nextInt()); 
                   
                   
                   System.out.println("Digite o espiral Desejado");
                   id = ler.nextInt();
                   ler.nextLine();
                   produto.setNomeProduto(nome);
                   produto.setPreco(preco);
                   produto.setQtd(qtd);
                   maquina.inserirProduto(produto, id);

               }
               //recebo o nome do produto e passo via String pro metodo cancelar
               if(comando.equals("remover")){
                   System.out.println("Digite o id do produto");
                   id = ler.nextInt();
                   //maquina.remover(id);
                   ler.nextLine();
               }
               
               if(comando.equals("comprar")){
                   System.out.println("Digite o espiral em que o produto se encontra");
                   id = ler.nextInt();
                   maquina.comprar(id);
                   ler.nextLine();
               }

           }while(!comando.equals("fim"));
       
   }

	}

