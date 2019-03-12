package VendingMachine;

public class Produto {
	  private String nomeProduto="Empty";
      private Double preco=0.0;
      private int qtd=0;

      public String getNomeProduto() {
          return nomeProduto;
      }

      public void setNomeProduto(String nomeProduto) {
          this.nomeProduto = nomeProduto;
      }

      public Double getPreco() {
          return preco;
      }

      public void setPreco(Double preco) {
          this.preco = preco;
      }

      public int getQtd() {
          return qtd;
      }

      public void setQtd(int qtd) {
          this.qtd = qtd;
      }

}
