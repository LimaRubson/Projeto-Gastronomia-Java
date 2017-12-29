package br.com.gastronomia.padrao;

public class Aplicacao {

	public static void main(String[] args) {
		
		RepositorioPedidosArrayList ArrayList = new RepositorioPedidosArrayList();
		
		Venda venda = new Venda("Rubson Lima", "18/12/2017", "15:00");
		Prato prato = new Prato(1, "TortaSalgada", "Ovos, farinha-de-trigo e frango", venda);
		PedidoAbstrato pedido = new Pedido(200, 4, prato, 100, 2);
		
		Venda venda1 = new Venda("Rubson Lima", "23/12/2017", "15:33");
		Prato prato1 = new Prato(1, "TortaDoce", "Ovos, farinha-de-trigo e chocolate", venda1);
		PedidoAbstrato pedido1 = new Pedido(2, 4, prato1, 100, 2);
		
		Fachada.getInstance().cadastrar(pedido);
		
		try {
			
			System.out.println("\nArquivo: " + Fachada.getInstance().procurar(pedido.getPrato().getNome()).getPrato().getNome());
	    
		} catch (PratoIndisponivelException e1) {
			
			// TODO Auto-generated catch block
			System.out.println(e1.getMessage());
			System.out.println("Pedido - Prato: ");
			e1.printStackTrace();
			
		}
	
		
		ArrayList.inserirPedido(pedido);
		
		System.out.println("\nArrayList: " + ArrayList.procurarPedido(pedido.getPrato().getNome()));
		
		ArrayList.removerPedido(pedido.getPrato().getNome());
		
		System.out.println("\nArrayList: " + ArrayList.procurarPedido(pedido.getPrato().getNome()));
		
		
		
        Fachada.getInstance().cadastrar(pedido1);
		
		try {
			
			System.out.println("\nArquivo: " + Fachada.getInstance().procurar("TortaDoce").getPrato().getNome());
		
		} catch (PratoIndisponivelException e) {
			
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			System.out.println("Pedido-Prato: ");
			
			e.printStackTrace();	
				
		}
	
		
		ArrayList.inserirPedido(pedido1);
		
		System.out.println("\nArrayList: " + ArrayList.procurarPedido(pedido1.getPrato().getNome()));
		
		ArrayList.removerPedido(pedido1.getPrato().getNome());
		
		System.out.println("\nArrayList: " + ArrayList.procurarPedido(pedido1.getPrato().getNome()));
		
		Fachada.getInstance().remover("TortaDoce");
		
		try {
			
			System.out.println("\nArquivo: " + Fachada.getInstance().procurar("TortaDoce").getPrato().getNome());
		
		} catch (PratoIndisponivelException e) {
			
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			System.out.println("Pedido-Prato: ");
			
			e.printStackTrace();	
				
		}

	}

}
