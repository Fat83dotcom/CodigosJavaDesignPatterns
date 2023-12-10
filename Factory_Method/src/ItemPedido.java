public class ItemPedido {
  private Produto produto;
  private int quantidade;
  private int precoUnitarioCentavos;  

  public ItemPedido(Produto produto, int quantidade, int valorCentavos) {
    this.produto = produto;
    this.quantidade = quantidade;
    this.precoUnitarioCentavos = valorCentavos;
  }

  public int valor() {
    return this.quantidade * precoUnitarioCentavos;
  }

  public Produto geProduto() {
    return this.produto;
  }

  public void setProduto(Produto produto) {
    this.produto = produto;
  }

  public int getQuantidade() {
    return this.quantidade;
  }

  public void setQuantidade(int quantidade) {
    this.quantidade = quantidade;
  }

  public int getPrecoUnitarioCentavos() {
    return this.precoUnitarioCentavos;
  }

  public void setPrecoUnitarioCentavos(int precoUnitarioCentavos) {
    this.precoUnitarioCentavos = precoUnitarioCentavos;
  }
}
