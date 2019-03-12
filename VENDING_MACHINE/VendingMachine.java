package VendingMachine;

import java.util.List;

public class VendingMachine {

	private int qtdMaximaProduto;
	private double saldo = 0.0;

	private Produto espiral[][];

	public VendingMachine(int qtdEspiral, int qtdMaximaProduto) {
		
		setQtdMaximaProduto(qtdMaximaProduto);
		
		espiral = new Produto[qtdEspiral][3];
		for (int i = 0; i < espiral.length; i++) {
			for (int j = 0; j < 3; j++) {
				espiral[i][j] = new Produto();
			}
		}
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getQtdMaximaProduto() {
		return qtdMaximaProduto;
	}

	public void setQtdMaximaProduto(int qtdMaximaProduto) {
		this.qtdMaximaProduto = qtdMaximaProduto;
	}

	public void mostrar() {
		System.out.println("Saldo:" + saldo);
		for (int i = 0, j = 0; i < espiral.length; i++, j++) {

			System.out.println(j + "[" + espiral[i][j].getNomeProduto() + ": " + espiral[i][j].getQtd() + ": "
					+ espiral[i][j].getPreco() + " RS]");

		}
	}

	public void inserirProduto(Produto produto, int id) {

		  if(id < 0 || id > espiral.length){
	            System.out.println("ERRO: Indice invalido");
	        }else if(produto.getQtd() > this.qtdMaximaProduto){
	        		System.out.println(produto.getQtd());
	        		System.out.println(qtdMaximaProduto);
	        		System.out.println(id);
	                System.out.println("FAIL:limite excedido");
	        }else {
	        	for (int i = 0; i < produto.getQtd(); i++) {
	        		espiral[id][i] = produto;
				}
	        	
	        }

	}

	public void comprar(int id) {
		if (id < 0 || id > espiral.length) {
			System.out.println("ERRO: Indice invalido");
		} else {
			if (saldo < espiral[id][2].getPreco()) {
				System.out.println("ERRO Saldo insuficiente");
			} else if (espiral[id][1].getQtd() <= 0) {
				System.out.println("ERRO: Produto indisponivel");
			} else {
				System.out.println("Voce comprou " + espiral[id][0].getNomeProduto());
				System.out.println(espiral[id][0].getPreco());
				this.saldo -= espiral[id][0].getPreco();
			}
		}
	}


}
