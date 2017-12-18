package br.com.gastronomia.padrao;

import java.util.ArrayList;

public interface RepositorioItensPedidos {
	
	public void inserir(PedidoAbstrato pedido);
	public void atualizar(PedidoAbstrato pedido);
	public PedidoAbstrato procurar(String nomePedido);
	public void remover(String nomePedido);


}
