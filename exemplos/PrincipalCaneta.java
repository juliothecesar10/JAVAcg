package sef.module4.sample;

public class PrincipalCaneta {

	public static void main(String[] args) {
		Caneta5 canetaTipo = new Caneta5();
		canetaTipo.setCor("Azul");
		canetaTipo.setMarca("Bic");
		canetaTipo.setTampada(true);
		canetaTipo.setVazia(false);
		
//		canetaTipo.Exibir();

		Caneta5 canetaTipo2 = new Caneta5();
		canetaTipo2.setCor("Vermelha");
		canetaTipo2.setMarca("Bic");
		canetaTipo2.setTampada(true);
		canetaTipo2.setVazia(false);
		
		// canetaTipo2.Destampar();
		canetaTipo2.Riscar();
	}
}
