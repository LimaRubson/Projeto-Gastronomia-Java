package br.com.gastronomia.padrao;

import java.io.Serializable;

public class Pedido extends PedidoAbstrato implements Serializable {

	public Pedido(double valorTotalPedidos, int quantidadePrato, Prato prato, double valorTotal,
			int quantidadeItensPedidos) {
		super(valorTotalPedidos, quantidadePrato, prato, valorTotal, quantidadeItensPedidos);
		// TODO Auto-generated constructor stub
	}

	

	
	
	
}
