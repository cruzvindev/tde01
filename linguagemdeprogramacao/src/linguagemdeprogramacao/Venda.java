package linguagemdeprogramacao;

public class Venda {

	private int produto = Produto.getCodigo();
	private String vendedor = Vendedor.getNome();
	public static double desconto;
	private int quantidadeItens;
	public double valor;
	
	
	public int getProduto() {
		return produto;
	}
	public String getVendedor() {
		return vendedor;
	}
	public int getQuantidadeItens() {
		return quantidadeItens;
	}
	public void setQuantidadeItens(int quantidadeItens) {
		this.quantidadeItens = quantidadeItens;
	}
	

	public static void efetuarDesconto(double desconto) {
		double resultado = Produto.getValorVenda() - ((desconto / 100) * Produto.getValorVenda());
		if(resultado > Produto.getValorCusto()) {
			Venda.desconto = (desconto / 100) * Produto.getValorVenda();
		}
		else {
			Venda.desconto = 0;
		}
	}
	
	public double calcularValor() {
		this.valor = this.quantidadeItens * Produto.getValorVenda();
		if(Produto.isPromocao() == true) {
			return this.valor - (Venda.desconto * getQuantidadeItens());
		}
		else {
			return this.valor;
		}
	}
	
	public double calcularComissao() {
		if(Produto.isPromocao() == true) {
			return ((Vendedor.getComissao() / 2) / 100) * this.valor;
		}
		else {
			return (Vendedor.getComissao() / 100) * this.valor;
		}
	}
	
	public void imprimir() {
		System.out.println("** VENDEDOR: **");
		System.out.printf("C?digo: %d\n", Vendedor.getCodigo());
		System.out.printf("Nome: %s\n", Vendedor.getNome());
		System.out.printf("Comiss?o: %.2f\n", calcularComissao());
		System.out.println("** PRODUTO: **");
		System.out.printf("Quantidade de itens: %d\n", this.quantidadeItens);
		System.out.printf("C?digo: %d\n", Produto.getCodigo());
		System.out.printf("Descri??o: %s\n", Produto.getDescricao());
		System.out.printf("Valor do produto: %.2f\n", Produto.getValorVenda());
		System.out.println("Produto est? na promo??o: " + Produto.isPromocao());
		System.out.printf("Valor do desconto: %.2f\n", (Venda.desconto) * getQuantidadeItens());
		System.out.printf("VALOR TOTAL: %.2f\n", calcularValor());
	}
}
	
	
	
 