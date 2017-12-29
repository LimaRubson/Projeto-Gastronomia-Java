package br.com.gastronomia.padrao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class RepositorioPedidosArquivo implements RepositorioItensPedidos {

	@Override
	public void inserirPedido(PedidoAbstrato pedido) {
		
		try(ObjectOutputStream oos = 
				new ObjectOutputStream(new FileOutputStream("C:/Users/rubson.lima/Desktop/ProjetoGastronomia/projeto-gastronomia-27-12-2017/pedido" + pedido.getPrato().getNome() + ".ser"))) {
			
			oos.writeObject(pedido);
			System.out.println("Done");
			
		} catch (Exception ex) {
			
			ex.printStackTrace();
			
		}
		
	}

	@Override
	public void atualizarPedido(PedidoAbstrato pedido) {
		
		try (ObjectOutputStream oos =
				new ObjectOutputStream(new FileOutputStream("C:/Users/rubson.lima/Desktop/ProjetoGastronomia/projeto-gastronomia-27-12-2017/pedido"+ pedido.getPrato().getNome() +".ser"))) {

			oos.writeObject(pedido);
			System.out.println("Done");

		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
	}

	@Override
	public PedidoAbstrato procurarPedido(String nomePedido) {
		
		PedidoAbstrato pedido = null;
		
		try (ObjectInputStream ois
				= new ObjectInputStream(new FileInputStream("C:/Users/rubson.lima/Desktop/ProjetoGastronomia/projeto-gastronomia-27-12-2017/pedido" + nomePedido +".ser"))) {

				pedido = (PedidoAbstrato) ois.readObject();

			} catch (Exception ex) {
				ex.printStackTrace();
			}

			return pedido;
		
	}

	@Override
	public void removerPedido(String nomePedido) {
		
			try{
	    		File file = new File("C:/Users/rubson.lima/Desktop/ProjetoGastronomia/projeto-gastronomia-27-12-2017/pedido"+ nomePedido +".ser");
	    		if(file.delete()){
	    			
	    			System.out.println(file.getName() + " foi deletado!");
	    			
	    		}else {
	    			
	    			System.out.println("A operação de remoção Falhou.");
	    			
	    		}
	    		
		   } catch(Exception e) {
			   
				e.printStackTrace();
				
		    }
		
		
	}

}
