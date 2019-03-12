package Cinema;
import java.util.ArrayList;
import java.util.Scanner;


	public class Cinema {
	    //vetor que vai possuir a lista das pessoas
	    private Cliente[] cadeiras;
	    
	    //construtor chamado na cricao do objeto exijindo o numero de cadeiras
	    Cinema(int qtdCadeiras){
	        //definindo o tamanho do vetor sendo o mesmo valor da quantidade de cadeiras
	       this.cadeiras = new Cliente [qtdCadeiras];
	       
	       //colocando um objeto cliente dentro de cada posicao do vetor
	       //obs:Objeto cliente e inicializado com todos os valores sendo aspas vazias ""
	       for(int i=0;i<this.cadeiras.length;i++){
	             
	            this.cadeiras[i]= new Cliente();
	           
	       } 
	    }
	    

	    
	    //metodo que lista as cadeiras do cinema
	    public void show(){
	        System.out.print("[");
	        for(int i=0; i<cadeiras.length;i++){
	            //verifica se na posicao atual(i) do vetor existe um objeto cliente com valores "nulos"/vazios, se sim imprimi - se nao imprime cliente
	            if(cadeiras[i].nome.equals("")){
	                System.out.print(" - ");
	            }else{
	                System.out.print(cadeiras[i].nome+":"+cadeiras[i].telefone);
	            }
	        }
	        System.out.println("]");
	    }
	    //metodo que faz reserva, recebe como paramento um objeto do tipo cliente e um inteiro referente a cadeira que deseja reservar
	    public void reservar(Cliente cliente, int id){
	        //variavel que avisa ou nao se existe cliente na cadeira selecionada
	        int existe=0;
	        for(int i=0;i<cadeiras.length;i++){
	            //percorre todo o vetor para conferir se uma pessoa com o mesmo nome ja existe no cinema
	            if(cadeiras[i].getNome().equals(cliente.getNome())){
	                existe=1;
	                break;
	            }
	            
	        }
	        
	        //verifica se existe esta valor 1 ou nao se existe nao mudou de valor quer dizer que nao existe uma segunda pessoa com o mesmo nome
	        if(existe==0){
	            //verifica se existe alguem na cadeira desejada
	            if(cadeiras[id].getNome().equals("")){
	                cadeiras[id]=cliente;
	            }else{
	                System.out.println("ERROR: Assento já reservado");
	            }
	            
	        }else{
	            System.out.println("ERROR: Esse Cliente Já está aqui");
	        }
	    }
	    
	    public void cancelar(String cliente){
	        //variavel que avisa se o cliente foi removido ou nao
	        int removeu=0;
	        for(int i=0; i<cadeiras.length; i++){
	            //percorro o vetor para tentar ver se o nome do cliente existe na lista de clientes, se sim, remove o cliente e muda valor de remover pra 1 
	            if(cadeiras[i].getNome().equals(cliente)){
	                cadeiras[i].nome = "";
	                cadeiras[i].telefone = "";
	                removeu=1;
	            }
	        }
	        // se remover continuar como zero quer dizer que o cliente passado como parametro ja tinha sido removido antes
	        if(removeu==0){
	            System.out.println("ERROR: Cliente Não está no cinema");
	        }
	    }
	    
} 
	

