package linguagemdeprogramacao;


import java.util.Locale;
import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		char stop;
		int cont = 1;
		
		do {
			
			
			System.out.printf("CADASTRANDO PRODUTO N? %d:\n", cont);
			
			System.out.print("C?digo do produto: ");
			int codigoProduto = scan.nextInt();
			scan.nextLine();
			
			System.out.print("Descri??o do produto: ");
			String descricao = scan.nextLine();
			
			System.out.print("Valor de venda do produto: ");
			double valorProduto = scan.nextDouble();
			
			System.out.print("Valor de custo do produto: ");
			double valorCusto = scan.nextDouble();
			
			char decisao;
			while(true) {
				System.out.print("Produto est? na promo??o? [S/N]:");
				decisao = scan.next().toUpperCase().charAt(0);
				if((decisao != 'S') && (decisao != 'N')){
					System.out.print("ERRO, INSIRA UM CARACTER V?LIDO! ");
				}
				else {
					break;
				}
			}
			
			boolean promocao = true;
			double percentual = 0;
			if(decisao == 'S') {
				promocao = true;
				System.out.print("Percentual de desconto: ");
				percentual = scan.nextDouble();
			}
			else if(decisao == 'N') {
				promocao = false;
			}
			
			Produto produto = new Produto(codigoProduto, descricao, valorProduto, valorCusto, promocao);
			Venda.efetuarDesconto(percentual);

			//CADASTRO VENDA
			Venda venda = new Venda();
			
			System.out.print("Quantidade do produto no carrinho: ");
			int quantidade = scan.nextInt();
			scan.nextLine();
			venda.setQuantidadeItens(quantidade);
			
			
			System.out.println("---------------------------------------");
			System.out.printf("CADASTRANDO VENDEDOR N? %d:\n", cont);
			
			System.out.print("Nome: ");
			String nome = scan.nextLine();
			
			System.out.print("Endere?o: ");
			String endereco = scan.nextLine();
			System.out.print("");
			
			System.out.print("C?digo do vendedor: ");
			int codigoVendedor = scan.nextInt();
			
			System.out.print("Percentual de comiss?o: ");
			double comissao = scan.nextDouble();
			Vendedor.setComissao(comissao);
			
			Vendedor vendedor = new Vendedor(nome, codigoVendedor, endereco);
			
			
			System.out.println("-----------------------------------");
			venda.calcularValor();
			venda.imprimir();
			
		
			System.out.println("-----------------------------------");
			while(true) {
				System.out.print("Voc? deseja realizar um novo cadastro? [S/N]:");
				stop = scan.next().toUpperCase().charAt(0);
				if((stop != 'S') && (stop != 'N')){
					System.out.print("ERRO, INSIRA UM CARACTER V?LIDO! ");
				}
				else {
					break;
				}
			}

			cont++;
		}while(stop != 'N');
		
		
		
		scan.close();
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

