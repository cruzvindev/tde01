package linguagemdeprogramacao;

public class Vendedor {

	private static String nome;
	private static int codigo;
	private static double comissao;
	private static String endreco;

	
	
	public Vendedor(String nome,int codigo,String endereco){
		this.endreco = endereco;
		this.codigo = codigo;
		Vendedor.nome = nome;
	}
	
	
	
	public static String getNome() {
		return nome;
	}
	public static void setNome(String nome) {
		Vendedor.nome = nome;
	}
	public static int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public static double getComissao() {
		return comissao;
	}
	public static void setComissao(double comissao) {
		Vendedor.comissao = comissao;
	}
	public String getEndreco() {
		return endreco;
	}
	public void setEndreco(String endreco) {
		this.endreco = endreco;
	}
	
	
	
}