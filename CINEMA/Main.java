package Cinema;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int qtdCadeiras;
        int id;
        
        String comando = null;
        String nome = null;
        String telefone = null;
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite o número de cadeiras");
        
        qtdCadeiras = ler.nextInt();
        //criando um objeto cinema passando como paramentro no construtor a quantidade de cadeiras
        Cinema sala = new Cinema(qtdCadeiras);
        ler.nextLine();
        do{
            System.out.println("Escolha um dos comandos: mostrar, reservar, cancelar ou fim");
            //recebe o comando do usuario
            comando = ler.nextLine();
            //verifica se e um comando valido
             if(!comando.equals("mostrar")&&!comando.equals("reservar")&&!comando.equals("cancelar")&&
               !comando.equals("fim")){

                System.out.println("Comando errado. Tente Novamente");
            }

            if(comando.equals("mostrar")){
                sala.show();
            }
            
            if(comando.equals("reservar")){
                //crio um objeto cliente e recebo do usuario o nome telefone e a cadeira desejada
                Cliente cliente = new Cliente ();
                System.out.println("Digite o Nome");
                
                nome = ler.nextLine();
                
                System.out.println("Digite o Telefone Do Cliente");
                telefone = ler.nextLine();
                
                System.out.println("Digite o Assento Desejado");
                id = ler.nextInt();
                ler.nextLine();
                cliente.setNome(nome);
                cliente.setTelefone(telefone);
                //chamo o metodo reservar que faz toda a verificacao necessaria
                sala.reservar(cliente, id);
                
            }
            //recebo o nome do cliente e passo via String pro metodo cancelar
            if(comando.equals("cancelar")){
                System.out.println("Digite o Nome Do Cliente");
                nome = ler.nextLine();
                sala.cancelar(nome);
                
            }
            
        }while(!comando.equals("fim"));


	}

}
