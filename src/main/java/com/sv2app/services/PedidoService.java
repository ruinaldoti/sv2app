package com.sv2app.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;






import com.sv2app.domain.Pedido;
import com.sv2app.repositories.PedidoRepository;
import com.sv2app.services.exceptions.ObjectNotFoundException;

@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository repo;
	
	public Pedido find(Integer id) {
		Optional<Pedido> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encobtrado! Id: " + id + ", Tipo: " + Pedido.class.getName()));

	}
	
	
}
